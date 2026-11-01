package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
public final class eq0 extends org.telegram.ui.Components.g71 {
    public final org.telegram.ui.Components.w9 f36890g0;
    public final PhotoViewer f36891h0;

    public eq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f36891h0 = photoViewer;
        new Path();
        this.f36890g0 = new org.telegram.ui.Components.w9(photoViewer.f33449b0, this, 0, false);
    }

    @Override
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        PhotoViewer photoViewer = this.f36891h0;
        canvas.translate((-getX()) - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.U0(canvas, this.f36890g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        int i10;
        if (org.telegram.messenger.uz.f18507c0 && ((i10 = this.f36891h0.f33559n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.f36891h0.f33477e0.invalidate();
        }
    }
}
