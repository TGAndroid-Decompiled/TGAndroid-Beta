package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class bs0 implements Runnable {
    public final int f36424a;
    public final PhotoViewer f36425b;

    public bs0(PhotoViewer photoViewer, int i10) {
        this.f36424a = i10;
        this.f36425b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f36424a;
        PhotoViewer photoViewer = this.f36425b;
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
