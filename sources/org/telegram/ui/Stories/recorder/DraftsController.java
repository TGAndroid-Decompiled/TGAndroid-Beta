package org.telegram.ui.Stories.recorder;

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksController$$ExternalSyntheticLambda8;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class DraftsController {
    public final int currentAccount;
    public final ArrayList drafts = new ArrayList();
    public File draftsFolder;
    public boolean loaded;
    public boolean loadedFailed;
    public boolean loading;
    public boolean loadingFailed;

    public DraftsController(int i) {
        this.currentAccount = i;
        if (this.loadedFailed || this.loadingFailed) {
            return;
        }
        this.loadingFailed = true;
        DraftsController$$ExternalSyntheticLambda1 draftsController$$ExternalSyntheticLambda1 = new DraftsController$$ExternalSyntheticLambda1(this, 0);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
        messagesStorage.getStorageQueue().postRunnable(new EglRenderer$$ExternalSyntheticLambda8((Object) messagesStorage, true, (Object) draftsController$$ExternalSyntheticLambda1, 7));
    }

    public final void append(StoryDraft storyDraft) {
        String string;
        StringBuilder sb;
        long j;
        int i = this.currentAccount;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
        StringBuilder sb2 = new StringBuilder("StoryDraft append ");
        sb2.append(storyDraft.id);
        sb2.append(" (edit=");
        sb2.append(storyDraft.isEdit);
        if (storyDraft.isEdit) {
            StringBuilder sb3 = new StringBuilder(", storyId=");
            sb3.append(storyDraft.editStoryId);
            sb3.append(", ");
            if (storyDraft.editDocumentId != 0) {
                sb = new StringBuilder("documentId=");
                j = storyDraft.editDocumentId;
            } else {
                sb = new StringBuilder("photoId=");
                j = storyDraft.editPhotoId;
            }
            sb.append(j);
            sb3.append(sb.toString());
            sb3.append(", expireDate=");
            sb3.append(storyDraft.editExpireDate);
            string = sb3.toString();
        } else {
            string = "";
        }
        sb2.append(string);
        sb2.append(", now=");
        sb2.append(System.currentTimeMillis());
        sb2.append(")");
        FileLog.d(sb2.toString());
        messagesStorage.getStorageQueue().postRunnable(new DraftsController$$ExternalSyntheticLambda4(messagesStorage, storyDraft, 1));
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void delete(ArrayList arrayList) {
        String string;
        StringBuilder sb;
        long j;
        if (arrayList == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            StoryEntry storyEntry = (StoryEntry) arrayList.get(i);
            if (storyEntry != null) {
                StringBuilder sb2 = new StringBuilder("StoryDraft delete ");
                sb2.append(storyEntry.draftId);
                sb2.append(" (edit=");
                sb2.append(storyEntry.isEdit);
                if (storyEntry.isEdit) {
                    StringBuilder sb3 = new StringBuilder(", storyId=");
                    sb3.append(storyEntry.editStoryId);
                    sb3.append(", ");
                    if (storyEntry.editDocumentId != 0) {
                        sb = new StringBuilder("documentId=");
                        j = storyEntry.editDocumentId;
                    } else {
                        sb = new StringBuilder("photoId=");
                        j = storyEntry.editPhotoId;
                    }
                    sb.append(j);
                    sb3.append(sb.toString());
                    sb3.append(", expireDate=");
                    sb3.append(storyEntry.editExpireDate);
                    string = sb3.toString();
                } else {
                    string = "";
                }
                sb2.append(string);
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
        int i2 = this.currentAccount;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i2);
        messagesStorage.getStorageQueue().postRunnable(new BusinessLinksController$$ExternalSyntheticLambda8(2, arrayList2, messagesStorage));
        NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void edit(StoryEntry storyEntry) {
        if (storyEntry == null) {
            return;
        }
        prepare(storyEntry);
        ArrayList arrayList = this.drafts;
        arrayList.remove(storyEntry);
        if (!storyEntry.isError) {
            arrayList.add(0, storyEntry);
        }
        StoryDraft storyDraft = new StoryDraft(storyEntry);
        int i = this.currentAccount;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
        messagesStorage.getStorageQueue().postRunnable(new DraftsController$$ExternalSyntheticLambda4(messagesStorage, storyDraft, 0));
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesDraftsUpdated, new Object[0]);
    }

    public final void prepare(StoryEntry storyEntry) {
        if (storyEntry == null) {
            return;
        }
        if (storyEntry.draftId == 0) {
            storyEntry.draftId = Utilities.random.nextLong();
        }
        storyEntry.draftDate = System.currentTimeMillis();
        storyEntry.isDraft = true;
        if (storyEntry.fileDeletable) {
            storyEntry.file = prepareFile(storyEntry.file);
        } else if (storyEntry.file != null) {
            File fileMakeCacheFile = StoryEntry.makeCacheFile(this.currentAccount, storyEntry.isVideo ? "mp4" : "jpg");
            try {
                AndroidUtilities.copyFile(storyEntry.file, fileMakeCacheFile);
                storyEntry.file = prepareFile(fileMakeCacheFile);
                storyEntry.fileDeletable = true;
            } catch (IOException e) {
                FileLog.e(e);
            }
        }
        storyEntry.filterFile = prepareFile(storyEntry.filterFile);
        storyEntry.paintFile = prepareFile(storyEntry.paintFile);
        storyEntry.draftThumbFile = prepareFile(storyEntry.draftThumbFile);
    }

    public final File prepareFile(File file) {
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

    public final class StoryDraft {
        public final String audioAuthor;
        public final TLRPC.InputDocument audioDocument;
        public final long audioDuration;
        public final float audioLeft;
        public final long audioOffset;
        public final String audioPath;
        public final float audioRight;
        public final String audioTitle;
        public final float audioVolume;
        public final long averageDuration;
        public final TLRPC.InputMedia botEdit;
        public final long botId;
        public final String botLang;
        public final String caption;
        public final ArrayList captionEntities;
        public final CollageLayout collage;
        public final ArrayList collageParts;
        public final MediaController.CropState crop;
        public final long date;
        public final long duration;
        public long editDocumentId;
        public long editExpireDate;
        public long editPhotoId;
        public int editStoryId;
        public long editStoryPeerId;
        public final TLRPC.TL_error error;
        public final String file;
        public final boolean fileDeletable;
        public final String filterFilePath;
        public final MediaController.SavedFilterState filterState;
        public final String fullThumb;
        public final int gradientBottomColor;
        public final int gradientTopColor;
        public final int height;
        public long id;
        public final int invert;
        public boolean isEdit;
        public final boolean isError;
        public final boolean isVideo;
        public final long left;
        public final float[] matrixValues;
        public final ArrayList mediaEntities;
        public final boolean muted;
        public final int orientation;
        public final String paintEntitiesFilePath;
        public final String paintFilePath;
        public final TLRPC.InputPeer peer;
        public final int period;
        public final ArrayList privacyRules;
        public final int resultHeight;
        public final int resultWidth;
        public final long right;
        public final long roundDuration;
        public final float roundLeft;
        public final long roundOffset;
        public final String roundPath;
        public final float roundRight;
        public final String roundThumb;
        public final float roundVolume;
        public final ArrayList stickers;
        public final String thumb;
        public final float videoVolume;
        public final int width;

        public StoryDraft(StoryEntry storyEntry) {
            float[] fArr = new float[9];
            this.matrixValues = fArr;
            ArrayList arrayList = new ArrayList();
            this.privacyRules = arrayList;
            this.audioRight = 1.0f;
            this.audioVolume = 1.0f;
            this.roundVolume = 1.0f;
            this.videoVolume = 1.0f;
            this.id = storyEntry.draftId;
            this.date = storyEntry.draftDate;
            File file = storyEntry.draftThumbFile;
            this.thumb = file == null ? "" : file.toString();
            File file2 = storyEntry.uploadThumbFile;
            this.fullThumb = file2 == null ? "" : file2.toString();
            this.isVideo = storyEntry.isVideo;
            File file3 = storyEntry.file;
            this.file = file3 == null ? "" : file3.toString();
            this.fileDeletable = storyEntry.fileDeletable;
            this.muted = storyEntry.muted;
            float f = storyEntry.left;
            long j = storyEntry.duration;
            float f2 = j;
            this.left = (long) (f * f2);
            this.right = (long) (storyEntry.right * f2);
            this.orientation = storyEntry.orientation;
            this.invert = storyEntry.invert;
            this.width = storyEntry.width;
            this.height = storyEntry.height;
            this.crop = storyEntry.crop;
            this.resultWidth = storyEntry.resultWidth;
            this.resultHeight = storyEntry.resultHeight;
            this.duration = j;
            storyEntry.matrix.getValues(fArr);
            this.gradientTopColor = storyEntry.gradientTopColor;
            this.gradientBottomColor = storyEntry.gradientBottomColor;
            CharSequence[] charSequenceArr = {storyEntry.caption};
            this.captionEntities = storyEntry.captionEntitiesAllowed ? MediaDataController.getInstance(storyEntry.currentAccount).getEntities(charSequenceArr, true) : null;
            CharSequence charSequence = charSequenceArr[0];
            this.caption = charSequence == null ? "" : charSequence.toString();
            arrayList.addAll(storyEntry.privacyRules);
            File file4 = storyEntry.paintFile;
            this.paintFilePath = file4 == null ? "" : file4.toString();
            File file5 = storyEntry.paintEntitiesFile;
            this.paintEntitiesFilePath = file5 == null ? "" : file5.toString();
            this.averageDuration = storyEntry.averageDuration;
            this.mediaEntities = storyEntry.mediaEntities;
            this.stickers = storyEntry.stickers;
            File file6 = storyEntry.filterFile;
            this.filterFilePath = file6 != null ? file6.toString() : "";
            this.filterState = storyEntry.filterState;
            this.period = storyEntry.period;
            this.isError = storyEntry.isError;
            this.error = storyEntry.error;
            this.audioPath = storyEntry.audioPath;
            this.audioDocument = storyEntry.audioDocument;
            this.audioAuthor = storyEntry.audioAuthor;
            this.audioTitle = storyEntry.audioTitle;
            this.audioDuration = storyEntry.audioDuration;
            this.audioOffset = storyEntry.audioOffset;
            this.audioLeft = storyEntry.audioLeft;
            this.audioRight = storyEntry.audioRight;
            this.audioVolume = storyEntry.audioVolume;
            File file7 = storyEntry.round;
            this.roundPath = file7 != null ? file7.getAbsolutePath() : null;
            this.roundThumb = storyEntry.roundThumb;
            this.roundDuration = storyEntry.roundDuration;
            this.roundOffset = storyEntry.roundOffset;
            this.roundLeft = storyEntry.roundLeft;
            this.roundRight = storyEntry.roundRight;
            this.roundVolume = storyEntry.roundVolume;
            this.videoVolume = storyEntry.videoVolume;
            this.peer = storyEntry.peer;
            this.botId = storyEntry.botId;
            this.botLang = storyEntry.botLang;
            this.botEdit = storyEntry.editingBotPreview;
            this.collage = storyEntry.collage;
            this.collageParts = VideoEditedInfo.Part.toParts(storyEntry);
        }

        public final StoryEntry toEntry() {
            StoryEntry storyEntry = new StoryEntry();
            storyEntry.draftId = this.id;
            storyEntry.isDraft = true;
            storyEntry.draftDate = this.date;
            String str = this.thumb;
            if (!TextUtils.isEmpty(str)) {
                storyEntry.draftThumbFile = new File(str);
            }
            String str2 = this.fullThumb;
            if (!TextUtils.isEmpty(str2)) {
                storyEntry.uploadThumbFile = new File(str2);
            }
            storyEntry.isVideo = this.isVideo;
            String str3 = this.file;
            if (str3 != null) {
                storyEntry.file = new File(str3);
            }
            storyEntry.fileDeletable = this.fileDeletable;
            storyEntry.muted = this.muted;
            long j = this.duration;
            storyEntry.duration = j;
            if (j > 0) {
                float f = j;
                storyEntry.left = this.left / f;
                storyEntry.right = this.right / f;
            } else {
                storyEntry.left = 0.0f;
                storyEntry.right = 1.0f;
            }
            storyEntry.orientation = this.orientation;
            storyEntry.invert = this.invert;
            storyEntry.width = this.width;
            storyEntry.height = this.height;
            storyEntry.crop = this.crop;
            storyEntry.resultWidth = this.resultWidth;
            storyEntry.resultHeight = this.resultHeight;
            storyEntry.matrix.setValues(this.matrixValues);
            storyEntry.gradientTopColor = this.gradientTopColor;
            storyEntry.gradientBottomColor = this.gradientBottomColor;
            String str4 = this.caption;
            if (str4 != null) {
                SpannableString spannableString = new SpannableString(str4);
                if (Theme.chat_msgTextPaint == null) {
                    Theme.createCommonMessageResources();
                }
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableString, Theme.chat_msgTextPaint.getFontMetricsInt(), true);
                MessageObject.addEntitiesToText(charSequenceReplaceEmoji, this.captionEntities, true, false, true, false);
                storyEntry.caption = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, this.captionEntities, Theme.chat_msgTextPaint.getFontMetricsInt());
            } else {
                storyEntry.caption = "";
            }
            ArrayList arrayList = storyEntry.privacyRules;
            arrayList.clear();
            arrayList.addAll(this.privacyRules);
            String str5 = this.paintFilePath;
            if (str5 != null) {
                storyEntry.paintFile = new File(str5);
            }
            String str6 = this.paintEntitiesFilePath;
            if (str6 != null) {
                storyEntry.paintEntitiesFile = new File(str6);
            }
            storyEntry.averageDuration = this.averageDuration;
            storyEntry.mediaEntities = this.mediaEntities;
            storyEntry.stickers = this.stickers;
            String str7 = this.filterFilePath;
            if (str7 != null) {
                storyEntry.filterFile = new File(str7);
            }
            storyEntry.filterState = this.filterState;
            storyEntry.period = this.period;
            storyEntry.isEdit = this.isEdit;
            storyEntry.editStoryId = this.editStoryId;
            storyEntry.editStoryPeerId = this.editStoryPeerId;
            storyEntry.editExpireDate = this.editExpireDate;
            storyEntry.editPhotoId = this.editPhotoId;
            storyEntry.editDocumentId = this.editDocumentId;
            storyEntry.isError = this.isError;
            storyEntry.error = this.error;
            storyEntry.audioPath = this.audioPath;
            storyEntry.audioDocument = this.audioDocument;
            storyEntry.audioAuthor = this.audioAuthor;
            storyEntry.audioTitle = this.audioTitle;
            storyEntry.audioDuration = this.audioDuration;
            storyEntry.audioOffset = this.audioOffset;
            storyEntry.audioLeft = this.audioLeft;
            storyEntry.audioRight = this.audioRight;
            storyEntry.audioVolume = this.audioVolume;
            String str8 = this.roundPath;
            if (str8 != null) {
                storyEntry.round = new File(str8);
            }
            storyEntry.roundThumb = this.roundThumb;
            storyEntry.roundDuration = this.roundDuration;
            storyEntry.roundOffset = this.roundOffset;
            storyEntry.roundLeft = this.roundLeft;
            storyEntry.roundRight = this.roundRight;
            storyEntry.roundVolume = this.roundVolume;
            storyEntry.videoVolume = this.videoVolume;
            storyEntry.peer = this.peer;
            storyEntry.botId = this.botId;
            storyEntry.botLang = this.botLang;
            storyEntry.editingBotPreview = this.botEdit;
            storyEntry.collage = this.collage;
            storyEntry.collageContent = VideoEditedInfo.Part.toStoryEntries(this.collageParts);
            return storyEntry;
        }

        public final void toStream(NativeByteBuffer nativeByteBuffer) {
            ArrayList arrayList;
            nativeByteBuffer.writeInt32(-1318387531);
            nativeByteBuffer.writeInt64(this.date);
            nativeByteBuffer.writeString(this.thumb);
            nativeByteBuffer.writeBool(this.isVideo);
            nativeByteBuffer.writeString(this.file);
            nativeByteBuffer.writeBool(this.fileDeletable);
            nativeByteBuffer.writeBool(this.muted);
            nativeByteBuffer.writeInt64(this.left);
            nativeByteBuffer.writeInt64(this.right);
            nativeByteBuffer.writeInt32(this.orientation);
            nativeByteBuffer.writeInt32(this.invert);
            nativeByteBuffer.writeInt32(this.width);
            nativeByteBuffer.writeInt32(this.height);
            nativeByteBuffer.writeInt32(this.resultWidth);
            nativeByteBuffer.writeInt32(this.resultHeight);
            nativeByteBuffer.writeInt64(this.duration);
            int i = 0;
            int i2 = 0;
            while (true) {
                float[] fArr = this.matrixValues;
                if (i2 >= fArr.length) {
                    break;
                }
                nativeByteBuffer.writeFloat(fArr[i2]);
                i2++;
            }
            nativeByteBuffer.writeInt32(this.gradientTopColor);
            nativeByteBuffer.writeInt32(this.gradientBottomColor);
            nativeByteBuffer.writeString(this.caption);
            nativeByteBuffer.writeInt32(481674261);
            ArrayList arrayList2 = this.captionEntities;
            nativeByteBuffer.writeInt32(arrayList2 == null ? 0 : arrayList2.size());
            if (arrayList2 != null) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    ((TLRPC.MessageEntity) arrayList2.get(i3)).serializeToStream(nativeByteBuffer);
                }
            }
            nativeByteBuffer.writeInt32(481674261);
            ArrayList arrayList3 = this.privacyRules;
            nativeByteBuffer.writeInt32(arrayList3 == null ? 0 : arrayList3.size());
            if (arrayList3 != null) {
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    ((TLRPC.InputPrivacyRule) arrayList3.get(i4)).serializeToStream(nativeByteBuffer);
                }
            }
            nativeByteBuffer.writeBool(false);
            nativeByteBuffer.writeString(this.paintFilePath);
            nativeByteBuffer.writeInt64(this.averageDuration);
            nativeByteBuffer.writeInt32(481674261);
            ArrayList arrayList4 = this.mediaEntities;
            nativeByteBuffer.writeInt32(arrayList4 == null ? 0 : arrayList4.size());
            if (arrayList4 != null) {
                for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                    ((VideoEditedInfo.MediaEntity) arrayList4.get(i5)).serializeTo(nativeByteBuffer, true);
                }
            }
            nativeByteBuffer.writeInt32(481674261);
            ArrayList arrayList5 = this.stickers;
            nativeByteBuffer.writeInt32(arrayList5 == null ? 0 : arrayList5.size());
            if (arrayList5 != null) {
                for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                    ((TLRPC.InputDocument) arrayList5.get(i6)).serializeToStream(nativeByteBuffer);
                }
            }
            String str = this.filterFilePath;
            if (str == null) {
                str = "";
            }
            nativeByteBuffer.writeString(str);
            MediaController.SavedFilterState savedFilterState = this.filterState;
            if (savedFilterState == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1318387530);
                savedFilterState.serializeToStream(nativeByteBuffer);
            }
            nativeByteBuffer.writeInt32(this.period);
            nativeByteBuffer.writeInt32(481674261);
            nativeByteBuffer.writeInt32(0);
            nativeByteBuffer.writeBool(this.isEdit);
            nativeByteBuffer.writeInt32(this.editStoryId);
            nativeByteBuffer.writeInt64(this.editStoryPeerId);
            nativeByteBuffer.writeInt64(this.editExpireDate);
            nativeByteBuffer.writeInt64(this.editPhotoId);
            nativeByteBuffer.writeInt64(this.editDocumentId);
            nativeByteBuffer.writeString(this.paintEntitiesFilePath);
            nativeByteBuffer.writeBool(this.isError);
            TLRPC.TL_error tL_error = this.error;
            if (tL_error == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                tL_error.serializeToStream(nativeByteBuffer);
            }
            nativeByteBuffer.writeString(this.fullThumb);
            String str2 = this.audioPath;
            if (str2 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1739392570);
                nativeByteBuffer.writeString(str2);
                String str3 = this.audioAuthor;
                if (str3 == null) {
                    nativeByteBuffer.writeInt32(1450380236);
                } else {
                    nativeByteBuffer.writeInt32(-1222740358);
                    nativeByteBuffer.writeString(str3);
                }
                String str4 = this.audioTitle;
                if (str4 == null) {
                    nativeByteBuffer.writeInt32(1450380236);
                } else {
                    nativeByteBuffer.writeInt32(-1222740358);
                    nativeByteBuffer.writeString(str4);
                }
                nativeByteBuffer.writeInt64(this.audioDuration);
                nativeByteBuffer.writeInt64(this.audioOffset);
                nativeByteBuffer.writeFloat(this.audioLeft);
                nativeByteBuffer.writeFloat(this.audioRight);
                nativeByteBuffer.writeFloat(this.audioVolume);
            }
            TLRPC.InputPeer inputPeer = this.peer;
            if (inputPeer != null) {
                inputPeer.serializeToStream(nativeByteBuffer);
            } else {
                new TLRPC.TL_inputPeerSelf().serializeToStream(nativeByteBuffer);
            }
            String str5 = this.roundPath;
            if (TextUtils.isEmpty(str5)) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(1137015880);
                nativeByteBuffer.writeString(str5);
                nativeByteBuffer.writeInt64(this.roundDuration);
                nativeByteBuffer.writeInt64(this.roundOffset);
                nativeByteBuffer.writeFloat(this.roundLeft);
                nativeByteBuffer.writeFloat(this.roundRight);
                nativeByteBuffer.writeFloat(this.roundVolume);
            }
            nativeByteBuffer.writeFloat(this.videoVolume);
            nativeByteBuffer.writeInt64(this.botId);
            String str6 = this.botLang;
            nativeByteBuffer.writeString(str6 != null ? str6 : "");
            TLRPC.InputMedia inputMedia = this.botEdit;
            if (inputMedia == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                inputMedia.serializeToStream(nativeByteBuffer);
            }
            CollageLayout collageLayout = this.collage;
            if (collageLayout == null || collageLayout.parts.size() <= 1 || (arrayList = this.collageParts) == null || arrayList.size() <= 1) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeString(collageLayout.src);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
                }
            }
            MediaController.CropState cropState = this.crop;
            if (cropState == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                cropState.serializeToStream(nativeByteBuffer);
            }
            TLRPC.InputDocument inputDocument = this.audioDocument;
            if (inputDocument == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                inputDocument.serializeToStream(nativeByteBuffer);
            }
        }

        public StoryDraft(NativeByteBuffer nativeByteBuffer) {
            int int32;
            this.matrixValues = new float[9];
            this.privacyRules = new ArrayList();
            this.audioRight = 1.0f;
            this.audioVolume = 1.0f;
            this.roundVolume = 1.0f;
            this.videoVolume = 1.0f;
            if (nativeByteBuffer.readInt32(true) == -1318387531) {
                this.date = nativeByteBuffer.readInt64(true);
                String string = nativeByteBuffer.readString(true);
                this.thumb = string;
                if (string != null && string.length() == 0) {
                    this.thumb = null;
                }
                this.isVideo = nativeByteBuffer.readBool(true);
                String string2 = nativeByteBuffer.readString(true);
                this.file = string2;
                if (string2 != null && string2.length() == 0) {
                    this.file = null;
                }
                this.fileDeletable = nativeByteBuffer.readBool(true);
                this.muted = nativeByteBuffer.readBool(true);
                this.left = nativeByteBuffer.readInt64(true);
                this.right = nativeByteBuffer.readInt64(true);
                this.orientation = nativeByteBuffer.readInt32(true);
                this.invert = nativeByteBuffer.readInt32(true);
                this.width = nativeByteBuffer.readInt32(true);
                this.height = nativeByteBuffer.readInt32(true);
                this.resultWidth = nativeByteBuffer.readInt32(true);
                this.resultHeight = nativeByteBuffer.readInt32(true);
                this.duration = nativeByteBuffer.readInt64(true);
                int i = 0;
                while (true) {
                    float[] fArr = this.matrixValues;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = nativeByteBuffer.readFloat(true);
                    i++;
                }
                this.gradientTopColor = nativeByteBuffer.readInt32(true);
                this.gradientBottomColor = nativeByteBuffer.readInt32(true);
                String string3 = nativeByteBuffer.readString(true);
                this.caption = string3;
                if (string3 != null && string3.length() == 0) {
                    this.caption = null;
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int int33 = nativeByteBuffer.readInt32(true);
                    for (int i2 = 0; i2 < int33; i2++) {
                        if (this.captionEntities == null) {
                            this.captionEntities = new ArrayList();
                        }
                        this.captionEntities.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int int34 = nativeByteBuffer.readInt32(true);
                        this.privacyRules.clear();
                        for (int i3 = 0; i3 < int34; i3++) {
                            this.privacyRules.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                        }
                        nativeByteBuffer.readBool(true);
                        String string4 = nativeByteBuffer.readString(true);
                        this.paintFilePath = string4;
                        if (string4 != null && string4.length() == 0) {
                            this.paintFilePath = null;
                        }
                        this.averageDuration = nativeByteBuffer.readInt64(true);
                        if (nativeByteBuffer.readInt32(true) == 481674261) {
                            int int35 = nativeByteBuffer.readInt32(true);
                            for (int i4 = 0; i4 < int35; i4++) {
                                if (this.mediaEntities == null) {
                                    this.mediaEntities = new ArrayList();
                                }
                                this.mediaEntities.add(new VideoEditedInfo.MediaEntity(nativeByteBuffer, true, true));
                            }
                            if (nativeByteBuffer.readInt32(true) == 481674261) {
                                int int36 = nativeByteBuffer.readInt32(true);
                                for (int i5 = 0; i5 < int36; i5++) {
                                    if (this.stickers == null) {
                                        this.stickers = new ArrayList();
                                    }
                                    this.stickers.add(TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                                }
                                String string5 = nativeByteBuffer.readString(true);
                                this.filterFilePath = string5;
                                if (string5 != null && string5.length() == 0) {
                                    this.filterFilePath = null;
                                }
                                int int37 = nativeByteBuffer.readInt32(true);
                                if (int37 == 1450380236) {
                                    this.filterState = null;
                                } else if (int37 == -1318387530) {
                                    MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
                                    this.filterState = savedFilterState;
                                    savedFilterState.readParams(nativeByteBuffer, true);
                                }
                                if (nativeByteBuffer.remaining() >= 4) {
                                    this.period = nativeByteBuffer.readInt32(true);
                                }
                                if (nativeByteBuffer.remaining() > 0) {
                                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                                        nativeByteBuffer.readInt32(true);
                                    } else {
                                        throw new RuntimeException("Vector magic in StoryDraft parse error (5)");
                                    }
                                }
                                if (nativeByteBuffer.remaining() > 0) {
                                    this.isEdit = nativeByteBuffer.readBool(true);
                                    this.editStoryId = nativeByteBuffer.readInt32(true);
                                    this.editStoryPeerId = nativeByteBuffer.readInt64(true);
                                    this.editExpireDate = nativeByteBuffer.readInt64(true);
                                    this.editPhotoId = nativeByteBuffer.readInt64(true);
                                    this.editDocumentId = nativeByteBuffer.readInt64(true);
                                }
                                if (nativeByteBuffer.remaining() > 0) {
                                    String string6 = nativeByteBuffer.readString(true);
                                    this.paintEntitiesFilePath = string6;
                                    if (string6 != null && string6.length() == 0) {
                                        this.paintEntitiesFilePath = null;
                                    }
                                }
                                if (nativeByteBuffer.remaining() > 0) {
                                    this.isError = nativeByteBuffer.readBool(true);
                                    int int38 = nativeByteBuffer.readInt32(true);
                                    if (int38 == 1450380236) {
                                        this.error = null;
                                    } else {
                                        this.error = TLRPC.TL_error.TLdeserialize(nativeByteBuffer, int38, true);
                                    }
                                    this.fullThumb = nativeByteBuffer.readString(true);
                                }
                                if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -1739392570) {
                                    this.audioPath = nativeByteBuffer.readString(true);
                                    if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                        this.audioAuthor = nativeByteBuffer.readString(true);
                                    }
                                    if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                        this.audioTitle = nativeByteBuffer.readString(true);
                                    }
                                    this.audioDuration = nativeByteBuffer.readInt64(true);
                                    this.audioOffset = nativeByteBuffer.readInt64(true);
                                    this.audioLeft = nativeByteBuffer.readFloat(true);
                                    this.audioRight = nativeByteBuffer.readFloat(true);
                                    this.audioVolume = nativeByteBuffer.readFloat(true);
                                }
                                if (nativeByteBuffer.remaining() > 0) {
                                    this.peer = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                                }
                                if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                    this.roundPath = nativeByteBuffer.readString(true);
                                    this.roundDuration = nativeByteBuffer.readInt64(true);
                                    this.roundOffset = nativeByteBuffer.readInt64(true);
                                    this.roundLeft = nativeByteBuffer.readFloat(true);
                                    this.roundRight = nativeByteBuffer.readFloat(true);
                                    this.roundVolume = nativeByteBuffer.readFloat(true);
                                }
                                if (nativeByteBuffer.remaining() > 0) {
                                    this.videoVolume = nativeByteBuffer.readFloat(true);
                                }
                                if (nativeByteBuffer.remaining() > 0) {
                                    this.botId = nativeByteBuffer.readInt64(true);
                                    this.botLang = nativeByteBuffer.readString(true);
                                    int int39 = nativeByteBuffer.readInt32(true);
                                    if (int39 != 1450380236) {
                                        this.botEdit = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, int39, true);
                                    }
                                }
                                if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                    this.collage = new CollageLayout(nativeByteBuffer.readString(true));
                                    this.collageParts = new ArrayList();
                                    for (int i6 = 0; i6 < this.collage.parts.size(); i6++) {
                                        VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                        part.readParams(nativeByteBuffer, true);
                                        part.part = (CollageLayout.Part) this.collage.parts.get(i6);
                                        this.collageParts.add(part);
                                    }
                                }
                                if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                    MediaController.CropState cropState = new MediaController.CropState();
                                    this.crop = cropState;
                                    cropState.readParams(nativeByteBuffer, true);
                                }
                                if (nativeByteBuffer.remaining() <= 0 || (int32 = nativeByteBuffer.readInt32(true)) != 448771445) {
                                    return;
                                }
                                this.audioDocument = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, int32, true);
                                return;
                            }
                            throw new RuntimeException("Vector magic in StoryDraft parse error (4)");
                        }
                        throw new RuntimeException("Vector magic in StoryDraft parse error (3)");
                    }
                    throw new RuntimeException("Vector magic in StoryDraft parse error (2)");
                }
                throw new RuntimeException("Vector magic in StoryDraft parse error (1)");
            }
            throw new RuntimeException("StoryDraft parse error");
        }
    }
}
