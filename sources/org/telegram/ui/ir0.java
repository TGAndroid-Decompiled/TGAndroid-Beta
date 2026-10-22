package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class ir0 implements Runnable {
    public final int f38109a;
    public final PhotoViewer f38110b;

    public ir0(PhotoViewer photoViewer, int i10) {
        this.f38109a = i10;
        this.f38110b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f38109a;
        PhotoViewer photoViewer = this.f38110b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.H0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.h3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.h3(-1, false);
                return;
            default:
                PhotoViewer.T(photoViewer);
                return;
        }
    }
}
