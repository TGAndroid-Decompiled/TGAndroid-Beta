package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class lr0 implements Runnable {
    public final int f39317a;
    public final PhotoViewer f39318b;

    public lr0(PhotoViewer photoViewer, int i10) {
        this.f39317a = i10;
        this.f39318b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f39317a;
        PhotoViewer photoViewer = this.f39318b;
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
