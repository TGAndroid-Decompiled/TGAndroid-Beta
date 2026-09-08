package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class mu0 extends rg.e2 {
    public final Path f38789o0;
    public boolean f38790p0;
    public final org.telegram.ui.Components.e6 f38791q0;
    public final PhotoViewer f38792r0;

    public mu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f33727v2, photoViewer.f33547b0);
        this.f38792r0 = photoViewer;
        this.f38789o0 = new Path();
        this.f38791q0 = new org.telegram.ui.Components.e6(this, 0L, 420L, org.telegram.ui.Components.pr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f38790p0 = z10;
        if (!z11) {
            this.f38791q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f38789o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f45202i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f38792r0;
        if (this == photoViewer.f33730v5 || this == photoViewer.f33740w5) {
            canvas.translate(-photoViewer.f33721u5.getX(), -photoViewer.f33721u5.getY());
        }
        photoViewer.T0(canvas, this.f45201h0, -13948117, 855638016, false, true, false);
        float e7 = this.f38791q0.e(this.f38790p0);
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
        canvas.clipPath(this.f38789o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
