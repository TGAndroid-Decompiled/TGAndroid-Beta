package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class ds0 implements Runnable {
    public final int f33215a;
    public final PhotoViewer f33216b;

    public ds0(PhotoViewer photoViewer, int i10) {
        this.f33215a = i10;
        this.f33216b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f33215a;
        PhotoViewer photoViewer = this.f33216b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.G0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer.f3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.T8;
                photoViewer.f3(-1, false);
                return;
            default:
                PhotoViewer.S(photoViewer);
                return;
        }
    }
}
