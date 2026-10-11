package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class g3 extends FrameLayout implements t3 {
    public final t3 f20637a;

    public g3(t3 t3Var) {
        super(t3Var.getContext());
        this.f20637a = t3Var;
    }

    @Override
    public RectF getRect() {
        return this.f20637a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f20637a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.f20637a.x(canvas, rectF, f7, rectF2, f10);
    }
}
