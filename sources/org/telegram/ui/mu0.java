package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class mu0 extends rg.e2 {
    public final Path f38762o0;
    public boolean f38763p0;
    public final org.telegram.ui.Components.e6 f38764q0;
    public final PhotoViewer f38765r0;

    public mu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33700v2, photoViewer.f33520b0);
        this.f38765r0 = photoViewer;
        this.f38762o0 = new Path();
        this.f38764q0 = new org.telegram.ui.Components.e6(this, 0L, 420L, org.telegram.ui.Components.pr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f38763p0 = z10;
        if (!z11) {
            this.f38764q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f38762o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f45174i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f38765r0;
        if (this == photoViewer.f33703v5 || this == photoViewer.f33713w5) {
            canvas.translate(-photoViewer.f33694u5.getX(), -photoViewer.f33694u5.getY());
        }
        photoViewer.T0(canvas, this.f45173h0, -13948117, 855638016, false, true, false);
        float e7 = this.f38764q0.e(this.f38763p0);
        if (e7 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(e7, -1));
        }
        setTextColor(i0.a.d(e7, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f38762o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
