package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class bs0 implements Runnable {
    public final int f32449a;
    public final PhotoViewer f32450b;

    public bs0(PhotoViewer photoViewer, int i10) {
        this.f32449a = i10;
        this.f32450b = photoViewer;
    }

    @Override
    public final void run() {
        int i10 = this.f32449a;
        PhotoViewer photoViewer = this.f32450b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.G0(true, false);
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.e3(1, false);
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.e3(-1, false);
                return;
            default:
                PhotoViewer.S(photoViewer);
                return;
        }
    }
}
