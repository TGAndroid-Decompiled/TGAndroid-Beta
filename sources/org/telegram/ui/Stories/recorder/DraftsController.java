package org.telegram.ui.Stories.recorder;

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$InputPrivacyRule;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$StoryItem;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.StoryEntry;
public class DraftsController {
    public final int currentAccount;
    public final ArrayList<StoryEntry> drafts = new ArrayList<>();
    private File draftsFolder;
    private boolean loaded;
    private boolean loading;

    public DraftsController(int i) {
        this.currentAccount = i;
    }

    public void load() {
        if (this.loaded || this.loading) {
            return;
        }
        this.loading = true;
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DraftsController.this.lambda$load$1(messagesStorage);
            }
        });
    }

    public void lambda$load$1(org.telegram.messenger.MessagesStorage r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.DraftsController.lambda$load$1(org.telegram.messenger.MessagesStorage):void");
    }

    public void lambda$load$0(java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.DraftsController.lambda$load$0(java.util.ArrayList):void");
    }

    public void edit(StoryEntry storyEntry) {
        if (storyEntry == null) {
            return;
        }
        prepare(storyEntry);
        this.drafts.remove(storyEntry);
        this.drafts.add(0, storyEntry);
        final StoryDraft storyDraft = new StoryDraft(storyEntry);
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DraftsController.lambda$edit$2(MessagesStorage.this, storyDraft);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public static void lambda$edit$2(MessagesStorage messagesStorage, StoryDraft storyDraft) {
        SQLiteDatabase database;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                database = messagesStorage.getDatabase();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            if (database == null) {
                return;
            }
            sQLitePreparedStatement = database.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?)");
            sQLitePreparedStatement.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyDraft.getObjectSize());
            storyDraft.toStream(nativeByteBuffer);
            sQLitePreparedStatement.bindLong(1, storyDraft.id);
            sQLitePreparedStatement.bindLong(2, storyDraft.date);
            sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer);
            sQLitePreparedStatement.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatement.dispose();
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private void prepare(StoryEntry storyEntry) {
        if (storyEntry == null) {
            return;
        }
        storyEntry.draftDate = System.currentTimeMillis();
        storyEntry.isDraft = true;
        if (storyEntry.fileDeletable) {
            storyEntry.file = prepareFile(storyEntry.file);
        } else if (storyEntry.file != null) {
            File makeCacheFile = StoryEntry.makeCacheFile(this.currentAccount, storyEntry.isVideo);
            try {
                AndroidUtilities.copyFile(storyEntry.file, makeCacheFile);
                storyEntry.file = prepareFile(makeCacheFile);
                storyEntry.fileDeletable = true;
            } catch (IOException e) {
                FileLog.e(e);
            }
        }
        storyEntry.filterFile = prepareFile(storyEntry.filterFile);
        storyEntry.paintFile = prepareFile(storyEntry.paintFile);
        storyEntry.draftThumbFile = prepareFile(storyEntry.draftThumbFile);
    }

    private File prepareFile(File file) {
        if (file == null) {
            return null;
        }
        if (this.draftsFolder == null) {
            File file2 = new File(FileLoader.getDirectory(4), "drafts");
            this.draftsFolder = file2;
            if (!file2.exists()) {
                this.draftsFolder.mkdir();
            }
        }
        if (!file.getAbsolutePath().startsWith(this.draftsFolder.getAbsolutePath())) {
            File file3 = new File(this.draftsFolder, file.getName());
            if (file.renameTo(file3)) {
                return file3;
            }
        }
        return file;
    }

    public void append(StoryEntry storyEntry) {
        if (storyEntry == null) {
            return;
        }
        prepare(storyEntry);
        storyEntry.draftId = Utilities.random.nextLong();
        StoryDraft storyDraft = new StoryDraft(storyEntry);
        this.drafts.remove(storyEntry);
        this.drafts.add(0, storyEntry);
        append(storyDraft);
    }

    private void append(final StoryDraft storyDraft) {
        String str;
        StringBuilder sb;
        long j;
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StoryDraft append ");
        sb2.append(storyDraft.id);
        sb2.append(" (edit=");
        sb2.append(storyDraft.edit);
        if (storyDraft.edit) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", storyId=");
            sb3.append(storyDraft.editStoryId);
            sb3.append(", ");
            if (storyDraft.editDocumentId != 0) {
                sb = new StringBuilder();
                sb.append("documentId=");
                j = storyDraft.editDocumentId;
            } else {
                sb = new StringBuilder();
                sb.append("photoId=");
                j = storyDraft.editPhotoId;
            }
            sb.append(j);
            sb3.append(sb.toString());
            sb3.append(", expireDate=");
            sb3.append(storyDraft.editExpireDate);
            str = sb3.toString();
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(", now=");
        sb2.append(System.currentTimeMillis());
        sb2.append(")");
        FileLog.d(sb2.toString());
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DraftsController.lambda$append$3(MessagesStorage.this, storyDraft);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public static void lambda$append$3(MessagesStorage messagesStorage, StoryDraft storyDraft) {
        SQLiteDatabase database;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                database = messagesStorage.getDatabase();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatement == null) {
                    return;
                }
            }
            if (database == null) {
                return;
            }
            sQLitePreparedStatement = database.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?)");
            sQLitePreparedStatement.requery();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyDraft.getObjectSize());
            storyDraft.toStream(nativeByteBuffer);
            sQLitePreparedStatement.bindLong(1, storyDraft.id);
            sQLitePreparedStatement.bindLong(2, storyDraft.date);
            sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer);
            sQLitePreparedStatement.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatement.dispose();
            sQLitePreparedStatement.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public void saveForEdit(StoryEntry storyEntry, long j, TLRPC$StoryItem tLRPC$StoryItem) {
        if (storyEntry == null || tLRPC$StoryItem == null || tLRPC$StoryItem.media == null) {
            return;
        }
        ArrayList<StoryEntry> arrayList = new ArrayList<>();
        Iterator<StoryEntry> it = this.drafts.iterator();
        while (it.hasNext()) {
            StoryEntry next = it.next();
            if (next.isEdit && next.editStoryId == tLRPC$StoryItem.id) {
                arrayList.add(next);
            }
        }
        delete(arrayList);
        prepare(storyEntry);
        storyEntry.draftId = Utilities.random.nextLong();
        StoryDraft storyDraft = new StoryDraft(storyEntry);
        storyEntry.isEdit = true;
        storyDraft.edit = true;
        storyEntry.editStoryPeerId = j;
        storyDraft.editStoryPeerId = j;
        int i = tLRPC$StoryItem.id;
        storyEntry.editStoryId = i;
        storyDraft.editStoryId = i;
        long j2 = tLRPC$StoryItem.expire_date * 1000;
        storyEntry.editExpireDate = j2;
        storyDraft.editExpireDate = j2;
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$StoryItem.media;
        TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
        if (tLRPC$Document != null) {
            long j3 = tLRPC$Document.id;
            storyEntry.editDocumentId = j3;
            storyDraft.editDocumentId = j3;
        } else {
            TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia.photo;
            if (tLRPC$Photo != null) {
                long j4 = tLRPC$Photo.id;
                storyEntry.editPhotoId = j4;
                storyDraft.editPhotoId = j4;
            }
        }
        this.drafts.remove(storyEntry);
        this.drafts.add(0, storyEntry);
        append(storyDraft);
    }

    public StoryEntry getForEdit(long j, TLRPC$StoryItem tLRPC$StoryItem) {
        TLRPC$MessageMedia tLRPC$MessageMedia;
        TLRPC$Document tLRPC$Document;
        if (tLRPC$StoryItem == null) {
            return null;
        }
        Iterator<StoryEntry> it = this.drafts.iterator();
        while (it.hasNext()) {
            StoryEntry next = it.next();
            if (next.isEdit && tLRPC$StoryItem.id == next.editStoryId && j == next.editStoryPeerId && ((tLRPC$Document = (tLRPC$MessageMedia = tLRPC$StoryItem.media).document) == null || tLRPC$Document.id == next.editDocumentId)) {
                TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia.photo;
                if (tLRPC$Photo == null || tLRPC$Photo.id == next.editPhotoId) {
                    next.isEditSaved = true;
                    return next;
                }
            }
        }
        return null;
    }

    public void delete(StoryEntry storyEntry) {
        ArrayList<StoryEntry> arrayList = new ArrayList<>(1);
        arrayList.add(storyEntry);
        delete(arrayList);
    }

    public void delete(ArrayList<StoryEntry> arrayList) {
        String str;
        StringBuilder sb;
        long j;
        if (arrayList == null) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            StoryEntry storyEntry = arrayList.get(i);
            if (storyEntry != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("StoryDraft delete ");
                sb2.append(storyEntry.draftId);
                sb2.append(" (edit=");
                sb2.append(storyEntry.isEdit);
                if (storyEntry.isEdit) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(", storyId=");
                    sb3.append(storyEntry.editStoryId);
                    sb3.append(", ");
                    if (storyEntry.editDocumentId != 0) {
                        sb = new StringBuilder();
                        sb.append("documentId=");
                        j = storyEntry.editDocumentId;
                    } else {
                        sb = new StringBuilder();
                        sb.append("photoId=");
                        j = storyEntry.editPhotoId;
                    }
                    sb.append(j);
                    sb3.append(sb.toString());
                    sb3.append(", expireDate=");
                    sb3.append(storyEntry.editExpireDate);
                    str = sb3.toString();
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append(", now=");
                sb2.append(System.currentTimeMillis());
                sb2.append(")");
                FileLog.d(sb2.toString());
                arrayList2.add(Long.valueOf(storyEntry.draftId));
                storyEntry.destroy(true);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.drafts.removeAll(arrayList);
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                DraftsController.lambda$delete$4(MessagesStorage.this, arrayList2);
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public static void lambda$delete$4(MessagesStorage messagesStorage, ArrayList arrayList) {
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            if (database == null) {
                return;
            }
            database.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void cleanup() {
        delete(this.drafts);
        this.loaded = false;
    }

    public static class StoryDraft {
        public long averageDuration;
        public String caption;
        public ArrayList<TLRPC$MessageEntity> captionEntities;
        public long date;
        public long duration;
        public boolean edit;
        public long editDocumentId;
        public long editExpireDate;
        public long editPhotoId;
        public int editStoryId;
        public long editStoryPeerId;
        public String file;
        public boolean fileDeletable;
        private String filterFilePath;
        private MediaController.SavedFilterState filterState;
        public int gradientBottomColor;
        public int gradientTopColor;
        public int height;
        public long id;
        public int invert;
        public boolean isVideo;
        public long left;
        public final float[] matrixValues;
        public ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
        public boolean muted;
        public int orientation;
        public String paintEntitiesFilePath;
        public String paintFilePath;
        private final ArrayList<StoryEntry.Part> parts;
        private int period;
        public final ArrayList<TLRPC$InputPrivacyRule> privacyRules;
        public int resultHeight;
        public int resultWidth;
        public long right;
        public List<TLRPC$InputDocument> stickers;
        public String thumb;
        public int width;

        public StoryDraft(StoryEntry storyEntry) {
            float[] fArr = new float[9];
            this.matrixValues = fArr;
            ArrayList<TLRPC$InputPrivacyRule> arrayList = new ArrayList<>();
            this.privacyRules = arrayList;
            ArrayList<StoryEntry.Part> arrayList2 = new ArrayList<>();
            this.parts = arrayList2;
            this.id = storyEntry.draftId;
            this.date = storyEntry.draftDate;
            File file = storyEntry.draftThumbFile;
            this.thumb = file == null ? "" : file.toString();
            this.isVideo = storyEntry.isVideo;
            File file2 = storyEntry.file;
            this.file = file2 == null ? "" : file2.toString();
            this.fileDeletable = storyEntry.fileDeletable;
            this.muted = storyEntry.muted;
            float f = storyEntry.left;
            long j = storyEntry.duration;
            this.left = f * ((float) j);
            this.right = storyEntry.right * ((float) j);
            this.orientation = storyEntry.orientation;
            this.invert = storyEntry.invert;
            this.width = storyEntry.width;
            this.height = storyEntry.height;
            this.resultWidth = storyEntry.resultWidth;
            this.resultHeight = storyEntry.resultHeight;
            this.duration = j;
            storyEntry.matrix.getValues(fArr);
            this.gradientTopColor = storyEntry.gradientTopColor;
            this.gradientBottomColor = storyEntry.gradientBottomColor;
            CharSequence charSequence = storyEntry.caption;
            this.captionEntities = MediaDataController.getInstance(storyEntry.currentAccount).getEntities(new CharSequence[]{charSequence}, true);
            this.caption = charSequence == null ? "" : charSequence.toString();
            arrayList.addAll(storyEntry.privacyRules);
            File file3 = storyEntry.paintFile;
            this.paintFilePath = file3 == null ? "" : file3.toString();
            File file4 = storyEntry.paintEntitiesFile;
            this.paintEntitiesFilePath = file4 == null ? "" : file4.toString();
            this.averageDuration = storyEntry.averageDuration;
            this.mediaEntities = storyEntry.mediaEntities;
            this.stickers = storyEntry.stickers;
            File file5 = storyEntry.filterFile;
            this.filterFilePath = file5 != null ? file5.toString() : "";
            this.filterState = storyEntry.filterState;
            this.period = storyEntry.period;
            arrayList2.clear();
            arrayList2.addAll(storyEntry.parts);
        }

        public StoryEntry toEntry() {
            StoryEntry storyEntry = new StoryEntry();
            storyEntry.draftId = this.id;
            storyEntry.isDraft = true;
            storyEntry.draftDate = this.date;
            if (this.thumb != null) {
                storyEntry.draftThumbFile = new File(this.thumb);
            }
            storyEntry.isVideo = this.isVideo;
            if (this.file != null) {
                storyEntry.file = new File(this.file);
            }
            storyEntry.fileDeletable = this.fileDeletable;
            storyEntry.muted = this.muted;
            long j = this.duration;
            storyEntry.duration = j;
            if (j > 0) {
                storyEntry.left = ((float) this.left) / ((float) j);
                storyEntry.right = ((float) this.right) / ((float) j);
            } else {
                storyEntry.left = 0.0f;
                storyEntry.right = 1.0f;
            }
            storyEntry.orientation = this.orientation;
            storyEntry.invert = this.invert;
            storyEntry.width = this.width;
            storyEntry.height = this.height;
            storyEntry.resultWidth = this.resultWidth;
            storyEntry.resultHeight = this.resultHeight;
            storyEntry.matrix.setValues(this.matrixValues);
            storyEntry.gradientTopColor = this.gradientTopColor;
            storyEntry.gradientBottomColor = this.gradientBottomColor;
            if (this.caption != null) {
                CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableString(this.caption), Theme.chat_msgTextPaint.getFontMetricsInt(), true);
                MessageObject.addEntitiesToText(replaceEmoji, this.captionEntities, true, false, true, false);
                storyEntry.caption = replaceEmoji;
            } else {
                storyEntry.caption = "";
            }
            storyEntry.privacyRules.clear();
            storyEntry.privacyRules.addAll(this.privacyRules);
            if (this.paintFilePath != null) {
                storyEntry.paintFile = new File(this.paintFilePath);
            }
            if (this.paintEntitiesFilePath != null) {
                storyEntry.paintEntitiesFile = new File(this.paintEntitiesFilePath);
            }
            storyEntry.averageDuration = this.averageDuration;
            storyEntry.mediaEntities = this.mediaEntities;
            storyEntry.stickers = this.stickers;
            if (this.filterFilePath != null) {
                storyEntry.filterFile = new File(this.filterFilePath);
            }
            storyEntry.filterState = this.filterState;
            storyEntry.period = this.period;
            storyEntry.parts.clear();
            storyEntry.parts.addAll(this.parts);
            storyEntry.partsMaxId = 0;
            for (int i = 0; i < this.parts.size(); i++) {
                storyEntry.partsMaxId = Math.max(storyEntry.partsMaxId, this.parts.get(i).id);
            }
            storyEntry.isEdit = this.edit;
            storyEntry.editStoryId = this.editStoryId;
            storyEntry.editStoryPeerId = this.editStoryPeerId;
            storyEntry.editExpireDate = this.editExpireDate;
            storyEntry.editPhotoId = this.editPhotoId;
            storyEntry.editDocumentId = this.editDocumentId;
            return storyEntry;
        }

        public void toStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(-1318387531);
            abstractSerializedData.writeInt64(this.date);
            abstractSerializedData.writeString(this.thumb);
            abstractSerializedData.writeBool(this.isVideo);
            abstractSerializedData.writeString(this.file);
            abstractSerializedData.writeBool(this.fileDeletable);
            abstractSerializedData.writeBool(this.muted);
            abstractSerializedData.writeInt64(this.left);
            abstractSerializedData.writeInt64(this.right);
            abstractSerializedData.writeInt32(this.orientation);
            abstractSerializedData.writeInt32(this.invert);
            abstractSerializedData.writeInt32(this.width);
            abstractSerializedData.writeInt32(this.height);
            abstractSerializedData.writeInt32(this.resultWidth);
            abstractSerializedData.writeInt32(this.resultHeight);
            abstractSerializedData.writeInt64(this.duration);
            int i = 0;
            while (true) {
                float[] fArr = this.matrixValues;
                if (i >= fArr.length) {
                    break;
                }
                abstractSerializedData.writeFloat(fArr[i]);
                i++;
            }
            abstractSerializedData.writeInt32(this.gradientTopColor);
            abstractSerializedData.writeInt32(this.gradientBottomColor);
            abstractSerializedData.writeString(this.caption);
            abstractSerializedData.writeInt32(481674261);
            ArrayList<TLRPC$MessageEntity> arrayList = this.captionEntities;
            abstractSerializedData.writeInt32(arrayList == null ? 0 : arrayList.size());
            if (this.captionEntities != null) {
                for (int i2 = 0; i2 < this.captionEntities.size(); i2++) {
                    this.captionEntities.get(i2).serializeToStream(abstractSerializedData);
                }
            }
            abstractSerializedData.writeInt32(481674261);
            ArrayList<TLRPC$InputPrivacyRule> arrayList2 = this.privacyRules;
            abstractSerializedData.writeInt32(arrayList2 == null ? 0 : arrayList2.size());
            if (this.privacyRules != null) {
                for (int i3 = 0; i3 < this.privacyRules.size(); i3++) {
                    this.privacyRules.get(i3).serializeToStream(abstractSerializedData);
                }
            }
            abstractSerializedData.writeBool(false);
            abstractSerializedData.writeString(this.paintFilePath);
            abstractSerializedData.writeInt64(this.averageDuration);
            abstractSerializedData.writeInt32(481674261);
            ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = this.mediaEntities;
            abstractSerializedData.writeInt32(arrayList3 == null ? 0 : arrayList3.size());
            if (this.mediaEntities != null) {
                for (int i4 = 0; i4 < this.mediaEntities.size(); i4++) {
                    this.mediaEntities.get(i4).serializeTo(abstractSerializedData, true);
                }
            }
            abstractSerializedData.writeInt32(481674261);
            List<TLRPC$InputDocument> list = this.stickers;
            abstractSerializedData.writeInt32(list == null ? 0 : list.size());
            if (this.stickers != null) {
                for (int i5 = 0; i5 < this.stickers.size(); i5++) {
                    this.stickers.get(i5).serializeToStream(abstractSerializedData);
                }
            }
            String str = this.filterFilePath;
            if (str == null) {
                str = "";
            }
            abstractSerializedData.writeString(str);
            if (this.filterState == null) {
                abstractSerializedData.writeInt32(1450380236);
            } else {
                abstractSerializedData.writeInt32(-1318387530);
                this.filterState.serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeInt32(this.period);
            abstractSerializedData.writeInt32(481674261);
            abstractSerializedData.writeInt32(this.parts.size());
            for (int i6 = 0; i6 < this.parts.size(); i6++) {
                this.parts.get(i6).serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeBool(this.edit);
            abstractSerializedData.writeInt32(this.editStoryId);
            abstractSerializedData.writeInt64(this.editStoryPeerId);
            abstractSerializedData.writeInt64(this.editExpireDate);
            abstractSerializedData.writeInt64(this.editPhotoId);
            abstractSerializedData.writeInt64(this.editDocumentId);
            abstractSerializedData.writeString(this.paintEntitiesFilePath);
        }

        public int getObjectSize() {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
            toStream(nativeByteBuffer);
            return nativeByteBuffer.length();
        }

        public StoryDraft(AbstractSerializedData abstractSerializedData, boolean z) {
            this.matrixValues = new float[9];
            this.privacyRules = new ArrayList<>();
            this.parts = new ArrayList<>();
            if (abstractSerializedData.readInt32(z) != -1318387531) {
                if (z) {
                    throw new RuntimeException("StoryDraft parse error");
                }
                return;
            }
            this.date = abstractSerializedData.readInt64(z);
            String readString = abstractSerializedData.readString(z);
            this.thumb = readString;
            if (readString != null && readString.length() == 0) {
                this.thumb = null;
            }
            this.isVideo = abstractSerializedData.readBool(z);
            String readString2 = abstractSerializedData.readString(z);
            this.file = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.file = null;
            }
            this.fileDeletable = abstractSerializedData.readBool(z);
            this.muted = abstractSerializedData.readBool(z);
            this.left = abstractSerializedData.readInt64(z);
            this.right = abstractSerializedData.readInt64(z);
            this.orientation = abstractSerializedData.readInt32(z);
            this.invert = abstractSerializedData.readInt32(z);
            this.width = abstractSerializedData.readInt32(z);
            this.height = abstractSerializedData.readInt32(z);
            this.resultWidth = abstractSerializedData.readInt32(z);
            this.resultHeight = abstractSerializedData.readInt32(z);
            this.duration = abstractSerializedData.readInt64(z);
            int i = 0;
            while (true) {
                float[] fArr = this.matrixValues;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = abstractSerializedData.readFloat(z);
                i++;
            }
            this.gradientTopColor = abstractSerializedData.readInt32(z);
            this.gradientBottomColor = abstractSerializedData.readInt32(z);
            String readString3 = abstractSerializedData.readString(z);
            this.caption = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.caption = null;
            }
            if (abstractSerializedData.readInt32(z) != 481674261) {
                if (z) {
                    throw new RuntimeException("Vector magic in StoryDraft parse error (1)");
                }
                return;
            }
            int readInt32 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt32; i2++) {
                if (this.captionEntities == null) {
                    this.captionEntities = new ArrayList<>();
                }
                this.captionEntities.add(TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
            }
            if (abstractSerializedData.readInt32(z) != 481674261) {
                if (z) {
                    throw new RuntimeException("Vector magic in StoryDraft parse error (2)");
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            this.privacyRules.clear();
            for (int i3 = 0; i3 < readInt322; i3++) {
                this.privacyRules.add(TLRPC$InputPrivacyRule.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
            }
            abstractSerializedData.readBool(z);
            String readString4 = abstractSerializedData.readString(z);
            this.paintFilePath = readString4;
            if (readString4 != null && readString4.length() == 0) {
                this.paintFilePath = null;
            }
            this.averageDuration = abstractSerializedData.readInt64(z);
            if (abstractSerializedData.readInt32(z) != 481674261) {
                if (z) {
                    throw new RuntimeException("Vector magic in StoryDraft parse error (3)");
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i4 = 0; i4 < readInt323; i4++) {
                if (this.mediaEntities == null) {
                    this.mediaEntities = new ArrayList<>();
                }
                this.mediaEntities.add(new VideoEditedInfo.MediaEntity(abstractSerializedData, true));
            }
            if (abstractSerializedData.readInt32(z) != 481674261) {
                if (z) {
                    throw new RuntimeException("Vector magic in StoryDraft parse error (4)");
                }
                return;
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i5 = 0; i5 < readInt324; i5++) {
                if (this.stickers == null) {
                    this.stickers = new ArrayList();
                }
                this.stickers.add(TLRPC$InputDocument.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
            }
            String readString5 = abstractSerializedData.readString(z);
            this.filterFilePath = readString5;
            if (readString5 != null && readString5.length() == 0) {
                this.filterFilePath = null;
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            if (readInt325 == 1450380236) {
                this.filterState = null;
            } else if (readInt325 == -1318387530) {
                MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
                this.filterState = savedFilterState;
                savedFilterState.readParams(abstractSerializedData, z);
            }
            if (abstractSerializedData.remaining() >= 4) {
                this.period = abstractSerializedData.readInt32(z);
            }
            if (abstractSerializedData.remaining() > 0) {
                if (abstractSerializedData.readInt32(z) != 481674261) {
                    if (z) {
                        throw new RuntimeException("Vector magic in StoryDraft parse error (5)");
                    }
                    return;
                }
                int readInt326 = abstractSerializedData.readInt32(z);
                this.parts.clear();
                for (int i6 = 0; i6 < readInt326; i6++) {
                    StoryEntry.Part part = new StoryEntry.Part();
                    part.readParams(abstractSerializedData, z);
                    this.parts.add(part);
                }
            }
            if (abstractSerializedData.remaining() > 0) {
                this.edit = abstractSerializedData.readBool(z);
                this.editStoryId = abstractSerializedData.readInt32(z);
                this.editStoryPeerId = abstractSerializedData.readInt64(z);
                this.editExpireDate = abstractSerializedData.readInt64(z);
                this.editPhotoId = abstractSerializedData.readInt64(z);
                this.editDocumentId = abstractSerializedData.readInt64(z);
            }
            if (abstractSerializedData.remaining() > 0) {
                String readString6 = abstractSerializedData.readString(z);
                this.paintEntitiesFilePath = readString6;
                if (readString6 == null || readString6.length() != 0) {
                    return;
                }
                this.paintEntitiesFilePath = null;
            }
        }
    }
}
