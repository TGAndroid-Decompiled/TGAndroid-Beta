package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class ir0 implements Runnable {
    public final int f38105a;
    public final PhotoViewer f38106b;

    public ir0(PhotoViewer photoViewer, int i10) {
        this.f38105a = i10;
        this.f38106b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f38105a;
        PhotoViewer photoViewer = this.f38106b;
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
