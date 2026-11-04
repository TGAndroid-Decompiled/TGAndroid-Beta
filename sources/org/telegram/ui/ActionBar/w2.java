package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class w2 extends FrameLayout implements h3 {
    public final h3 f28774a;

    public w2(h3 h3Var) {
        super(h3Var.getContext());
        this.f28774a = h3Var;
    }

    @Override
    public RectF getRect() {
        return this.f28774a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f28774a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.f28774a.y(canvas, rectF, f10, rectF2, f11);
    }
}
