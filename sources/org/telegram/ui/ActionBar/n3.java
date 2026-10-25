package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class n3 extends FrameLayout implements z3 {
    public final z3 f22891a;

    public n3(z3 z3Var) {
        super(z3Var.getContext());
        this.f22891a = z3Var;
    }

    @Override
    public RectF getRect() {
        return this.f22891a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f22891a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.f22891a.y(canvas, rectF, f7, rectF2, f10);
    }
}
