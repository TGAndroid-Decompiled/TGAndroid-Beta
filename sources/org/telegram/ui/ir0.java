package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class ir0 implements Runnable {
    public final int f37920a;
    public final PhotoViewer f37921b;

    public ir0(PhotoViewer photoViewer, int i10) {
        this.f37920a = i10;
        this.f37921b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f37920a;
        PhotoViewer photoViewer = this.f37921b;
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
