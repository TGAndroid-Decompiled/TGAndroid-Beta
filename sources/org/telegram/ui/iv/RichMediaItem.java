package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;

public class RichMediaItem {
    private static ColorMatrixColorFilter fancyBlurFilter;
    private boolean attached;
    private final ImageReceiver blurImageReceiver;
    private Bitmap blurSource;
    private final ImageReceiver imageReceiver;
    private String loadedKey;
    private MediaUploadState media;
    private final View parent;
    private final RadialProgress2 radialProgress;

    public RichMediaItem(View view, Theme.ResourcesProvider resourcesProvider) {
        this.parent = view;
        this.imageReceiver = new ImageReceiver(view);
        this.blurImageReceiver = new ImageReceiver(view);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, resourcesProvider);
        this.radialProgress = radialProgress2;
        radialProgress2.setProgressColor(-1);
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public void setMedia(MediaUploadState mediaUploadState) {
        this.media = mediaUploadState;
        applyImage();
    }

    public MediaUploadState getMedia() {
        return this.media;
    }

    public boolean hasImage() {
        MediaUploadState mediaUploadState = this.media;
        return mediaUploadState != null && (mediaUploadState.localPath != null || mediaUploadState.isReady());
    }

    public void setRoundRadius(int i, int i2, int i3, int i4) {
        this.imageReceiver.setRoundRadius(i, i2, i3, i4);
        this.blurImageReceiver.setRoundRadius(i, i2, i3, i4);
    }

    public int getWidth() {
        if (this.media == null) {
            return 0;
        }
        return isLocalRotated90() ? this.media.height : this.media.width;
    }

    public int getHeight() {
        if (this.media == null) {
            return 0;
        }
        return isLocalRotated90() ? this.media.width : this.media.height;
    }

    private boolean isLocalRotated90() {
        int i;
        MediaUploadState mediaUploadState = this.media;
        return (mediaUploadState == null || mediaUploadState.isVideo || mediaUploadState.isReady() || ((i = this.media.orientation) != 90 && i != 270)) ? false : true;
    }

    public void attach() {
        this.attached = true;
        this.imageReceiver.onAttachedToWindow();
        this.blurImageReceiver.onAttachedToWindow();
        this.loadedKey = null;
        applyImage();
    }

    private String imageKey() {
        MediaUploadState mediaUploadState = this.media;
        if (mediaUploadState == null) {
            return "null";
        }
        String str = mediaUploadState.isVideo ? "v" : mediaUploadState.isAudio ? "a" : "p";
        if (mediaUploadState.localPath != null) {
            return str + ":local:" + this.media.localPath;
        }
        long j = 0;
        if (mediaUploadState.isReady()) {
            MediaUploadState mediaUploadState2 = this.media;
            TLRPC.Document document = mediaUploadState2.document;
            if (document != null) {
                j = document.id;
            } else {
                TLRPC.Photo photo = mediaUploadState2.photo;
                if (photo != null) {
                    j = photo.id;
                }
            }
        }
        return str + ":" + this.media.state + ":" + j;
    }

    public void detach() {
        this.attached = false;
        this.imageReceiver.onDetachedFromWindow();
        this.blurImageReceiver.onDetachedFromWindow();
        this.blurSource = null;
    }

    private boolean ensureBlur() {
        Bitmap bitmap;
        if (!hasImage() || (bitmap = this.imageReceiver.getBitmap()) == null || bitmap.isRecycled()) {
            return false;
        }
        if ((this.blurImageReceiver.getBitmap() == null || this.imageReceiver.getAnimation() == null) && (bitmap != this.blurSource || this.blurImageReceiver.getBitmap() == null)) {
            this.blurSource = bitmap;
            this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
            if (fancyBlurFilter == null) {
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                fancyBlurFilter = new ColorMatrixColorFilter(colorMatrix);
            }
            this.blurImageReceiver.setColorFilter(fancyBlurFilter);
        }
        return this.blurImageReceiver.getBitmap() != null;
    }

    public void drawBlurBackground(Canvas canvas, RectF rectF) {
        if (ensureBlur()) {
            this.blurImageReceiver.setImageCoords(rectF);
            this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
            this.blurImageReceiver.draw(canvas);
        }
    }

    public void draw(Canvas canvas, RectF rectF) {
        this.imageReceiver.setImageCoords(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.width()), Math.round(rectF.height()));
        if (hasImage()) {
            this.imageReceiver.draw(canvas);
        }
        drawProgress(canvas, rectF);
    }

    public void drawSpoiler(Canvas canvas, RectF rectF, SpoilerEffect2 spoilerEffect2, View view) {
        canvas.save();
        canvas.clipRect(rectF);
        if (ensureBlur()) {
            this.blurImageReceiver.setImageCoords(rectF);
            this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
            this.blurImageReceiver.draw(canvas);
        }
        if (spoilerEffect2 != null) {
            canvas.translate(rectF.left, rectF.top);
            spoilerEffect2.draw(canvas, view, Math.round(rectF.width()), Math.round(rectF.height()), this.imageReceiver.getCurrentAlpha());
        }
        canvas.restore();
    }

    private void drawProgress(Canvas canvas, RectF rectF) {
        MediaUploadState mediaUploadState = this.media;
        if (mediaUploadState == null || !mediaUploadState.isPending()) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int iRound = Math.round(rectF.centerX());
        int iRound2 = Math.round(rectF.centerY());
        int i = iDp / 2;
        this.radialProgress.setProgressRect(iRound - i, iRound2 - i, iRound + i, iRound2 + i);
        this.radialProgress.setProgress(this.media.progress, true);
        this.radialProgress.draw(canvas);
    }

    private void applyImage() {
        TLRPC.Photo photo;
        TLRPC.Document document;
        if (this.media == null) {
            this.loadedKey = null;
            this.imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i = AndroidUtilities.displaySize.x;
        String str = i + "_" + i;
        if ((imageKey() + "@" + str).equals(this.loadedKey)) {
            return;
        }
        BitmapDrawable bitmapDrawable = this.media.localThumbBitmap != null ? new BitmapDrawable(this.parent.getResources(), this.media.localThumbBitmap) : null;
        MediaUploadState mediaUploadState = this.media;
        if (mediaUploadState.isVideo) {
            if (mediaUploadState.localPath != null) {
                this.imageReceiver.setOrientation(0, 0, false);
                this.imageReceiver.setImage(ImageLocation.getForVideoPath(this.media.localPath), "g", null, str, null, str, bitmapDrawable, 0L, null, null, 0);
                return;
            } else {
                if (mediaUploadState.isReady() && (document = this.media.document) != null) {
                    TLRPC.PhotoSize photoSizePickNonStrippedClosest = pickNonStrippedClosest(document.thumbs, AndroidUtilities.getPhotoSize());
                    TLRPC.PhotoSize photoSizePickStripped = pickStripped(this.media.document.thumbs);
                    this.imageReceiver.setOrientation(0, 0, false);
                    this.imageReceiver.setImage(ImageLocation.getForDocument(this.media.document), "g", ImageLocation.getForDocument(photoSizePickNonStrippedClosest, this.media.document), str, ImageLocation.getForDocument(photoSizePickStripped, this.media.document), str, bitmapDrawable, 0L, null, this.media.document, 0);
                    return;
                }
                this.imageReceiver.setImageBitmap((Drawable) null);
                return;
            }
        }
        if (mediaUploadState.localPath != null) {
            this.imageReceiver.setOrientation(mediaUploadState.orientation, mediaUploadState.invert, true);
            this.imageReceiver.setImage(ImageLocation.getForPath(this.media.localPath), str, null, null, null, 0);
        } else {
            if (mediaUploadState.isReady() && (photo = this.media.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.media.photo.sizes, 100);
                this.imageReceiver.setOrientation(0, 0, false);
                this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.media.photo), str, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.media.photo), str, null, 0L, null, this.media.photo, 0);
                return;
            }
            this.imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    private static TLRPC.PhotoSize pickNonStrippedClosest(ArrayList arrayList, int i) {
        int iAbs;
        TLRPC.PhotoSize photoSize = null;
        if (arrayList == null) {
            return null;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) arrayList.get(i3);
            if (!(photoSize2 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize2 instanceof TLRPC.TL_photoPathSize) && (iAbs = Math.abs(Math.max(photoSize2.w, photoSize2.h) - i)) < i2) {
                photoSize = photoSize2;
                i2 = iAbs;
            }
        }
        return photoSize;
    }

    private static TLRPC.PhotoSize pickStripped(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.PhotoSize) arrayList.get(i);
            }
        }
        return null;
    }
}
