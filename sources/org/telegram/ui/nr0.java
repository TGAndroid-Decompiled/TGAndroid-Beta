package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class nr0 implements Runnable {
    public final int f36576a;
    public final PhotoViewer f36577b;

    public nr0(PhotoViewer photoViewer, int i10) {
        this.f36576a = i10;
        this.f36577b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f36576a;
        PhotoViewer photoViewer = this.f36577b;
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
