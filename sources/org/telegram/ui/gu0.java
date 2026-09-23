package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class gu0 extends qg.f2 {
    public final Path f33656o0;
    public boolean f33657p0;
    public final org.telegram.ui.Components.e6 f33658q0;
    public final PhotoViewer f33659r0;

    public gu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f31059v2, photoViewer.f30880b0);
        this.f33659r0 = photoViewer;
        this.f33656o0 = new Path();
        this.f33658q0 = new org.telegram.ui.Components.e6(this, 0L, 420L, org.telegram.ui.Components.rr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f33657p0 = z10;
        if (!z11) {
            this.f33658q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f33656o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f41311i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f33659r0;
        if (this == photoViewer.f31062v5 || this == photoViewer.f31072w5) {
            canvas.translate(-photoViewer.f31053u5.getX(), -photoViewer.f31053u5.getY());
        }
        photoViewer.T0(canvas, this.f41310h0, -13948117, 855638016, false, true, false);
        float e = this.f33658q0.e(this.f33657p0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.h6.l1(e, -1));
        }
        setTextColor(i0.a.d(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f33656o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
