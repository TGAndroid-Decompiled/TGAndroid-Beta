package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class lt0 extends yf.c2 {
    public final Path f40228k0;
    public boolean f40229l0;
    public final org.telegram.ui.Components.y5 m0;
    public final PhotoViewer f40230n0;

    public lt0(PhotoViewer photoViewer) {
        super(photoViewer.f35685l5, photoViewer.A, photoViewer.f35735r2, photoViewer.X);
        this.f40230n0 = photoViewer;
        this.f40228k0 = new Path();
        this.m0 = new org.telegram.ui.Components.y5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f40229l0 = z10;
        if (!z11) {
            this.m0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f40228k0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f49776e0, AndroidUtilities.dp(this.f49780i0), AndroidUtilities.dp(this.f49780i0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f40230n0;
        if (this == photoViewer.f35738r5 || this == photoViewer.f35748s5) {
            canvas.translate(-photoViewer.f35728q5.getX(), -photoViewer.f35728q5.getY());
        }
        photoViewer.T0(canvas, this.f49775d0, -13948117, 855638016, false, true, false);
        float e10 = this.m0.e(this.f40229l0);
        if (e10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.f6.l1(e10, -1));
        }
        setTextColor(i0.a.d(e10, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f40228k0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
