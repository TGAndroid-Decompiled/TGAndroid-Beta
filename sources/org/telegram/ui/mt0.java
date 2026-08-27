package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;

public final class mt0 extends zf.d2 {

    public final Path f40593k0;

    public boolean f40594l0;
    public final org.telegram.ui.Components.y5 m0;

    public final PhotoViewer f40595n0;

    public mt0(PhotoViewer photoViewer) {
        super(photoViewer.f35688l5, photoViewer.A, photoViewer.f35738r2, photoViewer.X);
        this.f40595n0 = photoViewer;
        this.f40593k0 = new Path();
        this.m0 = new org.telegram.ui.Components.y5(this, 0L, 420L, org.telegram.ui.Components.er.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f40594l0 = z10;
        if (!z11) {
            this.m0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f40593k0;
        path.rewind();
        path.addRoundRect(this.f50379e0, AndroidUtilities.dp(this.f50383i0), AndroidUtilities.dp(this.f50383i0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f40595n0;
        if (this == photoViewer.f35741r5 || this == photoViewer.f35751s5) {
            canvas.translate(-photoViewer.f35732q5.getX(), -photoViewer.f35732q5.getY());
        }
        photoViewer.T0(canvas, this.f50378d0, -13948117, 855638016, false, true, false);
        float fE = this.m0.e(this.f40594l0);
        if (fE > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(fE, -1));
        }
        setTextColor(i0.b.d(fE, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f40593k0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
