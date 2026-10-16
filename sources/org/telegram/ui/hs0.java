package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class hs0 implements Runnable {
    public final int f36646a;
    public final PhotoViewer f36647b;

    public hs0(PhotoViewer photoViewer, int i10) {
        this.f36646a = i10;
        this.f36647b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f36646a;
        PhotoViewer photoViewer = this.f36647b;
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
