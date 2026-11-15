package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
public final class gq0 extends tg.s1 {
    public final Path f47505s0;
    public boolean f47506t0;
    public final org.telegram.ui.Components.u5 f47507u0;
    public final PhotoViewer f47508v0;

    public gq0(PhotoViewer photoViewer) {
        super(photoViewer.f42852p5, photoViewer.F, photoViewer.f42913w2, photoViewer.f42735c0);
        this.f47508v0 = photoViewer;
        this.f47505s0 = new Path();
        this.f47507u0 = new org.telegram.ui.Components.u5(this, 0L, 420L, org.telegram.ui.Components.er.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f47506t0 = z10;
        if (!z11) {
            this.f47507u0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f47505s0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.m0, org.telegram.messenger.g0.L(this.f57556q0), org.telegram.messenger.g0.L(this.f57556q0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f47508v0;
        if (this == photoViewer.f42906v5 || this == photoViewer.f42916w5) {
            canvas.translate(-photoViewer.f42897u5.getX(), -photoViewer.f42897u5.getY());
        }
        photoViewer.N0(canvas, this.f57552l0, -13948117, 855638016, false, true, false);
        float d = this.f47507u0.d(this.f47506t0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.r1(d, -1));
        }
        setTextColor(i0.a.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f47505s0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
