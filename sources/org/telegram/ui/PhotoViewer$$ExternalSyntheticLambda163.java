package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;

public final class PhotoViewer$$ExternalSyntheticLambda163 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer f$0;
    public final Bitmap f$1;

    public PhotoViewer$$ExternalSyntheticLambda163(PhotoViewer photoViewer, Bitmap bitmap, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
        this.f$1 = bitmap;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = this.f$0;
                Bitmap bitmap = this.f$1;
                photoViewer.applyCurrentEditMode(bitmap);
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda163(photoViewer, bitmap, 6));
                break;
            case 1:
                PhotoViewer photoViewer2 = this.f$0;
                Bitmap bitmap2 = this.f$1;
                photoViewer2.applyCurrentEditMode(bitmap2);
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda163(photoViewer2, bitmap2, 5));
                break;
            case 2:
                PhotoViewer photoViewer3 = this.f$0;
                Bitmap bitmap3 = this.f$1;
                photoViewer3.applyCurrentEditMode(bitmap3);
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda163(photoViewer3, bitmap3, 4));
                break;
            case 3:
                this.f$0.applyCurrentEditMode(this.f$1);
                break;
            case 4:
                PhotoViewer photoViewer4 = this.f$0;
                photoViewer4.centerImage.setImageBitmap(this.f$1);
                photoViewer4.cutOutBtn.setUndoCutState(true);
                photoViewer4.showStickerMode$1(true, true);
                break;
            case 5:
                PhotoViewer photoViewer5 = this.f$0;
                photoViewer5.centerImage.setImageBitmap(this.f$1);
                photoViewer5.cutOutBtn.setUndoCutState(true);
                photoViewer5.showStickerMode$1(true, true);
                break;
            default:
                PhotoViewer photoViewer6 = this.f$0;
                photoViewer6.centerImage.setImageBitmap(this.f$1);
                photoViewer6.cutOutBtn.setUndoCutState(true);
                photoViewer6.showStickerMode$1(true, true);
                break;
        }
    }
}
