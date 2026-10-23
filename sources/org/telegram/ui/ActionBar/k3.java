package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class k3 extends FrameLayout implements x3 {
    public final x3 f21096a;

    public k3(x3 x3Var) {
        super(x3Var.getContext());
        this.f21096a = x3Var;
    }

    @Override
    public RectF getRect() {
        return this.f21096a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f21096a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.f21096a.y(canvas, rectF, f7, rectF2, f10);
    }
}
