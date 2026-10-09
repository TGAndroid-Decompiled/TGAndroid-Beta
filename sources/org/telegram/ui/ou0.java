package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class ou0 extends qg.d2 {
    public final Path f40600o0;
    public boolean f40601p0;
    public final org.telegram.ui.Components.g6 f40602q0;
    public final PhotoViewer f40603r0;

    public ou0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.f34055v2, photoViewer.f33875b0);
        this.f40603r0 = photoViewer;
        this.f40600o0 = new Path();
        this.f40602q0 = new org.telegram.ui.Components.g6(this, 0L, 420L, org.telegram.ui.Components.hs.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.f40601p0 = z10;
        if (!z11) {
            this.f40602q0.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.f40600o0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.f46221i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.f40603r0;
        if (this == photoViewer.f34058v5 || this == photoViewer.f34068w5) {
            canvas.translate(-photoViewer.f34049u5.getX(), -photoViewer.f34049u5.getY());
        }
        photoViewer.T0(canvas, this.f46220h0, -13948117, 855638016, false, true, false);
        float e7 = this.f40602q0.e(this.f40601p0);
        if (e7 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.i6.m1(e7, -1));
        }
        setTextColor(i0.a.d(e7, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f40600o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
