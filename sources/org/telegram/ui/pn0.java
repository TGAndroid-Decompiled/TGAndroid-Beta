package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class pn0 implements Runnable {
    public final int f48895a;
    public final PhotoViewer f48896b;
    public final Bitmap f48897c;

    public pn0(PhotoViewer photoViewer, Bitmap bitmap, int i7) {
        this.f48895a = i7;
        this.f48896b = photoViewer;
        this.f48897c = bitmap;
    }

    @Override
    public final void run() {
        int i7 = this.f48895a;
        Bitmap bitmap = this.f48897c;
        PhotoViewer photoViewer = this.f48896b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new pn0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new pn0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                org.telegram.messenger.g0.h3(new pn0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer.g0(bitmap);
                return;
            case 4:
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                return;
            case 5:
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                return;
            default:
                photoViewer.B4.v0(bitmap);
                photoViewer.s5.setUndoCutState(true);
                photoViewer.X2(true, true);
                return;
        }
    }
}
