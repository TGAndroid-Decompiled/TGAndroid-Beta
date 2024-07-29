package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputPrivacyRule;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$TL_inputPhoto;
import org.telegram.tgnet.TLRPC$TL_inputStickeredMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputStickeredMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messages_getAttachedStickers;
import org.telegram.tgnet.TLRPC$TL_photoSize_layer127;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.tgnet.TLRPC$TL_stickerSetFullCovered;
import org.telegram.tgnet.TLRPC$TL_videoSize_layer127;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.tl.TL_stories$MediaArea;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
public class StoryEntry {
    public boolean allowScreenshots;
    public String audioAuthor;
    public long audioDuration;
    public float audioLeft;
    public long audioOffset;
    public String audioPath;
    public String audioTitle;
    public Drawable backgroundDrawable;
    public File backgroundFile;
    public String backgroundWallpaperEmoticon;
    public Bitmap blurredVideoThumb;
    public long botId;
    public CharSequence caption;
    public Bitmap coverBitmap;
    public boolean coverSet;
    public long draftDate;
    public long draftId;
    public File draftThumbFile;
    public long duration;
    public long editDocumentId;
    public long editExpireDate;
    public long editPhotoId;
    public List<TLRPC$InputDocument> editStickers;
    public int editStoryId;
    public long editStoryPeerId;
    public boolean editedCaption;
    public boolean editedMedia;
    public ArrayList<TL_stories$MediaArea> editedMediaAreas;
    public boolean editedPrivacy;
    public TLRPC$InputMedia editingBotPreview;
    public TLRPC$Document editingCoverDocument;
    public TLRPC$TL_error error;
    public File file;
    public boolean fileDeletable;
    public File filterFile;
    public MediaController.SavedFilterState filterState;
    private boolean fromCamera;
    public int gradientBottomColor;
    public int gradientTopColor;
    public HDRInfo hdrInfo;
    public int height;
    public int invert;
    public boolean isDraft;
    public boolean isEdit;
    public boolean isEditSaved;
    public boolean isEditingCover;
    public boolean isError;
    public boolean isRepost;
    public boolean isRepostMessage;
    public boolean isVideo;
    public float left;
    public ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
    public File messageFile;
    public ArrayList<MessageObject> messageObjects;
    public File messageVideoMaskFile;
    public boolean muted;
    public int orientation;
    public File paintBlurFile;
    public File paintEntitiesFile;
    public File paintFile;
    public TLRPC$InputPeer peer;
    public StoryPrivacyBottomSheet.StoryPrivacy privacy;
    public String repostCaption;
    public TLRPC$MessageMedia repostMedia;
    public TLRPC$Peer repostPeer;
    public CharSequence repostPeerName;
    public int repostStoryId;
    public File round;
    public long roundDuration;
    public float roundLeft;
    public long roundOffset;
    public String roundThumb;
    public int scheduleDate;
    public ArrayList<Long> shareUserIds;
    public boolean silent;
    public List<TLRPC$InputDocument> stickers;
    public Bitmap thumbBitmap;
    public String thumbPath;
    public Bitmap thumbPathBitmap;
    public Utilities.Callback<Utilities.Callback<TLRPC$Document>> updateDocumentRef;
    public File uploadThumbFile;
    public int width;
    public final int currentAccount = UserConfig.selectedAccount;
    public double fileDuration = -1.0d;
    public float audioRight = 1.0f;
    public float audioVolume = 1.0f;
    public float videoVolume = 1.0f;
    public float right = 1.0f;
    public long cover = -1;
    public int resultWidth = 720;
    public int resultHeight = 1280;
    public final Matrix matrix = new Matrix();
    public float roundRight = 1.0f;
    public float roundVolume = 1.0f;
    public boolean isDark = Theme.isCurrentThemeDark();
    public long backgroundWallpaperPeerId = Long.MIN_VALUE;
    public boolean captionEntitiesAllowed = true;
    public final ArrayList<TLRPC$InputPrivacyRule> privacyRules = new ArrayList<>();
    public boolean pinned = true;
    public int period = 86400;
    public String botLang = "";
    public long averageDuration = 5000;
    private int checkStickersReqId = 0;

    public interface DecodeBitmap {
        Bitmap decode(BitmapFactory.Options options);
    }

    public boolean wouldBeVideo() {
        return wouldBeVideo(this.mediaEntities);
    }

    public boolean wouldBeVideo(ArrayList<VideoEditedInfo.MediaEntity> arrayList) {
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2;
        if (!this.isVideo && this.audioPath == null && this.round == null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    VideoEditedInfo.MediaEntity mediaEntity = arrayList.get(i);
                    byte b = mediaEntity.type;
                    if (b == 0) {
                        if (isAnimated(mediaEntity.document, mediaEntity.text)) {
                            return true;
                        }
                    } else if (b == 1 && (arrayList2 = mediaEntity.entities) != null && !arrayList2.isEmpty()) {
                        for (int i2 = 0; i2 < mediaEntity.entities.size(); i2++) {
                            VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i2);
                            if (isAnimated(emojiEntity.document, emojiEntity.documentAbsolutePath)) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isAnimated(TLRPC$Document tLRPC$Document, String str) {
        if (tLRPC$Document != null) {
            if ("video/webm".equals(tLRPC$Document.mime_type) || "video/mp4".equals(tLRPC$Document.mime_type)) {
                return true;
            }
            if (MessageObject.isAnimatedStickerDocument(tLRPC$Document, true) && RLottieDrawable.getFramesCount(str, null) > 1) {
                return true;
            }
        }
        return false;
    }

    public static void drawBackgroundDrawable(Canvas canvas, Drawable drawable, int i, int i2) {
        if (drawable == null) {
            return;
        }
        Rect rect = new Rect(drawable.getBounds());
        Drawable.Callback callback = drawable.getCallback();
        drawable.setCallback(null);
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            float width = bitmapDrawable.getBitmap().getWidth();
            float height = bitmapDrawable.getBitmap().getHeight();
            float max = Math.max(i / width, i2 / height);
            drawable.setBounds(0, 0, (int) (width * max), (int) (height * max));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
        }
        drawable.setBounds(rect);
        drawable.setCallback(callback);
    }

    public android.graphics.Bitmap buildBitmap(float r26, android.graphics.Bitmap r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryEntry.buildBitmap(float, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public Bitmap lambda$buildBitmap$0(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.backgroundFile.getPath(), options);
    }

    public static Bitmap lambda$buildBitmap$1(File file, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(file.getPath(), options);
    }

    public Bitmap lambda$buildBitmap$2(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.paintFile.getPath(), options);
    }

    public Bitmap lambda$buildBitmap$3(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.messageFile.getPath(), options);
    }

    public Bitmap lambda$buildBitmap$4(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.paintEntitiesFile.getPath(), options);
    }

    public void buildPhoto(File file) {
        Bitmap buildBitmap = buildBitmap(1.0f, null);
        Bitmap bitmap = this.thumbBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.thumbBitmap = null;
        }
        this.thumbBitmap = Bitmap.createScaledBitmap(buildBitmap, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            buildBitmap.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        buildBitmap.recycle();
    }

    public static Bitmap getScaledBitmap(DecodeBitmap decodeBitmap, int i, int i2, boolean z, boolean z2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeBitmap.decode(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        double d = (i3 * i4 * 4) + (i * i2 * 4);
        Double.isNaN(d);
        boolean z3 = d * 1.1d <= ((double) maxMemory);
        if (i3 <= i && i4 <= i2) {
            return decodeBitmap.decode(options);
        }
        if (z2 && z3 && SharedConfig.getDevicePerformanceClass() >= 1) {
            Bitmap decode = decodeBitmap.decode(options);
            float max = Math.max(i / decode.getWidth(), i2 / decode.getHeight());
            int width = (int) (decode.getWidth() * max);
            int height = (int) (decode.getHeight() * max);
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Matrix matrix = new Matrix();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(decode, tileMode, tileMode);
            Paint paint = new Paint(3);
            paint.setShader(bitmapShader);
            Utilities.clamp(Math.round(1.0f / max), 8, 0);
            matrix.reset();
            matrix.postScale(max, max);
            bitmapShader.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, 0.0f, width, height, paint);
            return createBitmap;
        }
        options.inScaled = true;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i;
        return decodeBitmap.decode(options);
    }

    public File getOriginalFile() {
        File file = this.filterFile;
        return file != null ? file : this.file;
    }

    private String ext(File file) {
        String path;
        int lastIndexOf;
        if (file != null && (lastIndexOf = (path = file.getPath()).lastIndexOf(46)) > 0) {
            return path.substring(lastIndexOf + 1);
        }
        return null;
    }

    public void updateFilter(PhotoFilterView photoFilterView, final Runnable runnable) {
        clearFilter();
        MediaController.SavedFilterState savedFilterState = photoFilterView.getSavedFilterState();
        this.filterState = savedFilterState;
        if (this.isVideo) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (savedFilterState.isEmpty()) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            Bitmap bitmap = photoFilterView.getBitmap();
            if (bitmap == null) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            Matrix matrix = new Matrix();
            int i = this.invert;
            final boolean z = true;
            matrix.postScale(i == 1 ? -1.0f : 1.0f, i != 2 ? 1.0f : -1.0f, this.width / 2.0f, this.height / 2.0f);
            matrix.postRotate(-this.orientation);
            final Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            this.matrix.preScale(this.width / createBitmap.getWidth(), this.height / createBitmap.getHeight());
            this.width = createBitmap.getWidth();
            this.height = createBitmap.getHeight();
            bitmap.recycle();
            File file = this.filterFile;
            if (file != null && file.exists()) {
                this.filterFile.delete();
            }
            String ext = ext(this.file);
            if (!"png".equals(ext) && !"webp".equals(ext)) {
                z = false;
            }
            this.filterFile = makeCacheFile(this.currentAccount, z ? "webp" : "jpg");
            if (runnable == null) {
                try {
                    createBitmap.compress(z ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(this.filterFile));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                createBitmap.recycle();
                return;
            }
            Utilities.themeQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StoryEntry.this.lambda$updateFilter$5(createBitmap, z, runnable);
                }
            });
        }
    }

    public void lambda$updateFilter$5(Bitmap bitmap, boolean z, Runnable runnable) {
        try {
            bitmap.compress(z ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(this.filterFile));
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            if (z) {
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(this.filterFile));
                } catch (Exception e2) {
                    FileLog.e((Throwable) e2, false);
                }
            }
        }
        bitmap.recycle();
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void clearFilter() {
        File file = this.filterFile;
        if (file != null) {
            file.delete();
            this.filterFile = null;
        }
    }

    public void clearPaint() {
        File file = this.paintFile;
        if (file != null) {
            file.delete();
            this.paintFile = null;
        }
        File file2 = this.backgroundFile;
        if (file2 != null) {
            file2.delete();
            this.backgroundFile = null;
        }
        File file3 = this.messageFile;
        if (file3 != null) {
            file3.delete();
            this.messageFile = null;
        }
        File file4 = this.messageVideoMaskFile;
        if (file4 != null) {
            file4.delete();
            this.messageVideoMaskFile = null;
        }
        File file5 = this.paintEntitiesFile;
        if (file5 != null) {
            file5.delete();
            this.paintEntitiesFile = null;
        }
    }

    public void destroy(boolean z) {
        Bitmap bitmap = this.blurredVideoThumb;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.blurredVideoThumb.recycle();
            this.blurredVideoThumb = null;
        }
        File file = this.uploadThumbFile;
        if (file != null) {
            file.delete();
            this.uploadThumbFile = null;
        }
        if (!z) {
            clearPaint();
            clearFilter();
            File file2 = this.file;
            if (file2 != null) {
                if (this.fileDeletable && (!this.isEdit || this.editedMedia)) {
                    file2.delete();
                }
                this.file = null;
            }
            if (this.thumbPath != null) {
                if (this.fileDeletable) {
                    new File(this.thumbPath).delete();
                }
                this.thumbPath = null;
            }
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = this.mediaEntities;
            if (arrayList != null) {
                Iterator<VideoEditedInfo.MediaEntity> it = arrayList.iterator();
                while (it.hasNext()) {
                    VideoEditedInfo.MediaEntity next = it.next();
                    if (next.type == 2 && !TextUtils.isEmpty(next.segmentedPath)) {
                        try {
                            new File(next.segmentedPath).delete();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        next.segmentedPath = "";
                    }
                }
            }
            File file3 = this.round;
            if (file3 != null && (!this.isEdit || this.editedMedia)) {
                file3.delete();
                this.round = null;
            }
            if (this.roundThumb != null && (!this.isEdit || this.editedMedia)) {
                try {
                    new File(this.roundThumb).delete();
                } catch (Exception unused) {
                }
                this.roundThumb = null;
            }
        }
        Bitmap bitmap2 = this.thumbPathBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.thumbPathBitmap = null;
        }
        cancelCheckStickers();
    }

    public static StoryEntry repostStoryItem(File file, TL_stories$StoryItem tL_stories$StoryItem) {
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.isRepost = true;
        storyEntry.repostMedia = tL_stories$StoryItem.media;
        storyEntry.repostPeer = MessagesController.getInstance(storyEntry.currentAccount).getPeer(tL_stories$StoryItem.dialogId);
        storyEntry.repostStoryId = tL_stories$StoryItem.id;
        storyEntry.repostCaption = tL_stories$StoryItem.caption;
        storyEntry.file = file;
        storyEntry.fileDeletable = false;
        storyEntry.width = 720;
        storyEntry.height = 1280;
        TLRPC$MessageMedia tLRPC$MessageMedia = tL_stories$StoryItem.media;
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) {
            storyEntry.isVideo = false;
            if (file != null) {
                storyEntry.decodeBounds(file.getAbsolutePath());
            }
        } else if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) {
            storyEntry.isVideo = true;
            TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
            if (tLRPC$Document != null && tLRPC$Document.attributes != null) {
                int i = 0;
                while (true) {
                    if (i >= tL_stories$StoryItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tL_stories$StoryItem.media.document.attributes.get(i);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                        storyEntry.width = tLRPC$DocumentAttribute.w;
                        storyEntry.height = tLRPC$DocumentAttribute.h;
                        storyEntry.fileDuration = tLRPC$DocumentAttribute.duration;
                        break;
                    }
                    i++;
                }
            }
            TLRPC$Document tLRPC$Document2 = tL_stories$StoryItem.media.document;
            if (tLRPC$Document2 != null) {
                String str = tL_stories$StoryItem.firstFramePath;
                if (str != null) {
                    storyEntry.thumbPath = str;
                } else if (tLRPC$Document2.thumbs != null) {
                    for (int i2 = 0; i2 < tL_stories$StoryItem.media.document.thumbs.size(); i2++) {
                        TLRPC$PhotoSize tLRPC$PhotoSize = tL_stories$StoryItem.media.document.thumbs.get(i2);
                        if (tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize) {
                            storyEntry.thumbPathBitmap = ImageLoader.getStrippedPhotoBitmap(tLRPC$PhotoSize.bytes, null);
                        } else {
                            File pathToAttach = FileLoader.getInstance(storyEntry.currentAccount).getPathToAttach(tLRPC$PhotoSize, true);
                            if (pathToAttach != null && pathToAttach.exists()) {
                                storyEntry.thumbPath = pathToAttach.getAbsolutePath();
                            }
                        }
                    }
                }
            }
        }
        storyEntry.setupMatrix();
        storyEntry.checkStickers(tL_stories$StoryItem);
        return storyEntry;
    }

    public static boolean canRepostMessage(MessageObject messageObject) {
        TLRPC$Message tLRPC$Message;
        int i;
        TLRPC$Peer tLRPC$Peer;
        if (messageObject != null && !messageObject.isSponsored() && (((tLRPC$Message = messageObject.messageOwner) == null || !tLRPC$Message.noforwards) && (i = messageObject.type) != 17 && i != 12)) {
            long dialogId = messageObject.getDialogId();
            TLRPC$Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.noforwards) {
                return false;
            }
            if (dialogId < 0 && ChatObject.isChannelAndNotMegaGroup(chat)) {
                return true;
            }
            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from;
            if (tLRPC$MessageFwdHeader != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.from_id) != null && (tLRPC$MessageFwdHeader.flags & 4) != 0) {
                long peerDialogId = DialogObject.getPeerDialogId(tLRPC$Peer);
                TLRPC$Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                if (peerDialogId < 0 && ((chat2 == null || !chat2.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat2) && ChatObject.isPublic(chat2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean useForwardForRepost(MessageObject messageObject) {
        TLRPC$Message tLRPC$Message;
        TLRPC$Peer tLRPC$Peer;
        if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null) {
            return null;
        }
        TLRPC$Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tLRPC$Message.peer_id)));
        if ((chat != null && chat.noforwards) || !ChatObject.isChannelAndNotMegaGroup(chat)) {
            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from;
            if (tLRPC$MessageFwdHeader != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.from_id) != null && (tLRPC$MessageFwdHeader.flags & 4) != 0) {
                long peerDialogId = DialogObject.getPeerDialogId(tLRPC$Peer);
                TLRPC$Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                if (peerDialogId < 0 && ((chat2 == null || !chat2.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat2))) {
                    return Boolean.TRUE;
                }
            }
            return null;
        }
        return Boolean.FALSE;
    }

    public static long getRepostDialogId(MessageObject messageObject) {
        Boolean useForwardForRepost = useForwardForRepost(messageObject);
        if (useForwardForRepost == null) {
            return 0L;
        }
        if (useForwardForRepost.booleanValue()) {
            return DialogObject.getPeerDialogId(messageObject.messageOwner.fwd_from.from_id);
        }
        return messageObject.getDialogId();
    }

    public static int getRepostMessageId(MessageObject messageObject) {
        Boolean useForwardForRepost = useForwardForRepost(messageObject);
        if (useForwardForRepost == null) {
            return 0;
        }
        if (useForwardForRepost.booleanValue()) {
            return messageObject.messageOwner.fwd_from.channel_post;
        }
        return messageObject.getId();
    }

    public static StoryEntry repostMessage(ArrayList<MessageObject> arrayList) {
        MessageObject messageObject;
        int i;
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.isRepostMessage = true;
        storyEntry.messageObjects = arrayList;
        storyEntry.resultWidth = 1080;
        storyEntry.resultHeight = 1920;
        storyEntry.backgroundWallpaperPeerId = getRepostDialogId(arrayList.get(0));
        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
        mediaEntity.type = (byte) 6;
        mediaEntity.x = 0.5f;
        mediaEntity.y = 0.5f;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
        storyEntry.mediaEntities = arrayList2;
        arrayList2.add(mediaEntity);
        if (arrayList.size() == 1 && (messageObject = arrayList.get(0)) != null && ((i = messageObject.type) == 8 || i == 3 || i == 5)) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (tLRPC$Message != null && tLRPC$Message.attachPath != null) {
                storyEntry.file = new File(messageObject.messageOwner.attachPath);
            }
            File file = storyEntry.file;
            if (file == null || !file.exists()) {
                storyEntry.file = FileLoader.getInstance(storyEntry.currentAccount).getPathToMessage(messageObject.messageOwner);
            }
            File file2 = storyEntry.file;
            if (file2 != null && file2.exists()) {
                storyEntry.isVideo = true;
                storyEntry.fileDeletable = false;
                long duration = (long) (messageObject.getDuration() * 1000.0d);
                storyEntry.duration = duration;
                storyEntry.left = 0.0f;
                storyEntry.right = Math.min(1.0f, 59500.0f / ((float) duration));
            } else {
                storyEntry.file = null;
            }
        }
        return storyEntry;
    }

    public static StoryEntry fromStoryItem(File file, TL_stories$StoryItem tL_stories$StoryItem) {
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.isEdit = true;
        storyEntry.editStoryId = tL_stories$StoryItem.id;
        storyEntry.file = file;
        int i = 0;
        storyEntry.fileDeletable = false;
        storyEntry.width = 720;
        storyEntry.height = 1280;
        TLRPC$MessageMedia tLRPC$MessageMedia = tL_stories$StoryItem.media;
        if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) {
            storyEntry.isVideo = false;
            if (file != null) {
                storyEntry.decodeBounds(file.getAbsolutePath());
            }
        } else if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) {
            storyEntry.isVideo = true;
            TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
            if (tLRPC$Document != null && tLRPC$Document.attributes != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_stories$StoryItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tL_stories$StoryItem.media.document.attributes.get(i2);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                        storyEntry.width = tLRPC$DocumentAttribute.w;
                        storyEntry.height = tLRPC$DocumentAttribute.h;
                        storyEntry.fileDuration = tLRPC$DocumentAttribute.duration;
                        break;
                    }
                    i2++;
                }
            }
            TLRPC$Document tLRPC$Document2 = tL_stories$StoryItem.media.document;
            if (tLRPC$Document2 != null) {
                String str = tL_stories$StoryItem.firstFramePath;
                if (str != null) {
                    storyEntry.thumbPath = str;
                } else if (tLRPC$Document2.thumbs != null) {
                    while (true) {
                        if (i >= tL_stories$StoryItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC$PhotoSize tLRPC$PhotoSize = tL_stories$StoryItem.media.document.thumbs.get(i);
                        if (tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize) {
                            storyEntry.thumbPathBitmap = ImageLoader.getStrippedPhotoBitmap(tLRPC$PhotoSize.bytes, null);
                            break;
                        }
                        File pathToAttach = FileLoader.getInstance(storyEntry.currentAccount).getPathToAttach(tLRPC$PhotoSize, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            storyEntry.thumbPath = pathToAttach.getAbsolutePath();
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        storyEntry.privacyRules.clear();
        storyEntry.privacyRules.addAll(StoryPrivacyBottomSheet.StoryPrivacy.toInput(storyEntry.currentAccount, tL_stories$StoryItem.privacy));
        storyEntry.period = tL_stories$StoryItem.expire_date - tL_stories$StoryItem.date;
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableString(tL_stories$StoryItem.caption), Theme.chat_msgTextPaint.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, tL_stories$StoryItem.entities, true, false, true, false);
            storyEntry.caption = MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_stories$StoryItem.entities, Theme.chat_msgTextPaint.getFontMetricsInt());
        } catch (Exception unused) {
        }
        storyEntry.setupMatrix();
        storyEntry.checkStickers(tL_stories$StoryItem);
        storyEntry.editedMediaAreas = tL_stories$StoryItem.media_areas;
        storyEntry.peer = MessagesController.getInstance(storyEntry.currentAccount).getInputPeer(tL_stories$StoryItem.dialogId);
        return storyEntry;
    }

    public static StoryEntry fromPhotoEntry(MediaController.PhotoEntry photoEntry) {
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.file = new File(photoEntry.path);
        storyEntry.orientation = photoEntry.orientation;
        storyEntry.invert = photoEntry.invert;
        storyEntry.isVideo = photoEntry.isVideo;
        storyEntry.thumbPath = photoEntry.thumbPath;
        long j = photoEntry.duration * 1000;
        storyEntry.duration = j;
        storyEntry.left = 0.0f;
        storyEntry.right = Math.min(1.0f, 59500.0f / ((float) j));
        if (storyEntry.isVideo && storyEntry.thumbPath == null) {
            storyEntry.thumbPath = "vthumb://" + photoEntry.imageId;
        }
        storyEntry.gradientTopColor = photoEntry.gradientTopColor;
        storyEntry.gradientBottomColor = photoEntry.gradientBottomColor;
        storyEntry.decodeBounds(storyEntry.file.getAbsolutePath());
        storyEntry.setupMatrix();
        return storyEntry;
    }

    public static StoryEntry fromPhotoShoot(File file, int i) {
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.file = file;
        storyEntry.fileDeletable = true;
        storyEntry.orientation = i;
        storyEntry.invert = 0;
        storyEntry.isVideo = false;
        if (file != null) {
            storyEntry.decodeBounds(file.getAbsolutePath());
        }
        storyEntry.setupMatrix();
        return storyEntry;
    }

    public void decodeBounds(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.width = options.outWidth;
                this.height = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (this.isVideo) {
            return;
        }
        if (((int) Math.max(this.width, (this.height / 16.0f) * 9.0f)) <= 900) {
            this.resultWidth = 720;
            this.resultHeight = 1280;
            return;
        }
        this.resultWidth = 1080;
        this.resultHeight = 1920;
    }

    public void setupMatrix() {
        setupMatrix(this.matrix, 0);
    }

    public void setupMatrix(Matrix matrix, int i) {
        matrix.reset();
        int i2 = this.width;
        int i3 = this.height;
        int i4 = this.orientation + i;
        int i5 = this.invert;
        matrix.postScale(i5 == 1 ? -1.0f : 1.0f, i5 != 2 ? 1.0f : -1.0f, i2 / 2.0f, i3 / 2.0f);
        if (i4 != 0) {
            matrix.postTranslate((-i2) / 2.0f, (-i3) / 2.0f);
            matrix.postRotate(i4);
            if (i4 == 90 || i4 == 270) {
                i3 = i2;
                i2 = i3;
            }
            matrix.postTranslate(i2 / 2.0f, i3 / 2.0f);
        }
        float f = i2;
        float f2 = this.resultWidth / f;
        if (this.botId != 0) {
            f2 = Math.min(f2, this.resultHeight / i3);
        } else {
            float f3 = i3;
            if (f3 / f > 1.29f) {
                f2 = Math.max(f2, this.resultHeight / f3);
            }
        }
        matrix.postScale(f2, f2);
        matrix.postTranslate((this.resultWidth - (f * f2)) / 2.0f, (this.resultHeight - (i3 * f2)) / 2.0f);
    }

    public void setupGradient(final Runnable runnable) {
        if (this.isVideo && this.gradientTopColor == 0 && this.gradientBottomColor == 0) {
            if (this.thumbPath != null) {
                final Bitmap bitmap = null;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    if (this.thumbPath.startsWith("vthumb://")) {
                        long parseInt = Integer.parseInt(this.thumbPath.substring(9));
                        options.inJustDecodeBounds = true;
                        MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), parseInt, 1, options);
                        options.inSampleSize = calculateInSampleSize(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), parseInt, 1, options);
                    } else {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(this.thumbPath);
                        options.inSampleSize = calculateInSampleSize(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = BitmapFactory.decodeFile(this.thumbPath);
                    }
                } catch (Exception unused) {
                }
                if (bitmap != null) {
                    DominantColors.getColors(true, bitmap, true, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            StoryEntry.this.lambda$setupGradient$6(bitmap, runnable, (int[]) obj);
                        }
                    });
                    return;
                }
                return;
            }
            Bitmap bitmap2 = this.thumbPathBitmap;
            if (bitmap2 != null) {
                DominantColors.getColors(true, bitmap2, true, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoryEntry.this.lambda$setupGradient$7(runnable, (int[]) obj);
                    }
                });
            }
        }
    }

    public void lambda$setupGradient$6(Bitmap bitmap, Runnable runnable, int[] iArr) {
        this.gradientTopColor = iArr[0];
        this.gradientBottomColor = iArr[1];
        bitmap.recycle();
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$setupGradient$7(Runnable runnable, int[] iArr) {
        this.gradientTopColor = iArr[0];
        this.gradientBottomColor = iArr[1];
        if (runnable != null) {
            runnable.run();
        }
    }

    public static StoryEntry fromVideoShoot(File file, String str, long j) {
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.fromCamera = true;
        storyEntry.file = file;
        storyEntry.fileDeletable = true;
        storyEntry.orientation = 0;
        storyEntry.invert = 0;
        storyEntry.isVideo = true;
        storyEntry.duration = j;
        storyEntry.thumbPath = str;
        storyEntry.left = 0.0f;
        storyEntry.right = Math.min(1.0f, 59500.0f / ((float) j));
        return storyEntry;
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3;
        int i4;
        double min = (options.outHeight > i2 || options.outWidth > i) ? Math.min((int) Math.ceil(i3 / i2), (int) Math.ceil(i4 / i)) : 1;
        return Math.max(1, (int) Math.pow(min, Math.floor(Math.log(min) / Math.log(2.0d))));
    }

    public static void setupScale(BitmapFactory.Options options, int i, int i2) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (!((((long) (i3 * i4)) * 4) * 2 <= maxMemory) || Math.max(i3, i4) > 4200 || SharedConfig.getDevicePerformanceClass() <= 0) {
            options.inScaled = true;
            options.inDensity = options.outWidth;
            options.inTargetDensity = i;
        }
    }

    public void getVideoEditedInfo(final Utilities.Callback<VideoEditedInfo> callback) {
        int i;
        if (!wouldBeVideo()) {
            callback.run(null);
            return;
        }
        if (!this.isVideo && ((i = this.resultWidth) > 720 || this.resultHeight > 1280)) {
            float f = 720.0f / i;
            this.matrix.postScale(f, f, 0.0f, 0.0f);
            this.resultWidth = 720;
            this.resultHeight = 1280;
        }
        File file = this.file;
        final String absolutePath = file != null ? file.getAbsolutePath() : null;
        final int[] iArr = new int[11];
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StoryEntry.this.lambda$getVideoEditedInfo$8(absolutePath, iArr, callback);
            }
        };
        if (this.file == null) {
            runnable.run();
        } else {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StoryEntry.lambda$getVideoEditedInfo$9(absolutePath, iArr, runnable);
                }
            });
        }
    }

    public void lambda$getVideoEditedInfo$8(String str, int[] iArr, Utilities.Callback callback) {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList;
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.isStory = true;
        videoEditedInfo.fromCamera = this.fromCamera;
        videoEditedInfo.originalWidth = this.width;
        videoEditedInfo.originalHeight = this.height;
        videoEditedInfo.resultWidth = this.resultWidth;
        videoEditedInfo.resultHeight = this.resultHeight;
        File file = this.paintFile;
        videoEditedInfo.paintPath = file == null ? null : file.getPath();
        File file2 = this.messageFile;
        videoEditedInfo.messagePath = file2 == null ? null : file2.getPath();
        File file3 = this.messageVideoMaskFile;
        videoEditedInfo.messageVideoMaskPath = file3 == null ? null : file3.getPath();
        File file4 = this.backgroundFile;
        videoEditedInfo.backgroundPath = file4 == null ? null : file4.getPath();
        int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
        if (this.isVideo && str != null) {
            videoEditedInfo.originalPath = str;
            videoEditedInfo.isPhoto = false;
            videoEditedInfo.framerate = Math.min(59, iArr[7]);
            int videoBitrate = MediaController.getVideoBitrate(str);
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            videoEditedInfo.originalBitrate = videoBitrate;
            if (videoBitrate < 1000000 && (arrayList = this.mediaEntities) != null && !arrayList.isEmpty()) {
                videoEditedInfo.bitrate = 2000000;
                videoEditedInfo.originalBitrate = -1;
            } else {
                int i = videoEditedInfo.originalBitrate;
                if (i < 500000) {
                    videoEditedInfo.bitrate = 2500000;
                    videoEditedInfo.originalBitrate = -1;
                } else {
                    videoEditedInfo.bitrate = Utilities.clamp(i, 3000000, 500000);
                }
            }
            FileLog.d("story bitrate, original = " + videoEditedInfo.originalBitrate + " => " + videoEditedInfo.bitrate);
            long j = (long) iArr[4];
            this.duration = j;
            videoEditedInfo.originalDuration = j * 1000;
            long j2 = ((long) (this.left * ((float) j))) * 1000;
            videoEditedInfo.startTime = j2;
            long j3 = this.right * ((float) j) * 1000;
            videoEditedInfo.endTime = j3;
            videoEditedInfo.estimatedDuration = j3 - j2;
            videoEditedInfo.volume = this.videoVolume;
            videoEditedInfo.muted = this.muted;
            videoEditedInfo.estimatedSize = iArr[5] + (((iArr[4] / 1000.0f) * extractRealEncoderBitrate) / 8.0f);
            videoEditedInfo.estimatedSize = Math.max(this.file.length(), videoEditedInfo.estimatedSize);
            videoEditedInfo.filterState = this.filterState;
            File file5 = this.paintBlurFile;
            videoEditedInfo.blurPath = file5 == null ? null : file5.getPath();
        } else {
            File file6 = this.filterFile;
            if (file6 != null) {
                videoEditedInfo.originalPath = file6.getAbsolutePath();
            } else {
                videoEditedInfo.originalPath = str;
            }
            videoEditedInfo.isPhoto = true;
            if (this.round != null) {
                long j4 = (this.roundRight - this.roundLeft) * ((float) this.roundDuration);
                this.duration = j4;
                videoEditedInfo.originalDuration = j4;
                videoEditedInfo.estimatedDuration = j4;
            } else if (this.audioPath != null) {
                long j5 = (this.audioRight - this.audioLeft) * ((float) this.audioDuration);
                this.duration = j5;
                videoEditedInfo.originalDuration = j5;
                videoEditedInfo.estimatedDuration = j5;
            } else {
                long j6 = this.averageDuration;
                this.duration = j6;
                videoEditedInfo.originalDuration = j6;
                videoEditedInfo.estimatedDuration = j6;
            }
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
            videoEditedInfo.muted = true;
            videoEditedInfo.originalBitrate = -1;
            videoEditedInfo.volume = 1.0f;
            videoEditedInfo.bitrate = -1;
            videoEditedInfo.framerate = 30;
            videoEditedInfo.estimatedSize = ((((float) this.duration) / 1000.0f) * extractRealEncoderBitrate) / 8.0f;
            videoEditedInfo.filterState = null;
        }
        videoEditedInfo.account = this.currentAccount;
        videoEditedInfo.wallpaperPeerId = this.backgroundWallpaperPeerId;
        videoEditedInfo.isDark = this.isDark;
        videoEditedInfo.avatarStartTime = -1L;
        MediaController.CropState cropState = new MediaController.CropState();
        videoEditedInfo.cropState = cropState;
        cropState.useMatrix = new Matrix();
        videoEditedInfo.cropState.useMatrix.set(this.matrix);
        videoEditedInfo.mediaEntities = this.mediaEntities;
        videoEditedInfo.gradientTopColor = Integer.valueOf(this.gradientTopColor);
        videoEditedInfo.gradientBottomColor = Integer.valueOf(this.gradientBottomColor);
        videoEditedInfo.forceFragmenting = true;
        videoEditedInfo.hdrInfo = this.hdrInfo;
        videoEditedInfo.mixedSoundInfos.clear();
        File file7 = this.round;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo.volume = this.roundVolume;
            float f = this.roundLeft;
            long j7 = this.roundDuration;
            mixedSoundInfo.audioOffset = ((float) j7) * f * 1000;
            if (this.isVideo) {
                mixedSoundInfo.startTime = (((float) this.roundOffset) - (this.left * ((float) this.duration))) * 1000;
            } else {
                mixedSoundInfo.startTime = 0L;
            }
            mixedSoundInfo.duration = (this.roundRight - f) * ((float) j7) * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
        }
        String str2 = this.audioPath;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo2.volume = this.audioVolume;
            float f2 = this.audioLeft;
            long j8 = this.audioDuration;
            mixedSoundInfo2.audioOffset = ((float) j8) * f2 * 1000;
            if (this.isVideo) {
                mixedSoundInfo2.startTime = (((float) this.audioOffset) - (this.left * ((float) this.duration))) * 1000;
            } else {
                mixedSoundInfo2.startTime = 0L;
            }
            mixedSoundInfo2.duration = (this.audioRight - f2) * ((float) j8) * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
        }
        callback.run(videoEditedInfo);
    }

    public static void lambda$getVideoEditedInfo$9(String str, int[] iArr, Runnable runnable) {
        AnimatedFileDrawable.getVideoInfo(str, iArr);
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static File makeCacheFile(int i, boolean z) {
        return makeCacheFile(i, z ? "mp4" : "jpg");
    }

    public static File makeCacheFile(int i, String str) {
        TLRPC$TL_videoSize_layer127 tLRPC$TL_videoSize_layer127;
        TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated = new TLRPC$TL_fileLocationToBeDeprecated();
        tLRPC$TL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tLRPC$TL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
        tLRPC$TL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        tLRPC$TL_fileLocationToBeDeprecated.file_reference = new byte[0];
        if ("mp4".equals(str) || "webm".equals(str)) {
            TLRPC$TL_videoSize_layer127 tLRPC$TL_videoSize_layer1272 = new TLRPC$TL_videoSize_layer127();
            tLRPC$TL_videoSize_layer1272.location = tLRPC$TL_fileLocationToBeDeprecated;
            tLRPC$TL_videoSize_layer127 = tLRPC$TL_videoSize_layer1272;
        } else {
            ?? tLRPC$TL_photoSize_layer127 = new TLRPC$TL_photoSize_layer127();
            tLRPC$TL_photoSize_layer127.location = tLRPC$TL_fileLocationToBeDeprecated;
            tLRPC$TL_videoSize_layer127 = tLRPC$TL_photoSize_layer127;
        }
        return FileLoader.getInstance(i).getPathToAttach(tLRPC$TL_videoSize_layer127, str, true);
    }

    public static class HDRInfo {
        public int colorRange;
        public int colorStandard;
        public int colorTransfer;

        public int getHDRType() {
            if (this.colorStandard == 6) {
                int i = this.colorTransfer;
                if (i == 7) {
                    return 1;
                }
                return i == 6 ? 2 : 0;
            }
            return 0;
        }
    }

    public void detectHDR(final Utilities.Callback<HDRInfo> callback) {
        if (callback == null) {
            return;
        }
        HDRInfo hDRInfo = this.hdrInfo;
        if (hDRInfo != null) {
            callback.run(hDRInfo);
        } else if (!this.isVideo || Build.VERSION.SDK_INT < 24) {
            HDRInfo hDRInfo2 = new HDRInfo();
            this.hdrInfo = hDRInfo2;
            callback.run(hDRInfo2);
        } else {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StoryEntry.this.lambda$detectHDR$11(callback);
                }
            });
        }
    }

    public void lambda$detectHDR$11(final Utilities.Callback callback) {
        Runnable runnable;
        try {
            try {
                HDRInfo hDRInfo = this.hdrInfo;
                if (hDRInfo == null) {
                    hDRInfo = new HDRInfo();
                    this.hdrInfo = hDRInfo;
                }
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(this.file.getAbsolutePath());
                int findTrack = MediaController.findTrack(mediaExtractor, false);
                mediaExtractor.selectTrack(findTrack);
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                if (trackFormat.containsKey("color-transfer")) {
                    hDRInfo.colorTransfer = trackFormat.getInteger("color-transfer");
                }
                if (trackFormat.containsKey("color-standard")) {
                    hDRInfo.colorStandard = trackFormat.getInteger("color-standard");
                }
                if (trackFormat.containsKey("color-range")) {
                    hDRInfo.colorRange = trackFormat.getInteger("color-range");
                }
                this.hdrInfo = this.hdrInfo;
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        StoryEntry.this.lambda$detectHDR$10(callback);
                    }
                };
            } catch (Exception e) {
                FileLog.e(e);
                this.hdrInfo = this.hdrInfo;
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        StoryEntry.this.lambda$detectHDR$10(callback);
                    }
                };
            }
            AndroidUtilities.runOnUIThread(runnable);
        } catch (Throwable th) {
            this.hdrInfo = this.hdrInfo;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoryEntry.this.lambda$detectHDR$10(callback);
                }
            });
            throw th;
        }
    }

    public void lambda$detectHDR$10(Utilities.Callback callback) {
        callback.run(this.hdrInfo);
    }

    public void checkStickers(final TL_stories$StoryItem tL_stories$StoryItem) {
        if (tL_stories$StoryItem == null || tL_stories$StoryItem.media == null) {
            return;
        }
        final TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers = new TLRPC$TL_messages_getAttachedStickers();
        TLRPC$MessageMedia tLRPC$MessageMedia = tL_stories$StoryItem.media;
        TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia.photo;
        if (tLRPC$Photo != null) {
            if (!tLRPC$Photo.has_stickers) {
                return;
            }
            TLRPC$TL_inputStickeredMediaPhoto tLRPC$TL_inputStickeredMediaPhoto = new TLRPC$TL_inputStickeredMediaPhoto();
            TLRPC$TL_inputPhoto tLRPC$TL_inputPhoto = new TLRPC$TL_inputPhoto();
            tLRPC$TL_inputStickeredMediaPhoto.id = tLRPC$TL_inputPhoto;
            tLRPC$TL_inputPhoto.id = tLRPC$Photo.id;
            tLRPC$TL_inputPhoto.access_hash = tLRPC$Photo.access_hash;
            byte[] bArr = tLRPC$Photo.file_reference;
            tLRPC$TL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tLRPC$TL_inputPhoto.file_reference = new byte[0];
            }
            tLRPC$TL_messages_getAttachedStickers.media = tLRPC$TL_inputStickeredMediaPhoto;
        } else {
            TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
            if (tLRPC$Document == null || !MessageObject.isDocumentHasAttachedStickers(tLRPC$Document)) {
                return;
            }
            TLRPC$TL_inputStickeredMediaDocument tLRPC$TL_inputStickeredMediaDocument = new TLRPC$TL_inputStickeredMediaDocument();
            TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
            tLRPC$TL_inputStickeredMediaDocument.id = tLRPC$TL_inputDocument;
            tLRPC$TL_inputDocument.id = tLRPC$Document.id;
            tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
            byte[] bArr2 = tLRPC$Document.file_reference;
            tLRPC$TL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tLRPC$TL_inputDocument.file_reference = new byte[0];
            }
            tLRPC$TL_messages_getAttachedStickers.media = tLRPC$TL_inputStickeredMediaDocument;
        }
        final RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoryEntry.this.lambda$checkStickers$13(tLObject, tLRPC$TL_error);
            }
        };
        this.checkStickersReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getAttachedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoryEntry.this.lambda$checkStickers$14(tL_stories$StoryItem, tLRPC$TL_messages_getAttachedStickers, requestDelegate, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkStickers$13(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryEntry.this.lambda$checkStickers$12(tLObject);
            }
        });
    }

    public void lambda$checkStickers$12(TLObject tLObject) {
        this.checkStickersReqId = 0;
        if (tLObject instanceof TLRPC$Vector) {
            this.editStickers = new ArrayList();
            TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
            for (int i = 0; i < tLRPC$Vector.objects.size(); i++) {
                TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) tLRPC$Vector.objects.get(i);
                TLRPC$Document tLRPC$Document = tLRPC$StickerSetCovered.cover;
                if (tLRPC$Document == null && !tLRPC$StickerSetCovered.covers.isEmpty()) {
                    tLRPC$Document = tLRPC$StickerSetCovered.covers.get(0);
                }
                if (tLRPC$Document == null && (tLRPC$StickerSetCovered instanceof TLRPC$TL_stickerSetFullCovered)) {
                    TLRPC$TL_stickerSetFullCovered tLRPC$TL_stickerSetFullCovered = (TLRPC$TL_stickerSetFullCovered) tLRPC$StickerSetCovered;
                    if (!tLRPC$TL_stickerSetFullCovered.documents.isEmpty()) {
                        tLRPC$Document = tLRPC$TL_stickerSetFullCovered.documents.get(0);
                    }
                }
                if (tLRPC$Document != null) {
                    TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
                    tLRPC$TL_inputDocument.id = tLRPC$Document.id;
                    tLRPC$TL_inputDocument.access_hash = tLRPC$Document.access_hash;
                    tLRPC$TL_inputDocument.file_reference = tLRPC$Document.file_reference;
                    this.editStickers.add(tLRPC$TL_inputDocument);
                }
            }
        }
    }

    public void lambda$checkStickers$14(TL_stories$StoryItem tL_stories$StoryItem, TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers, RequestDelegate requestDelegate, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text) && tL_stories$StoryItem != null) {
            FileRefController.getInstance(this.currentAccount).requestReference(tL_stories$StoryItem, tLRPC$TL_messages_getAttachedStickers, requestDelegate);
        } else {
            requestDelegate.run(tLObject, tLRPC$TL_error);
        }
    }

    public void cancelCheckStickers() {
        if (this.checkStickersReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.checkStickersReqId, true);
        }
    }

    public StoryEntry copy() {
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.draftId = this.draftId;
        storyEntry.isDraft = this.isDraft;
        storyEntry.draftDate = this.draftDate;
        storyEntry.editStoryPeerId = this.editStoryPeerId;
        storyEntry.editStoryId = this.editStoryId;
        storyEntry.isEdit = this.isEdit;
        storyEntry.isEditSaved = this.isEditSaved;
        storyEntry.fileDuration = this.fileDuration;
        storyEntry.editedMedia = this.editedMedia;
        storyEntry.editedCaption = this.editedCaption;
        storyEntry.editedPrivacy = this.editedPrivacy;
        storyEntry.editedMediaAreas = this.editedMediaAreas;
        storyEntry.isError = this.isError;
        storyEntry.error = this.error;
        storyEntry.audioPath = this.audioPath;
        storyEntry.audioAuthor = this.audioAuthor;
        storyEntry.audioTitle = this.audioTitle;
        storyEntry.audioDuration = this.audioDuration;
        storyEntry.audioOffset = this.audioOffset;
        storyEntry.audioLeft = this.audioLeft;
        storyEntry.audioRight = this.audioRight;
        storyEntry.audioVolume = this.audioVolume;
        storyEntry.editDocumentId = this.editDocumentId;
        storyEntry.editPhotoId = this.editPhotoId;
        storyEntry.editExpireDate = this.editExpireDate;
        storyEntry.isVideo = this.isVideo;
        storyEntry.file = this.file;
        storyEntry.fileDeletable = this.fileDeletable;
        storyEntry.thumbPath = this.thumbPath;
        storyEntry.muted = this.muted;
        storyEntry.left = this.left;
        storyEntry.right = this.right;
        storyEntry.duration = this.duration;
        storyEntry.width = this.width;
        storyEntry.height = this.height;
        storyEntry.resultWidth = this.resultWidth;
        storyEntry.resultHeight = this.resultHeight;
        storyEntry.peer = this.peer;
        storyEntry.invert = this.invert;
        storyEntry.matrix.set(this.matrix);
        storyEntry.gradientTopColor = this.gradientTopColor;
        storyEntry.gradientBottomColor = this.gradientBottomColor;
        storyEntry.caption = this.caption;
        storyEntry.captionEntitiesAllowed = this.captionEntitiesAllowed;
        storyEntry.privacy = this.privacy;
        storyEntry.privacyRules.clear();
        storyEntry.privacyRules.addAll(this.privacyRules);
        storyEntry.pinned = this.pinned;
        storyEntry.allowScreenshots = this.allowScreenshots;
        storyEntry.period = this.period;
        storyEntry.shareUserIds = this.shareUserIds;
        storyEntry.silent = this.silent;
        storyEntry.scheduleDate = this.scheduleDate;
        storyEntry.blurredVideoThumb = this.blurredVideoThumb;
        storyEntry.uploadThumbFile = this.uploadThumbFile;
        storyEntry.draftThumbFile = this.draftThumbFile;
        storyEntry.paintFile = this.paintFile;
        storyEntry.messageFile = this.messageFile;
        storyEntry.backgroundFile = this.backgroundFile;
        storyEntry.paintBlurFile = this.paintBlurFile;
        storyEntry.paintEntitiesFile = this.paintEntitiesFile;
        storyEntry.averageDuration = this.averageDuration;
        storyEntry.mediaEntities = new ArrayList<>();
        if (this.mediaEntities != null) {
            for (int i = 0; i < this.mediaEntities.size(); i++) {
                storyEntry.mediaEntities.add(this.mediaEntities.get(i).copy());
            }
        }
        storyEntry.stickers = this.stickers;
        storyEntry.editStickers = this.editStickers;
        storyEntry.filterFile = this.filterFile;
        storyEntry.filterState = this.filterState;
        storyEntry.thumbBitmap = this.thumbBitmap;
        storyEntry.fromCamera = this.fromCamera;
        storyEntry.thumbPathBitmap = this.thumbPathBitmap;
        storyEntry.isRepost = this.isRepost;
        storyEntry.round = this.round;
        storyEntry.roundLeft = this.roundLeft;
        storyEntry.roundRight = this.roundRight;
        storyEntry.roundDuration = this.roundDuration;
        storyEntry.roundThumb = this.roundThumb;
        storyEntry.roundOffset = this.roundOffset;
        storyEntry.roundVolume = this.roundVolume;
        storyEntry.isEditingCover = this.isEditingCover;
        storyEntry.botId = this.botId;
        storyEntry.botLang = this.botLang;
        storyEntry.editingBotPreview = this.editingBotPreview;
        storyEntry.cover = this.cover;
        return storyEntry;
    }

    public static long getCoverTime(TL_stories$StoryItem tL_stories$StoryItem) {
        TLRPC$MessageMedia tLRPC$MessageMedia;
        TLRPC$Document tLRPC$Document;
        if (tL_stories$StoryItem == null || (tLRPC$MessageMedia = tL_stories$StoryItem.media) == null || (tLRPC$Document = tLRPC$MessageMedia.document) == null) {
            return 0L;
        }
        TLRPC$TL_documentAttributeVideo tLRPC$TL_documentAttributeVideo = null;
        int i = 0;
        while (true) {
            if (i >= tLRPC$Document.attributes.size()) {
                break;
            } else if (tLRPC$Document.attributes.get(i) instanceof TLRPC$TL_documentAttributeVideo) {
                tLRPC$TL_documentAttributeVideo = (TLRPC$TL_documentAttributeVideo) tLRPC$Document.attributes.get(i);
                break;
            } else {
                i++;
            }
        }
        if (tLRPC$TL_documentAttributeVideo == null) {
            return 0L;
        }
        return (long) (tLRPC$TL_documentAttributeVideo.video_start_ts * 1000.0d);
    }
}
