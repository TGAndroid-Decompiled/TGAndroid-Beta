package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class iu0 extends qg.c2 {
    public final Path f37492o0;
    public boolean f37493p0;
    public final org.telegram.ui.Components.e6 f37494q0;
    public final PhotoViewer f37495r0;

    public iu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f34065v2, photoViewer.f33885b0);
        this.f37495r0 = photoViewer;
        this.f37492o0 = new Path();
        this.f37494q0 = new org.telegram.ui.Components.e6(this, 0L, 420L, org.telegram.ui.Components.tr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f37493p0 = z10;
        if (!z11) {
            this.f37494q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f37492o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f45003i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f37495r0;
        if (this == photoViewer.f34068v5 || this == photoViewer.f34078w5) {
            canvas.translate(-photoViewer.f34059u5.getX(), -photoViewer.f34059u5.getY());
        }
        photoViewer.T0(canvas, this.f45002h0, -13948117, 855638016, false, true, false);
        float e7 = this.f37494q0.e(this.f37493p0);
        if (e7 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.i6.l1(e7, -1));
        }
        setTextColor(i0.a.d(e7, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f37492o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
