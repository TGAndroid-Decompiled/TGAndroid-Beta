package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class jt0 extends bg.g3 {
    public final Path f39687k0;
    public boolean f39688l0;
    public final org.telegram.ui.Components.d6 m0;
    public final PhotoViewer f39689n0;

    public jt0(PhotoViewer photoViewer) {
        super(photoViewer.f35751l5, photoViewer.A, photoViewer.f35802r2, photoViewer.X);
        this.f39689n0 = photoViewer;
        this.f39687k0 = new Path();
        this.m0 = new org.telegram.ui.Components.d6(this, 0L, 420L, org.telegram.ui.Components.jr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f39688l0 = z10;
        if (!z11) {
            this.m0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f39687k0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f2266e0, AndroidUtilities.dp(this.f2270i0), AndroidUtilities.dp(this.f2270i0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f39689n0;
        if (this == photoViewer.f35805r5 || this == photoViewer.f35814s5) {
            canvas.translate(-photoViewer.f35796q5.getX(), -photoViewer.f35796q5.getY());
        }
        photoViewer.T0(canvas, this.f2265d0, -13948117, 855638016, false, true, false);
        float e10 = this.m0.e(this.f39688l0);
        if (e10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(e10, -1));
        }
        setTextColor(i0.a.d(e10, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f39687k0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
