package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class pu0 extends qg.f2 {
    public final Path f36734o0;
    public boolean f36735p0;
    public final org.telegram.ui.Components.c6 f36736q0;
    public final PhotoViewer f36737r0;

    public pu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f31105v2, photoViewer.f30926b0);
        this.f36737r0 = photoViewer;
        this.f36734o0 = new Path();
        this.f36736q0 = new org.telegram.ui.Components.c6(this, 0L, 420L, org.telegram.ui.Components.qr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f36735p0 = z10;
        if (!z11) {
            this.f36736q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f36734o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f41386i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f36737r0;
        if (this == photoViewer.f31108v5 || this == photoViewer.f31118w5) {
            canvas.translate(-photoViewer.f31099u5.getX(), -photoViewer.f31099u5.getY());
        }
        photoViewer.T0(canvas, this.f41385h0, -13948117, 855638016, false, true, false);
        float e = this.f36736q0.e(this.f36735p0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(e, -1));
        }
        setTextColor(i0.a.d(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f36734o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
