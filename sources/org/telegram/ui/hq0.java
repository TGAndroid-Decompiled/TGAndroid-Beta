package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
public final class hq0 extends tg.s1 {
    public final Path f46474r0;
    public boolean f46475s0;
    public final org.telegram.ui.Components.w5 f46476t0;
    public final PhotoViewer f46477u0;

    public hq0(PhotoViewer photoViewer) {
        super(photoViewer.f41474o5, photoViewer.E, photoViewer.f41534v2, photoViewer.f41356b0);
        this.f46477u0 = photoViewer;
        this.f46474r0 = new Path();
        this.f46476t0 = new org.telegram.ui.Components.w5(this, 0L, 420L, org.telegram.ui.Components.xq.h);
    }

    public final void m(boolean z9, boolean z10) {
        this.f46475s0 = z9;
        if (!z10) {
            this.f46476t0.f(z9, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f46474r0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f55945l0, org.telegram.messenger.g0.L(this.f55948p0), org.telegram.messenger.g0.L(this.f55948p0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f46477u0;
        if (this == photoViewer.f41528u5 || this == photoViewer.f41537v5) {
            canvas.translate(-photoViewer.f41520t5.getX(), -photoViewer.f41520t5.getY());
        }
        photoViewer.N0(canvas, this.f55944k0, -13948117, 855638016, false, true, false);
        float d = this.f46476t0.d(this.f46475s0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.r1(d, -1));
        }
        setTextColor(i0.a.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f46474r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
