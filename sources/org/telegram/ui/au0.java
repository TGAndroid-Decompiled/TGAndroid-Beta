package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class au0 extends sg.e2 {
    public final Path f37902r0;
    public boolean f37903s0;
    public final org.telegram.ui.Components.h6 f37904t0;
    public final PhotoViewer f37905u0;

    public au0(PhotoViewer photoViewer) {
        super(photoViewer.f35747p5, photoViewer.E, photoViewer.f35798v2, photoViewer.f35618b0);
        this.f37905u0 = photoViewer;
        this.f37902r0 = new Path();
        this.f37904t0 = new org.telegram.ui.Components.h6(this, 0L, 420L, org.telegram.ui.Components.ds.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f37903s0 = z10;
        if (!z11) {
            this.f37904t0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f37902r0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f48195l0, AndroidUtilities.dp(this.f48198p0), AndroidUtilities.dp(this.f48198p0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f37905u0;
        if (this == photoViewer.f35801v5 || this == photoViewer.f35811w5) {
            canvas.translate(-photoViewer.f35792u5.getX(), -photoViewer.f35792u5.getY());
        }
        photoViewer.U0(canvas, this.f48194k0, -13948117, 855638016, false, true, false);
        float e = this.f37904t0.e(this.f37903s0);
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
        canvas.clipPath(this.f37902r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
