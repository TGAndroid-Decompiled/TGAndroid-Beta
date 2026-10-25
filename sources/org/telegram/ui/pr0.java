package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class pr0 implements Runnable {
    public final int f42644a;
    public final PhotoViewer f42645b;

    public pr0(PhotoViewer photoViewer, int i10) {
        this.f42644a = i10;
        this.f42645b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f42644a;
        PhotoViewer photoViewer = this.f42645b;
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
