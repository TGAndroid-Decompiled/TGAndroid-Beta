package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class fu0 extends qg.d2 {
    public final Path f33759o0;
    public boolean f33760p0;
    public final org.telegram.ui.Components.e6 f33761q0;
    public final PhotoViewer f33762r0;

    public fu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f31373v2, photoViewer.f31194b0);
        this.f33762r0 = photoViewer;
        this.f33759o0 = new Path();
        this.f33761q0 = new org.telegram.ui.Components.e6(this, 0L, 420L, org.telegram.ui.Components.sr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f33760p0 = z10;
        if (!z11) {
            this.f33761q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f33759o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f41614i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f33762r0;
        if (this == photoViewer.f31376v5 || this == photoViewer.f31386w5) {
            canvas.translate(-photoViewer.f31367u5.getX(), -photoViewer.f31367u5.getY());
        }
        photoViewer.T0(canvas, this.f41613h0, -13948117, 855638016, false, true, false);
        float e = this.f33761q0.e(this.f33760p0);
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
        canvas.clipPath(this.f33759o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
