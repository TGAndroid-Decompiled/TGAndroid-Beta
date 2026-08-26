package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda140;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda7;

public final class StoryEntry {
    public HashSet albums;
    public boolean allowScreenshots;
    public String audioAuthor;
    public TLRPC.InputDocument audioDocument;
    public long audioDuration;
    public float audioLeft;
    public long audioOffset;
    public String audioPath;
    public String audioTitle;
    public Drawable backgroundDrawable;
    public File backgroundFile;
    public Bitmap blurredVideoThumb;
    public long botId;
    public CharSequence caption;
    public CollageLayout collage;
    public ArrayList collageContent;
    public Bitmap coverBitmap;
    public boolean coverSet;
    public MediaController.CropState crop;
    public long draftDate;
    public long draftId;
    public File draftThumbFile;
    public long duration;
    public long editDocumentId;
    public long editExpireDate;
    public long editPhotoId;
    public ArrayList editStickers;
    public int editStoryId;
    public long editStoryPeerId;
    public boolean editedCaption;
    public boolean editedMedia;
    public ArrayList editedMediaAreas;
    public boolean editedPrivacy;
    public TLRPC.InputMedia editingBotPreview;
    public TLRPC.Document editingCoverDocument;
    public TLRPC.TL_error error;
    public File file;
    public boolean fileDeletable;
    public File filterFile;
    public MediaController.SavedFilterState filterState;
    public boolean fromCamera;
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
    public boolean isShare;
    public boolean isVideo;
    public float left;
    public ArrayList mediaEntities;
    public File messageFile;
    public ArrayList messageObjects;
    public File messageVideoMaskFile;
    public boolean muted;
    public int orientation;
    public File paintBlurFile;
    public File paintEntitiesFile;
    public File paintFile;
    public TLRPC.InputPeer peer;
    public StoryPrivacyBottomSheet.StoryPrivacy privacy;
    public String repostCaption;
    public TLRPC.MessageMedia repostMedia;
    public TLRPC.Peer repostPeer;
    public SpannableStringBuilder repostPeerName;
    public int repostStoryId;
    public File round;
    public long roundDuration;
    public float roundLeft;
    public long roundOffset;
    public String roundThumb;
    public ArrayList stickers;
    public Bitmap thumbBitmap;
    public String thumbPath;
    public Bitmap thumbPathBitmap;
    public StarGiftSheet$$ExternalSyntheticLambda140 updateDocumentRef;
    public File uploadThumbFile;
    public long videoOffset;
    public int width;
    public final int currentAccount = UserConfig.selectedAccount;
    public double fileDuration = -1.0d;
    public float audioRight = 1.0f;
    public float audioVolume = 1.0f;
    public float videoVolume = 1.0f;
    public boolean videoLoop = false;
    public float videoLeft = 0.0f;
    public float videoRight = 1.0f;
    public float right = 1.0f;
    public long cover = -1;
    public int resultWidth = 720;
    public int resultHeight = 1280;
    public final Matrix matrix = new Matrix();
    public float roundRight = 1.0f;
    public float roundVolume = 1.0f;
    public boolean isDark = Theme.currentTheme.isDark();
    public long backgroundWallpaperPeerId = Long.MIN_VALUE;
    public boolean captionEntitiesAllowed = true;
    public final ArrayList privacyRules = new ArrayList();
    public boolean pinned = true;
    public int period = 86400;
    public String botLang = "";
    public long averageDuration = 5000;
    public int checkStickersReqId = 0;

    public interface DecodeBitmap {
        Bitmap decode(BitmapFactory.Options options);
    }

    public final class HDRInfo {
        public int colorStandard;
        public int colorTransfer;

        public final int getHDRType() {
            if (this.colorStandard != 6) {
                return 0;
            }
            int i = this.colorTransfer;
            if (i == 7) {
                return 1;
            }
            return i == 6 ? 2 : 0;
        }
    }

    public static StoryEntry asCollage(CollageLayout collageLayout, ArrayList arrayList) {
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.collage = collageLayout;
        storyEntry.collageContent = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            StoryEntry storyEntry2 = (StoryEntry) obj;
            if (storyEntry2.isVideo) {
                storyEntry.isVideo = true;
                storyEntry2.videoLeft = 0.0f;
                storyEntry2.videoRight = Math.min(1.0f, 59000.0f / storyEntry2.duration);
            }
        }
        if (storyEntry.isVideo) {
            storyEntry.width = 720;
            storyEntry.height = 1280;
            storyEntry.resultWidth = 720;
            storyEntry.resultHeight = 1280;
        } else {
            storyEntry.width = 1080;
            storyEntry.height = 1920;
            storyEntry.resultWidth = 1080;
            storyEntry.resultHeight = 1920;
        }
        storyEntry.setupMatrix();
        return storyEntry;
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        double dMin = (i3 > i2 || i4 > i) ? Math.min((int) Math.ceil(i3 / i2), (int) Math.ceil(i4 / i)) : 1;
        return Math.max(1, (int) Math.pow(dMin, Math.floor(Math.log(dMin) / Math.log(2.0d))));
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
            float fMax = Math.max(i / width, i2 / height);
            drawable.setBounds(0, 0, (int) (width * fMax), (int) (height * fMax));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
        }
        drawable.setBounds(rect);
        drawable.setCallback(callback);
    }

    public static String ext(File file) {
        String path;
        int iLastIndexOf;
        if (file != null && (iLastIndexOf = (path = file.getPath()).lastIndexOf(46)) > 0) {
            return path.substring(iLastIndexOf + 1);
        }
        return null;
    }

    public static StoryEntry fromPhotoEntry(MediaController.PhotoEntry photoEntry) {
        int i;
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.file = new File(photoEntry.path);
        storyEntry.orientation = photoEntry.orientation;
        storyEntry.invert = photoEntry.invert;
        storyEntry.isVideo = !photoEntry.isLivePhoto() && photoEntry.isVideo;
        storyEntry.thumbPath = photoEntry.thumbPath;
        long j = ((long) photoEntry.duration) * 1000;
        storyEntry.duration = j;
        storyEntry.left = 0.0f;
        storyEntry.right = Math.min(1.0f, 59000.0f / j);
        if (storyEntry.isVideo && storyEntry.thumbPath == null) {
            storyEntry.thumbPath = "vthumb://" + photoEntry.imageId;
        }
        storyEntry.gradientTopColor = photoEntry.gradientTopColor;
        storyEntry.gradientBottomColor = photoEntry.gradientBottomColor;
        storyEntry.decodeBounds(storyEntry.file.getAbsolutePath());
        int i2 = photoEntry.width;
        if (i2 > 0 && (i = photoEntry.height) > 0) {
            storyEntry.width = i2;
            storyEntry.height = i;
        }
        storyEntry.setupMatrix();
        return storyEntry;
    }

    public static StoryEntry fromPhotoShoot(int i, File file) {
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

    public static StoryEntry fromStoryItem(File file, TL_stories.StoryItem storyItem) {
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.isEdit = true;
        storyEntry.editStoryId = storyItem.id;
        storyEntry.file = file;
        storyEntry.fileDeletable = false;
        storyEntry.width = 720;
        storyEntry.height = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i = storyEntry.currentAccount;
        if (z) {
            storyEntry.isVideo = false;
            if (file != null) {
                storyEntry.decodeBounds(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            storyEntry.isVideo = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                for (int i2 = 0; i2 < storyItem.media.document.attributes.size(); i2++) {
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        storyEntry.width = documentAttribute.w;
                        storyEntry.height = documentAttribute.h;
                        storyEntry.fileDuration = documentAttribute.duration;
                        break;
                    }
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    storyEntry.thumbPath = str;
                } else if (document2.thumbs != null) {
                    for (int i3 = 0; i3 < storyItem.media.document.thumbs.size(); i3++) {
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i3);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            storyEntry.thumbPathBitmap = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                            break;
                        }
                        File pathToAttach = FileLoader.getInstance(i).getPathToAttach(photoSize, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            storyEntry.thumbPath = pathToAttach.getAbsolutePath();
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = storyEntry.privacyRules;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        MessagesController messagesController = MessagesController.getInstance(i);
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            TLRPC.PrivacyRule privacyRule = arrayList2.get(i4);
            if (privacyRule != null) {
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowCloseFriends) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    for (int i5 = 0; i5 < tL_privacyValueDisallowUsers.users.size(); i5++) {
                        TLRPC.InputUser inputUser = messagesController.getInputUser(tL_privacyValueDisallowUsers.users.get(i5).longValue());
                        if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i6 = 0; i6 < tL_privacyValueAllowUsers.users.size(); i6++) {
                        TLRPC.InputUser inputUser2 = messagesController.getInputUser(tL_privacyValueAllowUsers.users.get(i6).longValue());
                        if (!(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        storyEntry.period = storyItem.expire_date - storyItem.date;
        try {
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(new SpannableString(storyItem.caption), Theme.chat_msgTextPaint.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(charSequenceReplaceEmoji, storyItem.entities, true, false, true, false);
            storyEntry.caption = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, storyItem.entities, Theme.chat_msgTextPaint.getFontMetricsInt());
        } catch (Exception unused) {
        }
        storyEntry.setupMatrix();
        storyEntry.checkStickers(storyItem);
        storyEntry.editedMediaAreas = storyItem.media_areas;
        storyEntry.peer = MessagesController.getInstance(i).getInputPeer(storyItem.dialogId);
        return storyEntry;
    }

    public static Bitmap getScaledBitmap(DecodeBitmap decodeBitmap, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if (i3 == 90 || i3 == 270) {
            i4 = i;
            i5 = i2;
        } else {
            i5 = i;
            i4 = i2;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeBitmap.decode(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i6 = options.outWidth;
        int i7 = options.outHeight;
        boolean z2 = ((double) ((((long) (i5 * i4)) * 4) + (((long) (i6 * i7)) * 4))) * 1.1d <= ((double) jMaxMemory);
        if (i6 <= i5 && i7 <= i4) {
            return decodeBitmap.decode(options);
        }
        if (z && z2 && SharedConfig.getDevicePerformanceClass() >= 1) {
            Bitmap bitmapDecode = decodeBitmap.decode(options);
            float fMax = Math.max(i5 / bitmapDecode.getWidth(), i4 / bitmapDecode.getHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (bitmapDecode.getWidth() * fMax), (int) (bitmapDecode.getHeight() * fMax), Bitmap.Config.ARGB_8888);
            Utilities.libyuvARGBSaleBitmap(bitmapDecode, bitmapCreateBitmap, Utilities.libyuv_ScaleFilter.Box);
            Utilities.clamp(Math.round(1.0f / fMax), 8, 0);
            return bitmapCreateBitmap;
        }
        options.inScaled = true;
        int i8 = options.outWidth;
        float f = i5 / i8;
        int i9 = options.outHeight;
        if (f > i4 / i9) {
            options.inDensity = i8;
            options.inTargetDensity = i5;
        } else {
            options.inDensity = i9;
            options.inTargetDensity = i4;
        }
        return decodeBitmap.decode(options);
    }

    public static boolean isAnimated(TLRPC.Document document, String str) {
        if (document != null) {
            return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type) || (MessageObject.isAnimatedStickerDocument(document, true) && RLottieNative.getFramesCount(str, null) > 1);
        }
        return false;
    }

    public static File makeCacheFile(int i, String str) {
        TLObject tLObject;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
        tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        if ("mp4".equals(str) || "webm".equals(str)) {
            TLRPC.TL_videoSize_layer127 tL_videoSize_layer127 = new TLRPC.TL_videoSize_layer127();
            tL_videoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tLObject = tL_videoSize_layer127;
        } else {
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tLObject = tL_photoSize_layer127;
        }
        return FileLoader.getInstance(i).getPathToAttach(tLObject, str, true);
    }

    public static StoryEntry repostMessage(ArrayList arrayList) {
        long peerDialogId;
        MessageObject messageObject;
        int i;
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.isRepostMessage = true;
        storyEntry.messageObjects = arrayList;
        storyEntry.resultWidth = 1080;
        storyEntry.resultHeight = 1920;
        MessageObject messageObject2 = (MessageObject) arrayList.get(0);
        Boolean boolUseForwardForRepost = useForwardForRepost(messageObject2);
        if (boolUseForwardForRepost == null) {
            peerDialogId = 0;
        } else {
            peerDialogId = boolUseForwardForRepost.booleanValue() ? DialogObject.getPeerDialogId(messageObject2.messageOwner.fwd_from.from_id) : messageObject2.getDialogId();
        }
        storyEntry.backgroundWallpaperPeerId = peerDialogId;
        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
        mediaEntity.type = (byte) 6;
        mediaEntity.x = 0.5f;
        mediaEntity.y = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        storyEntry.mediaEntities = arrayList2;
        arrayList2.add(mediaEntity);
        if (arrayList.size() == 1 && (messageObject = (MessageObject) arrayList.get(0)) != null && ((i = messageObject.type) == 8 || i == 3 || i == 5)) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.attachPath != null) {
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
                storyEntry.right = Math.min(1.0f, 59500.0f / duration);
                return storyEntry;
            }
            storyEntry.file = null;
        }
        return storyEntry;
    }

    public static void setupScale(BitmapFactory.Options options, int i) {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (((long) (i2 * i3)) * 8 > jMaxMemory || Math.max(i2, i3) > 4200 || SharedConfig.getDevicePerformanceClass() <= 0) {
            options.inScaled = true;
            options.inDensity = options.outWidth;
            options.inTargetDensity = i;
        }
    }

    public static Boolean useForwardForRepost(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.Peer peer;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return null;
        }
        TLRPC.Chat chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(message.peer_id)));
        if ((chat == null || !chat.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat)) {
            return Boolean.FALSE;
        }
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
            long peerDialogId = DialogObject.getPeerDialogId(peer);
            TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
            if (peerDialogId < 0 && ((chat2 == null || !chat2.noforwards) && ChatObject.isChannelAndNotMegaGroup(chat2))) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    public final Bitmap buildBitmap(Bitmap bitmap, float f) {
        Matrix matrix;
        boolean z;
        final int i;
        Matrix matrix2;
        Bitmap bitmap2;
        float f2;
        final File file;
        int i2;
        StoryEntry storyEntry;
        final File file2;
        Bitmap bitmap3;
        int i3;
        Bitmap scaledBitmap;
        int width;
        int height;
        Pair<Integer, Integer> imageOrientation;
        Matrix matrix3 = new Matrix();
        Paint paint = new Paint(7);
        int i4 = (int) (this.resultWidth * f);
        int i5 = (int) (this.resultHeight * f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        final int i6 = 0;
        if (this.backgroundFile == null) {
            matrix = matrix3;
            long j = this.backgroundWallpaperPeerId;
            if (j != Long.MIN_VALUE) {
                Drawable backgroundDrawable = this.backgroundDrawable;
                if (backgroundDrawable == null) {
                    backgroundDrawable = PreviewView.getBackgroundDrawable((Drawable) null, this.currentAccount, j, this.isDark);
                }
                drawBackgroundDrawable(canvas, backgroundDrawable, canvas.getWidth(), canvas.getHeight());
            } else {
                Paint paint2 = new Paint(1);
                paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, canvas.getHeight(), new int[]{this.gradientTopColor, this.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                i = 0;
                z = true;
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint2);
            }
            matrix2 = matrix;
            matrix2.set(this.matrix);
            if (bitmap != null) {
                float width2 = this.width / bitmap.getWidth();
                matrix2.preScale(width2, width2);
                matrix2.postScale(f, f);
                canvas.drawBitmap(bitmap, matrix2, paint);
                return bitmapCreateBitmap;
            }
            if (isCollage()) {
                i2 = 0;
                while (i2 < this.collageContent.size()) {
                    storyEntry = (StoryEntry) this.collageContent.get(i2);
                    file2 = storyEntry.filterFile;
                    if (file2 == null) {
                        file2 = storyEntry.file;
                    }
                    if (file2 != null) {
                        try {
                            scaledBitmap = getScaledBitmap(new DecodeBitmap() {
                                @Override
                                public final Bitmap decode(BitmapFactory.Options options) {
                                    switch (i) {
                                        case 0:
                                            break;
                                    }
                                    return BitmapFactory.decodeFile(file2.getPath(), options);
                                }
                            }, i4, i5, i, z);
                            canvas.save();
                            RectF rectF = new RectF();
                            width = scaledBitmap.getWidth();
                            height = scaledBitmap.getHeight();
                            imageOrientation = AndroidUtilities.getImageOrientation(file2);
                            if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == z) {
                                width = scaledBitmap.getHeight();
                                height = scaledBitmap.getWidth();
                            }
                            CollageLayout.Part part = (CollageLayout.Part) this.collage.parts.get(i2);
                            float f3 = i4;
                            float f4 = i5;
                            try {
                                CollageLayout collageLayout = part.layout;
                                bitmap3 = bitmapCreateBitmap;
                                try {
                                    int[] iArr = collageLayout.columns;
                                    int i7 = part.y;
                                    i3 = i2;
                                    try {
                                        float f5 = f3 / iArr[i7];
                                        int i8 = part.x;
                                        float f6 = f4 / collageLayout.h;
                                        rectF.set(i8 * f5, i7 * f6, (i8 + 1) * f5, (i7 + 1) * f6);
                                        canvas.translate(rectF.centerX(), rectF.centerY());
                                        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                        float fMax = Math.max(rectF.width() / width, rectF.height() / height);
                                        canvas.scale(fMax, fMax);
                                        canvas.rotate(((Integer) imageOrientation.first).intValue());
                                        canvas.translate((-scaledBitmap.getWidth()) / 2.0f, (-scaledBitmap.getHeight()) / 2.0f);
                                        try {
                                            canvas.drawBitmap(scaledBitmap, 0.0f, 0.0f, (Paint) null);
                                            canvas.restore();
                                        } catch (Exception e) {
                                            e = e;
                                            FileLog.e(e);
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        FileLog.e(e);
                                        i2 = i3 + 1;
                                        bitmapCreateBitmap = bitmap3;
                                        i = 0;
                                        z = true;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i3 = i2;
                                    FileLog.e(e);
                                    i2 = i3 + 1;
                                    bitmapCreateBitmap = bitmap3;
                                    i = 0;
                                    z = true;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                bitmap3 = bitmapCreateBitmap;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            bitmap3 = bitmapCreateBitmap;
                            i3 = i2;
                        }
                    } else {
                        bitmap3 = bitmapCreateBitmap;
                        i3 = i2;
                    }
                    i2 = i3 + 1;
                    bitmapCreateBitmap = bitmap3;
                    i = 0;
                    z = true;
                }
                bitmap2 = bitmapCreateBitmap;
                f2 = 0.0f;
            } else {
                bitmap2 = bitmapCreateBitmap;
                f2 = 0.0f;
                file = this.filterFile;
                if (file == null) {
                    file = this.file;
                }
                if (file != null) {
                    try {
                        final int i9 = 1;
                        Bitmap scaledBitmap2 = getScaledBitmap(new DecodeBitmap() {
                            @Override
                            public final Bitmap decode(BitmapFactory.Options options) {
                                switch (i9) {
                                    case 0:
                                        break;
                                }
                                return BitmapFactory.decodeFile(file.getPath(), options);
                            }
                        }, i4, i5, this.orientation, true);
                        float width3 = this.width / scaledBitmap2.getWidth();
                        matrix2.preScale(width3, width3);
                        matrix2.postScale(f, f);
                        canvas.drawBitmap(scaledBitmap2, matrix2, paint);
                        scaledBitmap2.recycle();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
            }
            if (this.paintFile != null) {
                try {
                    final int i10 = 1;
                    Bitmap scaledBitmap3 = getScaledBitmap(new DecodeBitmap() {
                        @Override
                        public final Bitmap decode(BitmapFactory.Options options) {
                            switch (i10) {
                                case 0:
                                    return BitmapFactory.decodeFile(this.backgroundFile.getPath(), options);
                                case 1:
                                    return BitmapFactory.decodeFile(this.paintFile.getPath(), options);
                                case 2:
                                    return BitmapFactory.decodeFile(this.messageFile.getPath(), options);
                                default:
                                    return BitmapFactory.decodeFile(this.paintEntitiesFile.getPath(), options);
                            }
                        }
                    }, i4, i5, 0, true);
                    canvas.save();
                    float width4 = this.resultWidth / scaledBitmap3.getWidth();
                    canvas.scale(width4, width4);
                    matrix2.postScale(f, f);
                    canvas.drawBitmap(scaledBitmap3, f2, f2, paint);
                    canvas.restore();
                    scaledBitmap3.recycle();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (this.messageFile != null) {
                try {
                    final int i11 = 2;
                    Bitmap scaledBitmap4 = getScaledBitmap(new DecodeBitmap() {
                        @Override
                        public final Bitmap decode(BitmapFactory.Options options) {
                            switch (i11) {
                                case 0:
                                    return BitmapFactory.decodeFile(this.backgroundFile.getPath(), options);
                                case 1:
                                    return BitmapFactory.decodeFile(this.paintFile.getPath(), options);
                                case 2:
                                    return BitmapFactory.decodeFile(this.messageFile.getPath(), options);
                                default:
                                    return BitmapFactory.decodeFile(this.paintEntitiesFile.getPath(), options);
                            }
                        }
                    }, i4, i5, 0, true);
                    canvas.save();
                    float width5 = this.resultWidth / scaledBitmap4.getWidth();
                    canvas.scale(width5, width5);
                    matrix2.postScale(f, f);
                    canvas.drawBitmap(scaledBitmap4, f2, f2, paint);
                    canvas.restore();
                    scaledBitmap4.recycle();
                } catch (Exception e8) {
                    FileLog.e(e8);
                }
            }
            if (this.paintEntitiesFile != null) {
                return bitmap2;
            }
            try {
                final int i12 = 3;
                Bitmap scaledBitmap5 = getScaledBitmap(new DecodeBitmap() {
                    @Override
                    public final Bitmap decode(BitmapFactory.Options options) {
                        switch (i12) {
                            case 0:
                                return BitmapFactory.decodeFile(this.backgroundFile.getPath(), options);
                            case 1:
                                return BitmapFactory.decodeFile(this.paintFile.getPath(), options);
                            case 2:
                                return BitmapFactory.decodeFile(this.messageFile.getPath(), options);
                            default:
                                return BitmapFactory.decodeFile(this.paintEntitiesFile.getPath(), options);
                        }
                    }
                }, i4, i5, 0, true);
                canvas.save();
                float width6 = this.resultWidth / scaledBitmap5.getWidth();
                canvas.scale(width6, width6);
                matrix2.postScale(f, f);
                canvas.drawBitmap(scaledBitmap5, f2, f2, paint);
                canvas.restore();
                scaledBitmap5.recycle();
                return bitmap2;
            } catch (Exception e9) {
                FileLog.e(e9);
                return bitmap2;
            }
        }
        try {
            Bitmap scaledBitmap6 = getScaledBitmap(new DecodeBitmap() {
                @Override
                public final Bitmap decode(BitmapFactory.Options options) {
                    switch (i6) {
                        case 0:
                            return BitmapFactory.decodeFile(this.backgroundFile.getPath(), options);
                        case 1:
                            return BitmapFactory.decodeFile(this.paintFile.getPath(), options);
                        case 2:
                            return BitmapFactory.decodeFile(this.messageFile.getPath(), options);
                        default:
                            return BitmapFactory.decodeFile(this.paintEntitiesFile.getPath(), options);
                    }
                }
            }, i4, i5, 0, true);
            canvas.save();
            float width7 = this.resultWidth / scaledBitmap6.getWidth();
            canvas.scale(width7, width7);
            matrix3.postScale(f, f);
            canvas.drawBitmap(scaledBitmap6, 0.0f, 0.0f, paint);
            canvas.restore();
            scaledBitmap6.recycle();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        matrix = matrix3;
        i = 0;
        z = true;
        matrix2 = matrix;
        matrix2.set(this.matrix);
        if (bitmap != null) {
            float width8 = this.width / bitmap.getWidth();
            matrix2.preScale(width8, width8);
            matrix2.postScale(f, f);
            canvas.drawBitmap(bitmap, matrix2, paint);
            return bitmapCreateBitmap;
        }
        if (isCollage()) {
            i2 = 0;
            while (i2 < this.collageContent.size()) {
                storyEntry = (StoryEntry) this.collageContent.get(i2);
                file2 = storyEntry.filterFile;
                if (file2 == null) {
                    file2 = storyEntry.file;
                }
                if (file2 != null) {
                    scaledBitmap = getScaledBitmap(new DecodeBitmap() {
                        @Override
                        public final Bitmap decode(BitmapFactory.Options options) {
                            switch (i) {
                                case 0:
                                    break;
                            }
                            return BitmapFactory.decodeFile(file2.getPath(), options);
                        }
                    }, i4, i5, i, z);
                    canvas.save();
                    RectF rectF2 = new RectF();
                    width = scaledBitmap.getWidth();
                    height = scaledBitmap.getHeight();
                    imageOrientation = AndroidUtilities.getImageOrientation(file2);
                    if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == z) {
                        width = scaledBitmap.getHeight();
                        height = scaledBitmap.getWidth();
                    }
                    CollageLayout.Part part2 = (CollageLayout.Part) this.collage.parts.get(i2);
                    float f7 = i4;
                    float f8 = i5;
                    CollageLayout collageLayout2 = part2.layout;
                    bitmap3 = bitmapCreateBitmap;
                    int[] iArr2 = collageLayout2.columns;
                    int i13 = part2.y;
                    i3 = i2;
                    float f9 = f7 / iArr2[i13];
                    int i14 = part2.x;
                    float f10 = f8 / collageLayout2.h;
                    rectF2.set(i14 * f9, i13 * f10, (i14 + 1) * f9, (i13 + 1) * f10);
                    canvas.translate(rectF2.centerX(), rectF2.centerY());
                    canvas.clipRect((-rectF2.width()) / 2.0f, (-rectF2.height()) / 2.0f, rectF2.width() / 2.0f, rectF2.height() / 2.0f);
                    float fMax2 = Math.max(rectF2.width() / width, rectF2.height() / height);
                    canvas.scale(fMax2, fMax2);
                    canvas.rotate(((Integer) imageOrientation.first).intValue());
                    canvas.translate((-scaledBitmap.getWidth()) / 2.0f, (-scaledBitmap.getHeight()) / 2.0f);
                    canvas.drawBitmap(scaledBitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                } else {
                    bitmap3 = bitmapCreateBitmap;
                    i3 = i2;
                }
                i2 = i3 + 1;
                bitmapCreateBitmap = bitmap3;
                i = 0;
                z = true;
            }
            bitmap2 = bitmapCreateBitmap;
            f2 = 0.0f;
        } else {
            bitmap2 = bitmapCreateBitmap;
            f2 = 0.0f;
            file = this.filterFile;
            if (file == null) {
                file = this.file;
            }
            if (file != null) {
                final int i15 = 1;
                Bitmap scaledBitmap7 = getScaledBitmap(new DecodeBitmap() {
                    @Override
                    public final Bitmap decode(BitmapFactory.Options options) {
                        switch (i15) {
                            case 0:
                                break;
                        }
                        return BitmapFactory.decodeFile(file.getPath(), options);
                    }
                }, i4, i5, this.orientation, true);
                float width9 = this.width / scaledBitmap7.getWidth();
                matrix2.preScale(width9, width9);
                matrix2.postScale(f, f);
                canvas.drawBitmap(scaledBitmap7, matrix2, paint);
                scaledBitmap7.recycle();
            }
        }
        if (this.paintFile != null) {
            final int i16 = 1;
            Bitmap scaledBitmap8 = getScaledBitmap(new DecodeBitmap() {
                @Override
                public final Bitmap decode(BitmapFactory.Options options) {
                    switch (i16) {
                        case 0:
                            return BitmapFactory.decodeFile(this.backgroundFile.getPath(), options);
                        case 1:
                            return BitmapFactory.decodeFile(this.paintFile.getPath(), options);
                        case 2:
                            return BitmapFactory.decodeFile(this.messageFile.getPath(), options);
                        default:
                            return BitmapFactory.decodeFile(this.paintEntitiesFile.getPath(), options);
                    }
                }
            }, i4, i5, 0, true);
            canvas.save();
            float width10 = this.resultWidth / scaledBitmap8.getWidth();
            canvas.scale(width10, width10);
            matrix2.postScale(f, f);
            canvas.drawBitmap(scaledBitmap8, f2, f2, paint);
            canvas.restore();
            scaledBitmap8.recycle();
        }
        if (this.messageFile != null) {
            final int i17 = 2;
            Bitmap scaledBitmap9 = getScaledBitmap(new DecodeBitmap() {
                @Override
                public final Bitmap decode(BitmapFactory.Options options) {
                    switch (i17) {
                        case 0:
                            return BitmapFactory.decodeFile(this.backgroundFile.getPath(), options);
                        case 1:
                            return BitmapFactory.decodeFile(this.paintFile.getPath(), options);
                        case 2:
                            return BitmapFactory.decodeFile(this.messageFile.getPath(), options);
                        default:
                            return BitmapFactory.decodeFile(this.paintEntitiesFile.getPath(), options);
                    }
                }
            }, i4, i5, 0, true);
            canvas.save();
            float width11 = this.resultWidth / scaledBitmap9.getWidth();
            canvas.scale(width11, width11);
            matrix2.postScale(f, f);
            canvas.drawBitmap(scaledBitmap9, f2, f2, paint);
            canvas.restore();
            scaledBitmap9.recycle();
        }
        if (this.paintEntitiesFile != null) {
            return bitmap2;
        }
        final int i18 = 3;
        Bitmap scaledBitmap10 = getScaledBitmap(new DecodeBitmap() {
            @Override
            public final Bitmap decode(BitmapFactory.Options options) {
                switch (i18) {
                    case 0:
                        return BitmapFactory.decodeFile(this.backgroundFile.getPath(), options);
                    case 1:
                        return BitmapFactory.decodeFile(this.paintFile.getPath(), options);
                    case 2:
                        return BitmapFactory.decodeFile(this.messageFile.getPath(), options);
                    default:
                        return BitmapFactory.decodeFile(this.paintEntitiesFile.getPath(), options);
                }
            }
        }, i4, i5, 0, true);
        canvas.save();
        float width12 = this.resultWidth / scaledBitmap10.getWidth();
        canvas.scale(width12, width12);
        matrix2.postScale(f, f);
        canvas.drawBitmap(scaledBitmap10, f2, f2, paint);
        canvas.restore();
        scaledBitmap10.recycle();
        return bitmap2;
    }

    public final void buildPhoto(File file) {
        Bitmap bitmapBuildBitmap = buildBitmap(null, 1.0f);
        Bitmap bitmap = this.thumbBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.thumbBitmap = null;
        }
        this.thumbBitmap = Bitmap.createScaledBitmap(bitmapBuildBitmap, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmapBuildBitmap.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        bitmapBuildBitmap.recycle();
    }

    public final void checkStickers(TL_stories.StoryItem storyItem) {
        if (storyItem != null && storyItem.media != null) {
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Photo photo = messageMedia.photo;
            if (photo == null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null && MessageObject.isDocumentHasAttachedStickers(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.id = tL_inputDocument;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.checkStickersReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new GiftSheet$$ExternalSyntheticLambda16(9, this, storyItem, tL_messages_getAttachedStickers, new StoryEntry$$ExternalSyntheticLambda12(this, 0)));
                }
            } else if (photo.has_stickers) {
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                byte[] bArr2 = photo.file_reference;
                tL_inputPhoto.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputPhoto.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                this.checkStickersReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new GiftSheet$$ExternalSyntheticLambda16(9, this, storyItem, tL_messages_getAttachedStickers, new StoryEntry$$ExternalSyntheticLambda12(this, 0)));
            }
        }
    }

    public final void clearPaint() {
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

    public final StoryEntry copy$1() {
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
        storyEntry.audioDocument = this.audioDocument;
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
        boolean z = this.fileDeletable;
        int i = this.currentAccount;
        if (z) {
            File fileMakeCacheFile = makeCacheFile(i, ext(this.file));
            storyEntry.file = fileMakeCacheFile;
            AndroidUtilities.copyFileSafe(this.file, fileMakeCacheFile);
        }
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
        ArrayList arrayList = storyEntry.privacyRules;
        arrayList.clear();
        arrayList.addAll(this.privacyRules);
        storyEntry.pinned = this.pinned;
        storyEntry.allowScreenshots = this.allowScreenshots;
        storyEntry.period = this.period;
        storyEntry.blurredVideoThumb = this.blurredVideoThumb;
        storyEntry.uploadThumbFile = this.uploadThumbFile;
        storyEntry.albums = this.albums;
        File file = this.uploadThumbFile;
        if (file != null && file.exists()) {
            File fileMakeCacheFile2 = makeCacheFile(i, ext(this.uploadThumbFile));
            storyEntry.uploadThumbFile = fileMakeCacheFile2;
            AndroidUtilities.copyFileSafe(this.uploadThumbFile, fileMakeCacheFile2);
        }
        storyEntry.draftThumbFile = this.draftThumbFile;
        File file2 = this.draftThumbFile;
        if (file2 != null && file2.exists()) {
            File fileMakeCacheFile3 = makeCacheFile(i, ext(this.draftThumbFile));
            storyEntry.draftThumbFile = fileMakeCacheFile3;
            AndroidUtilities.copyFileSafe(this.draftThumbFile, fileMakeCacheFile3);
        }
        storyEntry.paintFile = this.paintFile;
        File file3 = this.paintFile;
        if (file3 != null && file3.exists()) {
            File fileMakeCacheFile4 = makeCacheFile(i, ext(this.paintFile));
            storyEntry.paintFile = fileMakeCacheFile4;
            AndroidUtilities.copyFileSafe(this.paintFile, fileMakeCacheFile4);
        }
        storyEntry.messageFile = this.messageFile;
        File file4 = this.messageFile;
        if (file4 != null && file4.exists()) {
            File fileMakeCacheFile5 = makeCacheFile(i, ext(this.messageFile));
            storyEntry.messageFile = fileMakeCacheFile5;
            AndroidUtilities.copyFileSafe(this.messageFile, fileMakeCacheFile5);
        }
        storyEntry.backgroundFile = this.backgroundFile;
        File file5 = this.backgroundFile;
        if (file5 != null && file5.exists()) {
            File fileMakeCacheFile6 = makeCacheFile(i, ext(this.backgroundFile));
            storyEntry.backgroundFile = fileMakeCacheFile6;
            AndroidUtilities.copyFileSafe(this.backgroundFile, fileMakeCacheFile6);
        }
        storyEntry.paintBlurFile = this.paintBlurFile;
        File file6 = this.paintBlurFile;
        if (file6 != null && file6.exists()) {
            File fileMakeCacheFile7 = makeCacheFile(i, ext(this.paintBlurFile));
            storyEntry.paintBlurFile = fileMakeCacheFile7;
            AndroidUtilities.copyFileSafe(this.paintBlurFile, fileMakeCacheFile7);
        }
        storyEntry.paintEntitiesFile = this.paintEntitiesFile;
        File file7 = this.paintEntitiesFile;
        if (file7 != null && file7.exists()) {
            File fileMakeCacheFile8 = makeCacheFile(i, ext(this.paintEntitiesFile));
            storyEntry.paintEntitiesFile = fileMakeCacheFile8;
            AndroidUtilities.copyFileSafe(this.paintEntitiesFile, fileMakeCacheFile8);
        }
        storyEntry.averageDuration = this.averageDuration;
        storyEntry.mediaEntities = new ArrayList();
        if (this.mediaEntities != null) {
            for (int i2 = 0; i2 < this.mediaEntities.size(); i2++) {
                storyEntry.mediaEntities.add(((VideoEditedInfo.MediaEntity) this.mediaEntities.get(i2)).copy());
            }
        }
        storyEntry.stickers = this.stickers;
        storyEntry.editStickers = this.editStickers;
        storyEntry.filterFile = this.filterFile;
        File file8 = this.filterFile;
        if (file8 != null && file8.exists()) {
            File fileMakeCacheFile9 = makeCacheFile(i, ext(this.filterFile));
            storyEntry.filterFile = fileMakeCacheFile9;
            AndroidUtilities.copyFileSafe(this.filterFile, fileMakeCacheFile9);
        }
        storyEntry.filterState = this.filterState;
        storyEntry.thumbBitmap = this.thumbBitmap;
        storyEntry.fromCamera = this.fromCamera;
        storyEntry.thumbPathBitmap = this.thumbPathBitmap;
        storyEntry.isRepost = this.isRepost;
        storyEntry.isShare = this.isShare;
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
        storyEntry.collageContent = this.collageContent;
        storyEntry.collage = this.collage;
        storyEntry.videoLoop = this.videoLoop;
        storyEntry.videoOffset = this.videoOffset;
        storyEntry.videoVolume = this.videoVolume;
        return storyEntry;
    }

    public final void decodeBounds(String str) {
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
        } else {
            this.resultWidth = 1080;
            this.resultHeight = 1920;
        }
    }

    public final void destroy(boolean z) {
        if (this.blurredVideoThumb != null) {
            this.blurredVideoThumb = null;
        }
        File file = this.uploadThumbFile;
        if (file != null) {
            file.delete();
            this.uploadThumbFile = null;
        }
        if (!z) {
            clearPaint();
            File file2 = this.filterFile;
            if (file2 != null) {
                file2.delete();
                this.filterFile = null;
            }
            File file3 = this.file;
            if (file3 != null) {
                if (this.fileDeletable && (!this.isEdit || this.editedMedia)) {
                    file3.delete();
                }
                this.file = null;
            }
            if (this.thumbPath != null) {
                if (this.fileDeletable) {
                    new File(this.thumbPath).delete();
                }
                this.thumbPath = null;
            }
            ArrayList arrayList = this.mediaEntities;
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) obj;
                    if (mediaEntity.type == 2 && !TextUtils.isEmpty(mediaEntity.segmentedPath)) {
                        try {
                            new File(mediaEntity.segmentedPath).delete();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        mediaEntity.segmentedPath = "";
                    }
                }
            }
            File file4 = this.round;
            if (file4 != null && (!this.isEdit || this.editedMedia)) {
                file4.delete();
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
        this.thumbPathBitmap = null;
        if (this.collageContent != null) {
            for (int i2 = 0; i2 < this.collageContent.size(); i2++) {
                ((StoryEntry) this.collageContent.get(i2)).destroy(z);
            }
        }
        if (this.checkStickersReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.checkStickersReqId, true);
        }
    }

    public final int getTotalCount() {
        if (!this.isVideo || isCollage() || this.isEdit) {
            return 1;
        }
        long j = this.duration;
        if (j <= 0 || this.isRepost) {
            return 1;
        }
        long j2 = (long) ((this.right - this.left) * j);
        if (j2 < 68999) {
            return 1;
        }
        return (int) Math.ceil(j2 / 59000.0f);
    }

    public final void getVideoEditedInfo(Utilities.Callback callback) {
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
        String absolutePath = file == null ? null : file.getAbsolutePath();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Math.max(1, isCollage() ? this.collageContent.size() : 0), 11);
        iArr[0] = new int[11];
        BotVerifySheet$$ExternalSyntheticLambda7 botVerifySheet$$ExternalSyntheticLambda7 = new BotVerifySheet$$ExternalSyntheticLambda7(3, this, absolutePath, iArr, callback);
        if (!isCollage()) {
            if (this.file == null) {
                botVerifySheet$$ExternalSyntheticLambda7.run();
                return;
            } else {
                Utilities.globalQueue.postRunnable(new HintView2$$ExternalSyntheticLambda2(absolutePath, iArr, botVerifySheet$$ExternalSyntheticLambda7, 6));
                return;
            }
        }
        String[] strArr = new String[this.collageContent.size()];
        for (int i2 = 0; i2 < this.collageContent.size(); i2++) {
            strArr[i2] = ((StoryEntry) this.collageContent.get(i2)).file == null ? null : ((StoryEntry) this.collageContent.get(i2)).file.getAbsolutePath();
            iArr[i2] = new int[11];
        }
        Utilities.globalQueue.postRunnable(new HintView2$$ExternalSyntheticLambda2(strArr, iArr, botVerifySheet$$ExternalSyntheticLambda7, 5));
    }

    public final boolean isCollage() {
        return (this.collage == null || this.collageContent == null) ? false : true;
    }

    public final void setupGradient(Runnable runnable) {
        Bitmap bitmapDecodeFile;
        if (this.isVideo && this.gradientTopColor == 0 && this.gradientBottomColor == 0) {
            if (this.thumbPath == null) {
                Bitmap bitmap = this.thumbPathBitmap;
                if (bitmap != null) {
                    int[] colorsSync = DominantColors.getColorsSync(bitmap, true);
                    this.gradientTopColor = colorsSync[0];
                    this.gradientBottomColor = colorsSync[1];
                    runnable.run();
                    return;
                }
                return;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.thumbPath.startsWith("vthumb://")) {
                    long j = Integer.parseInt(this.thumbPath.substring(9));
                    options.inJustDecodeBounds = true;
                    MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), j, 1, options);
                    options.inSampleSize = calculateInSampleSize(options, 240, 240);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmapDecodeFile = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), j, 1, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.thumbPath);
                    options.inSampleSize = calculateInSampleSize(options, 240, 240);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmapDecodeFile = BitmapFactory.decodeFile(this.thumbPath);
                }
            } catch (Exception unused) {
                bitmapDecodeFile = null;
            }
            if (bitmapDecodeFile != null) {
                int[] colorsSync2 = DominantColors.getColorsSync(bitmapDecodeFile, true);
                this.gradientTopColor = colorsSync2[0];
                this.gradientBottomColor = colorsSync2[1];
                bitmapDecodeFile.recycle();
                runnable.run();
            }
        }
    }

    public final void setupMatrix() {
        Matrix matrix = this.matrix;
        matrix.reset();
        int i = this.width;
        int i2 = this.height;
        int i3 = this.orientation;
        int i4 = this.invert;
        matrix.postScale(i4 == 1 ? -1.0f : 1.0f, i4 == 2 ? -1.0f : 1.0f, i / 2.0f, i2 / 2.0f);
        if (i3 != 0) {
            matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
            matrix.postRotate(i3);
            if (i3 == 90 || i3 == 270) {
                i2 = i;
                i = i2;
            }
            matrix.postTranslate(i / 2.0f, i2 / 2.0f);
        }
        float f = i;
        float fMax = this.resultWidth / f;
        if (this.botId != 0) {
            fMax = Math.min(fMax, this.resultHeight / i2);
        } else {
            float f2 = i2;
            if (f2 / f > 1.29f) {
                fMax = Math.max(fMax, this.resultHeight / f2);
            }
        }
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(f, fMax, this.resultWidth, 2.0f), SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(i2, fMax, this.resultHeight, 2.0f));
    }

    public final void setupMultipleStoriesSelector() {
        if (!this.isVideo || isCollage() || this.isEdit || this.isRepost || this.duration <= 69000 || !UserConfig.getInstance(this.currentAccount).isPremium()) {
            return;
        }
        long j = this.duration - 59000;
        long jMin = j > 10000 ? Math.min(59000L, j) + 59000 : 59000L;
        long j2 = this.duration - jMin;
        if (j2 > 10000) {
            jMin += Math.min(59000L, j2);
        }
        this.right = Math.min(1.0f, jMin / this.duration);
    }

    public final boolean wouldBeVideo() {
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList;
        MessageObject messageObject;
        TLRPC.Message message;
        ArrayList arrayList2 = this.mediaEntities;
        if (this.isVideo || this.audioPath != null || this.round != null) {
            return true;
        }
        ArrayList arrayList3 = this.messageObjects;
        if (arrayList3 != null && arrayList3.size() == 1 && (messageObject = (MessageObject) this.messageObjects.get(0)) != null && (message = messageObject.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return true;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (int i = 0; i < arrayList2.size(); i++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList2.get(i);
                byte b = mediaEntity.type;
                if (b == 0) {
                    if (isAnimated(mediaEntity.document, mediaEntity.text)) {
                        return true;
                    }
                } else if (b == 1 && (arrayList = mediaEntity.entities) != null && !arrayList.isEmpty()) {
                    for (int i2 = 0; i2 < mediaEntity.entities.size(); i2++) {
                        VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i2);
                        if (isAnimated(emojiEntity.document, emojiEntity.documentAbsolutePath)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
