package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class or0 implements Runnable {
    public final int f36246a;
    public final PhotoViewer f36247b;
    public final Bitmap f36248c;

    public or0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f36246a = i10;
        this.f36247b = photoViewer;
        this.f36248c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f36246a;
        Bitmap bitmap = this.f36248c;
        PhotoViewer photoViewer = this.f36247b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new or0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new or0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new or0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                return;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f31361t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f31361t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f31361t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
        }
    }
}
