package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.provider.MediaStore;
import android.text.SpannableString;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$InputPrivacyRule;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$StoryItem;
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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
public class StoryEntry extends IStoryPart {
    public boolean allowScreenshots;
    public Bitmap blurredVideoThumb;
    public CharSequence caption;
    public long draftDate;
    public long draftId;
    public File draftThumbFile;
    public long duration;
    public List<TLRPC$InputDocument> editStickers;
    public int editStoryId;
    public boolean editedCaption;
    public boolean editedMedia;
    public boolean editedPrivacy;
    public File file;
    public boolean fileDeletable;
    public File filterFile;
    public MediaController.SavedFilterState filterState;
    private boolean fromCamera;
    public int gradientBottomColor;
    public int gradientTopColor;
    public HDRInfo hdrInfo;
    public int invert;
    public boolean isDraft;
    public boolean isEdit;
    public boolean isVideo;
    public float left;
    public ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
    public boolean muted;
    public int orientation;
    public File paintFile;
    public boolean pinned;
    public StoryPrivacyBottomSheet.StoryPrivacy privacy;
    public int scheduleDate;
    public ArrayList<Long> shareUserIds;
    public boolean silent;
    public List<TLRPC$InputDocument> stickers;
    public Bitmap thumbBitmap;
    public String thumbPath;
    public File uploadThumbFile;
    public final int currentAccount = UserConfig.selectedAccount;
    public double fileDuration = -1.0d;
    public float right = 1.0f;
    public int resultWidth = 720;
    public int resultHeight = 1280;
    public int partsMaxId = 1;
    public final ArrayList<Part> parts = new ArrayList<>();
    public final ArrayList<TLRPC$InputPrivacyRule> privacyRules = new ArrayList<>();
    public int period = 86400;
    public long averageDuration = 5000;
    private int checkStickersReqId = 0;

    public interface DecodeBitmap {
        Bitmap decode(BitmapFactory.Options options);
    }

    public static class Part extends IStoryPart {
        public File file;
        public boolean fileDeletable;
        public int invert;
        public int orientantion;

        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.width = abstractSerializedData.readInt32(z);
            this.height = abstractSerializedData.readInt32(z);
            this.file = new File(abstractSerializedData.readString(z));
            this.fileDeletable = abstractSerializedData.readBool(z);
            this.orientantion = abstractSerializedData.readInt32(z);
            this.invert = abstractSerializedData.readInt32(z);
            float[] fArr = new float[9];
            for (int i = 0; i < 9; i++) {
                fArr[i] = abstractSerializedData.readFloat(z);
            }
            this.matrix.setValues(fArr);
        }

        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(this.width);
            abstractSerializedData.writeInt32(this.height);
            File file = this.file;
            abstractSerializedData.writeString(file == null ? "" : file.getAbsolutePath());
            abstractSerializedData.writeBool(this.fileDeletable);
            abstractSerializedData.writeInt32(this.orientantion);
            abstractSerializedData.writeInt32(this.invert);
            float[] fArr = new float[9];
            this.matrix.getValues(fArr);
            for (int i = 0; i < 9; i++) {
                abstractSerializedData.writeFloat(fArr[i]);
            }
        }
    }

    public boolean wouldBeVideo() {
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList;
        if (this.isVideo) {
            return true;
        }
        ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = this.mediaEntities;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (int i = 0; i < this.mediaEntities.size(); i++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i);
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
                    continue;
                }
            }
        }
        return false;
    }

    private boolean isAnimated(TLRPC$Document tLRPC$Document, String str) {
        if (tLRPC$Document != null) {
            if (MessageObject.isAnimatedStickerDocument(tLRPC$Document)) {
                return true;
            }
            if (MessageObject.isAnimatedStickerDocument(tLRPC$Document, true) && RLottieDrawable.getFramesCount(str, null) > 1) {
                return true;
            }
        }
        return false;
    }

    public void buildPhoto(File file) {
        Matrix matrix = new Matrix();
        Paint paint = new Paint(7);
        Bitmap createBitmap = Bitmap.createBitmap(this.resultWidth, this.resultHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint2 = new Paint(1);
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, canvas.getHeight(), new int[]{this.gradientTopColor, this.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint2);
        matrix.set(this.matrix);
        final File file2 = this.filterFile;
        if (file2 == null) {
            file2 = this.file;
        }
        if (file2 != null) {
            try {
                Bitmap scaledBitmap = getScaledBitmap(new DecodeBitmap() {
                    @Override
                    public final Bitmap decode(BitmapFactory.Options options) {
                        Bitmap lambda$buildPhoto$0;
                        lambda$buildPhoto$0 = StoryEntry.lambda$buildPhoto$0(file2, options);
                        return lambda$buildPhoto$0;
                    }
                }, this.resultWidth, this.resultHeight, true);
                float width = this.width / scaledBitmap.getWidth();
                matrix.preScale(width, width);
                canvas.drawBitmap(scaledBitmap, matrix, paint);
                scaledBitmap.recycle();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        for (int i = 0; i < this.parts.size(); i++) {
            try {
                final Part part = this.parts.get(i);
                Bitmap scaledBitmap2 = getScaledBitmap(new DecodeBitmap() {
                    @Override
                    public final Bitmap decode(BitmapFactory.Options options) {
                        Bitmap lambda$buildPhoto$1;
                        lambda$buildPhoto$1 = StoryEntry.lambda$buildPhoto$1(StoryEntry.Part.this, options);
                        return lambda$buildPhoto$1;
                    }
                }, this.resultWidth, this.resultHeight, false);
                float width2 = part.width / scaledBitmap2.getWidth();
                matrix.set(part.matrix);
                matrix.preScale(width2, width2);
                canvas.drawBitmap(scaledBitmap2, matrix, paint);
                scaledBitmap2.recycle();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        if (this.paintFile != null) {
            try {
                Bitmap scaledBitmap3 = getScaledBitmap(new DecodeBitmap() {
                    @Override
                    public final Bitmap decode(BitmapFactory.Options options) {
                        Bitmap lambda$buildPhoto$2;
                        lambda$buildPhoto$2 = StoryEntry.this.lambda$buildPhoto$2(options);
                        return lambda$buildPhoto$2;
                    }
                }, this.resultWidth, this.resultHeight, false);
                canvas.save();
                float width3 = this.resultWidth / scaledBitmap3.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(scaledBitmap3, 0.0f, 0.0f, paint);
                canvas.restore();
                scaledBitmap3.recycle();
            } catch (Exception e3) {
                FileLog.e(e3);
            }
        }
        this.thumbBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e4) {
            FileLog.e(e4);
        }
        createBitmap.recycle();
    }

    public static Bitmap lambda$buildPhoto$0(File file, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(file.getPath(), options);
    }

    public static Bitmap lambda$buildPhoto$1(Part part, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(part.file.getPath(), options);
    }

    public Bitmap lambda$buildPhoto$2(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.paintFile.getPath(), options);
    }

    public static Bitmap getScaledBitmap(DecodeBitmap decodeBitmap, int i, int i2, boolean z) {
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
        boolean z2 = d * 1.1d <= ((double) maxMemory);
        if (i3 <= i && i4 <= i2) {
            return decodeBitmap.decode(options);
        }
        if (z2 && SharedConfig.getDevicePerformanceClass() >= 1) {
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
            int clamp = Utilities.clamp(Math.round(1.0f / max), 8, 0);
            matrix.reset();
            matrix.postScale(max, max);
            bitmapShader.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, 0.0f, width, height, paint);
            if (z && clamp > 0) {
                Utilities.stackBlurBitmap(createBitmap, clamp);
            }
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
                return;
            }
            Matrix matrix = new Matrix();
            int i = this.invert;
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
            this.filterFile = makeCacheFile(this.currentAccount, "webp");
            if (runnable == null) {
                try {
                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 90, new FileOutputStream(this.filterFile));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                createBitmap.recycle();
                return;
            }
            Utilities.themeQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StoryEntry.this.lambda$updateFilter$3(createBitmap, runnable);
                }
            });
        }
    }

    public void lambda$updateFilter$3(Bitmap bitmap, Runnable runnable) {
        try {
            bitmap.compress(Bitmap.CompressFormat.WEBP, 90, new FileOutputStream(this.filterFile));
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(this.filterFile));
            } catch (Exception e2) {
                FileLog.e((Throwable) e2, false);
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
            Iterator<Part> it = this.parts.iterator();
            while (it.hasNext()) {
                Part next = it.next();
                if (next.fileDeletable) {
                    next.file.delete();
                }
                next.file = null;
            }
        }
        cancelCheckStickers();
    }

    public static StoryEntry fromStoryItem(File file, TLRPC$StoryItem tLRPC$StoryItem) {
        File pathToAttach;
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.isEdit = true;
        storyEntry.editStoryId = tLRPC$StoryItem.id;
        storyEntry.file = file;
        storyEntry.fileDeletable = true;
        storyEntry.width = 720;
        storyEntry.height = 1280;
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$StoryItem.media;
        int i = 0;
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
                    if (i2 >= tLRPC$StoryItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$StoryItem.media.document.attributes.get(i2);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                        storyEntry.width = tLRPC$DocumentAttribute.w;
                        storyEntry.height = tLRPC$DocumentAttribute.h;
                        storyEntry.fileDuration = tLRPC$DocumentAttribute.duration;
                        break;
                    }
                    i2++;
                }
            }
            TLRPC$Document tLRPC$Document2 = tLRPC$StoryItem.media.document;
            if (tLRPC$Document2 != null) {
                String str = tLRPC$StoryItem.firstFramePath;
                if (str != null) {
                    storyEntry.thumbPath = str;
                } else if (tLRPC$Document2.thumbs != null) {
                    while (true) {
                        if (i >= tLRPC$StoryItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC$PhotoSize tLRPC$PhotoSize = tLRPC$StoryItem.media.document.thumbs.get(i);
                        if (!(tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize) && (pathToAttach = FileLoader.getInstance(storyEntry.currentAccount).getPathToAttach(tLRPC$PhotoSize, true)) != null && pathToAttach.exists()) {
                            storyEntry.thumbPath = pathToAttach.getAbsolutePath();
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        storyEntry.privacyRules.clear();
        storyEntry.privacyRules.addAll(StoryPrivacyBottomSheet.StoryPrivacy.toInput(storyEntry.currentAccount, tLRPC$StoryItem.privacy));
        storyEntry.period = tLRPC$StoryItem.expire_date - tLRPC$StoryItem.date;
        try {
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableString(tLRPC$StoryItem.caption), Theme.chat_msgTextPaint.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, tLRPC$StoryItem.entities, true, false, true, false);
            storyEntry.caption = MessageObject.replaceAnimatedEmoji(replaceEmoji, tLRPC$StoryItem.entities, Theme.chat_msgTextPaint.getFontMetricsInt());
        } catch (Exception unused) {
        }
        storyEntry.setupMatrix();
        storyEntry.checkStickers(tLRPC$StoryItem);
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
        float f3 = i3;
        if (f3 / f > 1.29f) {
            f2 = Math.max(f2, this.resultHeight / f3);
        }
        matrix.postScale(f2, f2);
        matrix.postTranslate((this.resultWidth - (f * f2)) / 2.0f, (this.resultHeight - (f3 * f2)) / 2.0f);
    }

    public void setupGradient(final Runnable runnable) {
        if (this.isVideo && this.gradientTopColor == 0 && this.gradientBottomColor == 0 && this.thumbPath != null) {
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
                        StoryEntry.this.lambda$setupGradient$4(bitmap, runnable, (int[]) obj);
                    }
                });
            }
        }
    }

    public void lambda$setupGradient$4(Bitmap bitmap, Runnable runnable, int[] iArr) {
        this.gradientTopColor = iArr[0];
        this.gradientBottomColor = iArr[1];
        bitmap.recycle();
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
        final String absolutePath = this.file.getAbsolutePath();
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                StoryEntry.this.lambda$getVideoEditedInfo$6(absolutePath, callback);
            }
        });
    }

    public void lambda$getVideoEditedInfo$6(final String str, final Utilities.Callback callback) {
        final int[] iArr = new int[11];
        AnimatedFileDrawable.getVideoInfo(str, iArr);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryEntry.this.lambda$getVideoEditedInfo$5(str, iArr, callback);
            }
        });
    }

    public void lambda$getVideoEditedInfo$5(String str, int[] iArr, Utilities.Callback callback) {
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
        int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
        if (this.isVideo) {
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
            videoEditedInfo.muted = this.muted;
            videoEditedInfo.estimatedSize = iArr[5] + (((iArr[4] / 1000.0f) * extractRealEncoderBitrate) / 8.0f);
            videoEditedInfo.estimatedSize = Math.max(this.file.length(), videoEditedInfo.estimatedSize);
            videoEditedInfo.filterState = this.filterState;
        } else {
            File file2 = this.filterFile;
            if (file2 != null) {
                videoEditedInfo.originalPath = file2.getAbsolutePath();
            } else {
                videoEditedInfo.originalPath = str;
            }
            videoEditedInfo.isPhoto = true;
            long j4 = this.averageDuration;
            this.duration = j4;
            videoEditedInfo.originalDuration = j4;
            videoEditedInfo.estimatedDuration = j4;
            videoEditedInfo.startTime = -1L;
            videoEditedInfo.endTime = -1L;
            videoEditedInfo.muted = true;
            videoEditedInfo.originalBitrate = -1;
            videoEditedInfo.bitrate = -1;
            videoEditedInfo.framerate = 30;
            videoEditedInfo.estimatedSize = ((((float) j4) / 1000.0f) * extractRealEncoderBitrate) / 8.0f;
            videoEditedInfo.filterState = null;
        }
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
        videoEditedInfo.parts = this.parts;
        callback.run(videoEditedInfo);
    }

    public static File makeCacheFile(int i, boolean z) {
        return makeCacheFile(i, z ? "mp4" : "jpg");
    }

    public static File makeCacheFile(int i, String str) {
        TLRPC$TL_photoSize_layer127 tLRPC$TL_photoSize_layer127;
        TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated = new TLRPC$TL_fileLocationToBeDeprecated();
        tLRPC$TL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tLRPC$TL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
        tLRPC$TL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        tLRPC$TL_fileLocationToBeDeprecated.file_reference = new byte[0];
        if ("mp4".equals(str)) {
            ?? tLRPC$TL_videoSize_layer127 = new TLRPC$TL_videoSize_layer127();
            tLRPC$TL_videoSize_layer127.location = tLRPC$TL_fileLocationToBeDeprecated;
            tLRPC$TL_photoSize_layer127 = tLRPC$TL_videoSize_layer127;
        } else {
            TLRPC$TL_photoSize_layer127 tLRPC$TL_photoSize_layer1272 = new TLRPC$TL_photoSize_layer127();
            tLRPC$TL_photoSize_layer1272.location = tLRPC$TL_fileLocationToBeDeprecated;
            tLRPC$TL_photoSize_layer127 = tLRPC$TL_photoSize_layer1272;
        }
        return FileLoader.getInstance(i).getPathToAttach(tLRPC$TL_photoSize_layer127, str, true);
    }

    public static class HDRInfo {
        public int colorRange;
        public int colorStandard;
        public int colorTransfer;
        public float maxlum;
        public float minlum;

        public int getHDRType() {
            if ((this.maxlum > 0.0f || this.minlum > 0.0f) && this.colorStandard == 6) {
                int i = this.colorTransfer;
                if (i == 7) {
                    return 1;
                }
                if (i == 6) {
                    return 2;
                }
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
                    StoryEntry.this.lambda$detectHDR$8(callback);
                }
            });
        }
    }

    public void lambda$detectHDR$8(final Utilities.Callback callback) {
        Runnable runnable;
        try {
            try {
                HDRInfo hDRInfo = this.hdrInfo;
                if (hDRInfo == null) {
                    hDRInfo = new HDRInfo();
                    this.hdrInfo = hDRInfo;
                    hDRInfo.maxlum = 1000.0f;
                    hDRInfo.minlum = 0.001f;
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
                        StoryEntry.this.lambda$detectHDR$7(callback);
                    }
                };
            } catch (Exception e) {
                FileLog.e(e);
                this.hdrInfo = this.hdrInfo;
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        StoryEntry.this.lambda$detectHDR$7(callback);
                    }
                };
            }
            AndroidUtilities.runOnUIThread(runnable);
        } catch (Throwable th) {
            this.hdrInfo = this.hdrInfo;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoryEntry.this.lambda$detectHDR$7(callback);
                }
            });
            throw th;
        }
    }

    public void lambda$detectHDR$7(Utilities.Callback callback) {
        callback.run(this.hdrInfo);
    }

    public void checkStickers(final TLRPC$StoryItem tLRPC$StoryItem) {
        if (tLRPC$StoryItem == null || tLRPC$StoryItem.media == null) {
            return;
        }
        final TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers = new TLRPC$TL_messages_getAttachedStickers();
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$StoryItem.media;
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
                StoryEntry.this.lambda$checkStickers$10(tLObject, tLRPC$TL_error);
            }
        };
        this.checkStickersReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getAttachedStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoryEntry.this.lambda$checkStickers$11(tLRPC$StoryItem, tLRPC$TL_messages_getAttachedStickers, requestDelegate, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkStickers$10(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryEntry.this.lambda$checkStickers$9(tLObject);
            }
        });
    }

    public void lambda$checkStickers$9(TLObject tLObject) {
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

    public void lambda$checkStickers$11(TLRPC$StoryItem tLRPC$StoryItem, TLRPC$TL_messages_getAttachedStickers tLRPC$TL_messages_getAttachedStickers, RequestDelegate requestDelegate, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text) && tLRPC$StoryItem != null) {
            FileRefController.getInstance(this.currentAccount).requestReference(tLRPC$StoryItem, tLRPC$TL_messages_getAttachedStickers, requestDelegate);
        } else {
            requestDelegate.run(tLObject, tLRPC$TL_error);
        }
    }

    public void cancelCheckStickers() {
        if (this.checkStickersReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.checkStickersReqId, true);
        }
    }
}
