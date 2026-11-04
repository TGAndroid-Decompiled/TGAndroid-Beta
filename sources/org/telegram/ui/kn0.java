package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
public final class kn0 implements Runnable {
    public final int f46989a;
    public final PhotoViewer f46990b;
    public final Bitmap f46991c;

    public kn0(PhotoViewer photoViewer, Bitmap bitmap, int i3) {
        this.f46989a = i3;
        this.f46990b = photoViewer;
        this.f46991c = bitmap;
    }

    @Override
    public final void run() {
        int i3 = this.f46989a;
        Bitmap bitmap = this.f46991c;
        PhotoViewer photoViewer = this.f46990b;
        switch (i3) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.g0.h3(new kn0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.g0.h3(new kn0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer.o0(bitmap);
                org.telegram.messenger.g0.h3(new kn0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.V8;
                photoViewer.o0(bitmap);
                return;
            case 4:
                photoViewer.D4.v0(bitmap);
                photoViewer.f41554u5.setUndoCutState(true);
                photoViewer.d3(true, true);
                return;
            case 5:
                photoViewer.D4.v0(bitmap);
                photoViewer.f41554u5.setUndoCutState(true);
                photoViewer.d3(true, true);
                return;
            default:
                photoViewer.D4.v0(bitmap);
                photoViewer.f41554u5.setUndoCutState(true);
                photoViewer.d3(true, true);
                return;
        }
    }
}
