package org.telegram.ui;

import android.graphics.drawable.Drawable;

public final class ar0 implements Runnable {

    public final int f36627a;

    public final PhotoViewer f36628b;

    public ar0(PhotoViewer photoViewer, int i10) {
        this.f36627a = i10;
        this.f36628b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f36627a;
        PhotoViewer photoViewer = this.f36628b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.G0(true, false);
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.f3(1, false);
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.f3(-1, false);
                break;
            default:
                PhotoViewer.S(photoViewer);
                break;
        }
    }
}
