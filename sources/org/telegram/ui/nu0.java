package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class nu0 extends qg.f2 {
    public final Path f36047o0;
    public boolean f36048p0;
    public final org.telegram.ui.Components.c6 f36049q0;
    public final PhotoViewer f36050r0;

    public nu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f31085v2, photoViewer.f30906b0);
        this.f36050r0 = photoViewer;
        this.f36047o0 = new Path();
        this.f36049q0 = new org.telegram.ui.Components.c6(this, 0L, 420L, org.telegram.ui.Components.qr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f36048p0 = z10;
        if (!z11) {
            this.f36049q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f36047o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f41355i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f36050r0;
        if (this == photoViewer.f31088v5 || this == photoViewer.f31098w5) {
            canvas.translate(-photoViewer.f31079u5.getX(), -photoViewer.f31079u5.getY());
        }
        photoViewer.T0(canvas, this.f41354h0, -13948117, 855638016, false, true, false);
        float e = this.f36049q0.e(this.f36048p0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.i6.l1(e, -1));
        }
        setTextColor(i0.a.d(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f36047o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
