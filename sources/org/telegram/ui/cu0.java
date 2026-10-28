package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class cu0 extends sg.d2 {
    public final Path f38459r0;
    public boolean f38460s0;
    public final org.telegram.ui.Components.h6 f38461t0;
    public final PhotoViewer f38462u0;

    public cu0(PhotoViewer photoViewer) {
        super(photoViewer.f35771p5, photoViewer.E, photoViewer.f35822v2, photoViewer.f35642b0);
        this.f38462u0 = photoViewer;
        this.f38459r0 = new Path();
        this.f38461t0 = new org.telegram.ui.Components.h6(this, 0L, 420L, org.telegram.ui.Components.ds.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f38460s0 = z10;
        if (!z11) {
            this.f38461t0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f38459r0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f48221l0, AndroidUtilities.dp(this.f48224p0), AndroidUtilities.dp(this.f48224p0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f38462u0;
        if (this == photoViewer.f35825v5 || this == photoViewer.f35835w5) {
            canvas.translate(-photoViewer.f35816u5.getX(), -photoViewer.f35816u5.getY());
        }
        photoViewer.U0(canvas, this.f48220k0, -13948117, 855638016, false, true, false);
        float e = this.f38461t0.e(this.f38460s0);
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
        canvas.clipPath(this.f38459r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
