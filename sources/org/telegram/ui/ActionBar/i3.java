package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class i3 extends FrameLayout implements w3 {
    public final w3 f18749a;

    public i3(w3 w3Var) {
        super(w3Var.getContext());
        this.f18749a = w3Var;
    }

    @Override
    public RectF getRect() {
        return this.f18749a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f18749a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.f18749a.x(canvas, rectF, f7, rectF2, f10);
    }
}
