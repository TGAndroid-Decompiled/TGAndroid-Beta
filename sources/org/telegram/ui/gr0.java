package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class gr0 implements Runnable {
    public final int f34666a;
    public final PhotoViewer f34667b;

    public gr0(PhotoViewer photoViewer, int i10) {
        this.f34666a = i10;
        this.f34667b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f34666a;
        PhotoViewer photoViewer = this.f34667b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.G0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer.f3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer.f3(-1, false);
                return;
            default:
                PhotoViewer.S(photoViewer);
                return;
        }
    }
}
