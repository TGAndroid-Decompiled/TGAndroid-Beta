package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class ir0 implements Runnable {
    public final int f38099a;
    public final PhotoViewer f38100b;

    public ir0(PhotoViewer photoViewer, int i10) {
        this.f38099a = i10;
        this.f38100b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f38099a;
        PhotoViewer photoViewer = this.f38100b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.G0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.f3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.f3(-1, false);
                return;
            default:
                PhotoViewer.S(photoViewer);
                return;
        }
    }
}
