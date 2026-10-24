package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class dr0 implements Runnable {
    public final int f36716a;
    public final PhotoViewer f36717b;
    public final Bitmap f36718c;

    public dr0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f36716a = i10;
        this.f36717b = photoViewer;
        this.f36718c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f36716a;
        Bitmap bitmap = this.f36718c;
        PhotoViewer photoViewer = this.f36717b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new dr0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new dr0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                AndroidUtilities.runOnUIThread(new dr0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.o0(bitmap);
                return;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33719t5.setUndoCutState(true);
                photoViewer.c3(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33719t5.setUndoCutState(true);
                photoViewer.c3(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33719t5.setUndoCutState(true);
                photoViewer.c3(true, true);
                return;
        }
    }
}
