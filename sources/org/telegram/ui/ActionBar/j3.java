package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class j3 extends FrameLayout implements x3 {
    public final x3 f17857a;

    public j3(x3 x3Var) {
        super(x3Var.getContext());
        this.f17857a = x3Var;
    }

    @Override
    public RectF getRect() {
        return this.f17857a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f17857a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float w(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.f17857a.w(canvas, rectF, f7, rectF2, f10);
    }
}
