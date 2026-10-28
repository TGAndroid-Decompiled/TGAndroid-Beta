package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class kr0 implements Runnable {
    public final int f40909a;
    public final PhotoViewer f40910b;
    public final Bitmap f40911c;

    public kr0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f40909a = i10;
        this.f40910b = photoViewer;
        this.f40911c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f40909a;
        Bitmap bitmap = this.f40911c;
        PhotoViewer photoViewer = this.f40910b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new kr0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new kr0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new kr0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                return;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f35807t5.setUndoCutState(true);
                photoViewer.d3(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f35807t5.setUndoCutState(true);
                photoViewer.d3(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f35807t5.setUndoCutState(true);
                photoViewer.d3(true, true);
                return;
        }
    }
}
