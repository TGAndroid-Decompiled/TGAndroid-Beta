package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class x2 extends FrameLayout implements h3 {
    public final h3 f29866a;

    public x2(h3 h3Var) {
        super(h3Var.getContext());
        this.f29866a = h3Var;
    }

    @Override
    public RectF getRect() {
        return this.f29866a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f29866a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.f29866a.z(canvas, rectF, f10, rectF2, f11);
    }
}
