package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class mr0 implements Runnable {
    public final int f35763a;
    public final PhotoViewer f35764b;
    public final Bitmap f35765c;

    public mr0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f35763a = i10;
        this.f35764b = photoViewer;
        this.f35765c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f35763a;
        Bitmap bitmap = this.f35765c;
        PhotoViewer photoViewer = this.f35764b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new mr0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new mr0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new mr0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                return;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f31433t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f31433t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f31433t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
        }
    }
}
