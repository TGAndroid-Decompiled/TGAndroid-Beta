package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
public final class jq0 extends tg.s1 {
    public final Path f47062r0;
    public boolean f47063s0;
    public final org.telegram.ui.Components.w5 f47064t0;
    public final PhotoViewer f47065u0;

    public jq0(PhotoViewer photoViewer) {
        super(photoViewer.f41481o5, photoViewer.E, photoViewer.f41541v2, photoViewer.f41363b0);
        this.f47065u0 = photoViewer;
        this.f47062r0 = new Path();
        this.f47064t0 = new org.telegram.ui.Components.w5(this, 0L, 420L, org.telegram.ui.Components.xq.h);
    }

    public final void m(boolean z9, boolean z10) {
        this.f47063s0 = z9;
        if (!z10) {
            this.f47064t0.f(z9, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f47062r0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f55957l0, org.telegram.messenger.g0.L(this.f55960p0), org.telegram.messenger.g0.L(this.f55960p0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f47065u0;
        if (this == photoViewer.f41535u5 || this == photoViewer.f41544v5) {
            canvas.translate(-photoViewer.f41527t5.getX(), -photoViewer.f41527t5.getY());
        }
        photoViewer.N0(canvas, this.f55956k0, -13948117, 855638016, false, true, false);
        float d = this.f47064t0.d(this.f47063s0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.l6.r1(d, -1));
        }
        setTextColor(i0.a.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f47062r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
