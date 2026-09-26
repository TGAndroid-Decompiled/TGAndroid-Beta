package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class fu0 extends qg.d2 {
    public final Path f33760o0;
    public boolean f33761p0;
    public final org.telegram.ui.Components.e6 f33762q0;
    public final PhotoViewer f33763r0;

    public fu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f31374v2, photoViewer.f31195b0);
        this.f33763r0 = photoViewer;
        this.f33760o0 = new Path();
        this.f33762q0 = new org.telegram.ui.Components.e6(this, 0L, 420L, org.telegram.ui.Components.rr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f33761p0 = z10;
        if (!z11) {
            this.f33762q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f33760o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f41615i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f33763r0;
        if (this == photoViewer.f31377v5 || this == photoViewer.f31387w5) {
            canvas.translate(-photoViewer.f31368u5.getX(), -photoViewer.f31368u5.getY());
        }
        photoViewer.T0(canvas, this.f41614h0, -13948117, 855638016, false, true, false);
        float e = this.f33762q0.e(this.f33761p0);
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
        canvas.clipPath(this.f33760o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
