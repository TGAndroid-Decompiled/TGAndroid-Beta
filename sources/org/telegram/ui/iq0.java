package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
public final class iq0 extends tg.x1 {
    public final Path f48902t0;
    public boolean f48903u0;
    public final org.telegram.ui.Components.c6 f48904v0;
    public final PhotoViewer f48905w0;

    public iq0(PhotoViewer photoViewer) {
        super(photoViewer.f43423p5, photoViewer.F, photoViewer.f43484w2, photoViewer.f43303c0);
        this.f48905w0 = photoViewer;
        this.f48902t0 = new Path();
        this.f48904v0 = new org.telegram.ui.Components.c6(this, 0L, 420L, org.telegram.ui.Components.kr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f48903u0 = z10;
        if (!z11) {
            this.f48904v0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f48902t0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f58292n0, org.telegram.messenger.g0.L(this.f58296r0), org.telegram.messenger.g0.L(this.f58296r0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f48905w0;
        if (this == photoViewer.f43477v5 || this == photoViewer.f43487w5) {
            canvas.translate(-photoViewer.f43468u5.getX(), -photoViewer.f43468u5.getY());
        }
        photoViewer.N0(canvas, this.m0, -13948117, 855638016, false, true, false);
        float d = this.f48904v0.d(this.f48903u0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.n6.r1(d, -1));
        }
        setTextColor(i0.a.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f48902t0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
