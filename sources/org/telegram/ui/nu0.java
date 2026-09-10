package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class nu0 extends pg.c2 {
    public final Path f35340o0;
    public boolean f35341p0;
    public final org.telegram.ui.Components.d6 f35342q0;
    public final PhotoViewer f35343r0;

    public nu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f30200v2, photoViewer.f30021b0);
        this.f35343r0 = photoViewer;
        this.f35340o0 = new Path();
        this.f35342q0 = new org.telegram.ui.Components.d6(this, 0L, 420L, org.telegram.ui.Components.wr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f35341p0 = z10;
        if (!z11) {
            this.f35342q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f35340o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f39966i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f35343r0;
        if (this == photoViewer.f30203v5 || this == photoViewer.f30213w5) {
            canvas.translate(-photoViewer.f30194u5.getX(), -photoViewer.f30194u5.getY());
        }
        photoViewer.T0(canvas, this.f39965h0, -13948117, 855638016, false, true, false);
        float e = this.f35342q0.e(this.f35341p0);
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
        canvas.clipPath(this.f35340o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
