package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class jp0 implements Runnable {
    public final int f38561a;
    public final PhotoViewer f38562b;

    public jp0(PhotoViewer photoViewer, int i10) {
        this.f38561a = i10;
        this.f38562b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f38561a;
        PhotoViewer photoViewer = this.f38562b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.H0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.i3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.i3(-1, false);
                return;
            default:
                PhotoViewer.T(photoViewer);
                return;
        }
    }
}
