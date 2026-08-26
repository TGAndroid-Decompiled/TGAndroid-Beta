package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.util.Log;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RadialProgress2;

public final class RichMediaItem {
    public static ColorMatrixColorFilter fancyBlurFilter;
    public final ImageReceiver blurImageReceiver;
    public Bitmap blurSource;
    public final ImageReceiver imageReceiver;
    public MediaUploadState media;
    public final RadialProgress2 radialProgress;

    public RichMediaItem(RichMediaCell richMediaCell, Theme.ResourcesProvider resourcesProvider) {
        this.imageReceiver = new ImageReceiver(richMediaCell);
        this.blurImageReceiver = new ImageReceiver(richMediaCell);
        RadialProgress2 radialProgress2 = new RadialProgress2(resourcesProvider, richMediaCell);
        this.radialProgress = radialProgress2;
        radialProgress2.progressColor = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public final void applyImage() {
        String string;
        TLRPC.Photo photo;
        TLRPC.Document document;
        TLRPC.PhotoSize photoSize;
        int iAbs;
        MediaUploadState mediaUploadState = this.media;
        ImageReceiver imageReceiver = this.imageReceiver;
        TLRPC.PhotoSize photoSize2 = null;
        if (mediaUploadState == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i = AndroidUtilities.displaySize.x;
        String strM = DiffUtil.m(i, i, "_");
        StringBuilder sb = new StringBuilder();
        MediaUploadState mediaUploadState2 = this.media;
        if (mediaUploadState2 == null) {
            string = "null";
        } else {
            String str = mediaUploadState2.isVideo ? "v" : mediaUploadState2.isAudio ? "a" : "p";
            if (mediaUploadState2.localPath != null) {
                StringBuilder sbM = Log.m(str, ":local:");
                sbM.append(this.media.localPath);
                string = sbM.toString();
            } else {
                long j = 0;
                if (mediaUploadState2.isReady()) {
                    MediaUploadState mediaUploadState3 = this.media;
                    TLRPC.Document document2 = mediaUploadState3.document;
                    if (document2 != null) {
                        j = document2.id;
                    } else {
                        TLRPC.Photo photo2 = mediaUploadState3.photo;
                        if (photo2 != null) {
                            j = photo2.id;
                        }
                    }
                }
                StringBuilder sbM2 = Log.m(str, ":");
                sbM2.append(this.media.state);
                sbM2.append(":");
                sbM2.append(j);
                string = sbM2.toString();
            }
        }
        sb.append(string);
        sb.append("@");
        sb.append(strM);
        if (sb.toString().equals(null)) {
            return;
        }
        this.media.getClass();
        MediaUploadState mediaUploadState4 = this.media;
        if (!mediaUploadState4.isVideo) {
            if (mediaUploadState4.localPath != null) {
                imageReceiver.setOrientation(mediaUploadState4.orientation, mediaUploadState4.invert, true);
                imageReceiver.setImage(ImageLocation.getForPath(this.media.localPath), strM, null, null, null, 0);
                return;
            } else {
                if (!mediaUploadState4.isReady() || (photo = this.media.photo) == null) {
                    imageReceiver.setImageBitmap((Drawable) null);
                    return;
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.media.photo.sizes, 100);
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.media.photo), strM, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.media.photo), strM, null, 0L, null, this.media.photo, 0);
                return;
            }
        }
        if (mediaUploadState4.localPath != null) {
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForVideoPath(this.media.localPath), "g", null, strM, null, strM, null, 0L, null, null, 0);
            return;
        }
        if (!mediaUploadState4.isReady() || (document = this.media.document) == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
        int photoSize3 = AndroidUtilities.getPhotoSize();
        if (arrayList == null) {
            photoSize = null;
        } else {
            int i2 = Integer.MAX_VALUE;
            photoSize = null;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.PhotoSize photoSize4 = arrayList.get(i3);
                if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (iAbs = Math.abs(Math.max(photoSize4.w, photoSize4.h) - photoSize3)) < i2) {
                    photoSize = photoSize4;
                    i2 = iAbs;
                }
            }
        }
        ArrayList<TLRPC.PhotoSize> arrayList2 = this.media.document.thumbs;
        if (arrayList2 != null) {
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if (arrayList2.get(i4) instanceof TLRPC.TL_photoStrippedSize) {
                    photoSize2 = arrayList2.get(i4);
                    break;
                }
            }
        }
        imageReceiver.setOrientation(0, 0, false);
        imageReceiver.setImage(ImageLocation.getForDocument(this.media.document), "g", ImageLocation.getForDocument(photoSize, this.media.document), strM, ImageLocation.getForDocument(photoSize2, this.media.document), strM, null, 0L, null, this.media.document, 0);
    }

    public final boolean ensureBlur() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (hasImage() && (bitmap = (imageReceiver = this.imageReceiver).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.blurImageReceiver;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.blurSource || imageReceiver2.getBitmap() == null)) {
                this.blurSource = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (fancyBlurFilter == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    fancyBlurFilter = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(fancyBlurFilter);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasImage() {
        MediaUploadState mediaUploadState = this.media;
        if (mediaUploadState != null) {
            return mediaUploadState.localPath != null || mediaUploadState.isReady();
        }
        return false;
    }
}
