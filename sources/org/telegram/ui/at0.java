package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;
public final class at0 extends org.telegram.ui.Components.c91 {
    public final org.telegram.ui.Components.pa f35975g0;
    public final PhotoViewer f35976h0;

    public at0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f35976h0 = photoViewer;
        new Path();
        this.f35975g0 = new org.telegram.ui.Components.pa(photoViewer.f33712b0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f35976h0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.T0(canvas, this.f35975g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.f35976h0.f33822n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.f35976h0.f33741e0.invalidate();
        }
    }
}
