package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class au0 extends sg.e2 {
    public final Path f37899r0;
    public boolean f37900s0;
    public final org.telegram.ui.Components.h6 f37901t0;
    public final PhotoViewer f37902u0;

    public au0(PhotoViewer photoViewer) {
        super(photoViewer.f35744p5, photoViewer.E, photoViewer.f35795v2, photoViewer.f35615b0);
        this.f37902u0 = photoViewer;
        this.f37899r0 = new Path();
        this.f37901t0 = new org.telegram.ui.Components.h6(this, 0L, 420L, org.telegram.ui.Components.ds.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f37900s0 = z10;
        if (!z11) {
            this.f37901t0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f37899r0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f48192l0, AndroidUtilities.dp(this.f48195p0), AndroidUtilities.dp(this.f48195p0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f37902u0;
        if (this == photoViewer.f35798v5 || this == photoViewer.f35808w5) {
            canvas.translate(-photoViewer.f35789u5.getX(), -photoViewer.f35789u5.getY());
        }
        photoViewer.U0(canvas, this.f48191k0, -13948117, 855638016, false, true, false);
        float e = this.f37901t0.e(this.f37900s0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.y6.o1(e, -1));
        }
        setTextColor(i0.a.f(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f37899r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
