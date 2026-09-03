package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class js0 extends org.telegram.ui.Components.t71 {
    public final org.telegram.ui.Components.fa f35362d0;
    public final PhotoViewer f35363e0;

    public js0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f35363e0 = photoViewer;
        new Path();
        this.f35362d0 = new org.telegram.ui.Components.fa(photoViewer.Y, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f35363e0;
        canvas.translate((-getX()) - photoViewer.N7.getX(), (-getY()) - photoViewer.N7.getY());
        photoViewer.T0(canvas, this.f35362d0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f35363e0.f31764k4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.f35363e0.f31679b0.invalidate();
        }
    }
}
