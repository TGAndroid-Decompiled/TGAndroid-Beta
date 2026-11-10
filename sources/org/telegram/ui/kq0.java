package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
public final class kq0 extends tg.s1 {
    public final Path f47396r0;
    public boolean f47397s0;
    public final org.telegram.ui.Components.v5 f47398t0;
    public final PhotoViewer f47399u0;

    public kq0(PhotoViewer photoViewer) {
        super(photoViewer.f41472o5, photoViewer.E, photoViewer.f41532v2, photoViewer.f41354b0);
        this.f47399u0 = photoViewer;
        this.f47396r0 = new Path();
        this.f47398t0 = new org.telegram.ui.Components.v5(this, 0L, 420L, org.telegram.ui.Components.wq.h);
    }

    public final void m(boolean z9, boolean z10) {
        this.f47397s0 = z9;
        if (!z10) {
            this.f47398t0.f(z9, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f47396r0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f55956l0, org.telegram.messenger.g0.L(this.f55959p0), org.telegram.messenger.g0.L(this.f55959p0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f47399u0;
        if (this == photoViewer.f41526u5 || this == photoViewer.f41535v5) {
            canvas.translate(-photoViewer.f41518t5.getX(), -photoViewer.f41518t5.getY());
        }
        photoViewer.N0(canvas, this.f55955k0, -13948117, 855638016, false, true, false);
        float d = this.f47398t0.d(this.f47397s0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.m6.r1(d, -1));
        }
        setTextColor(i0.a.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f47396r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
