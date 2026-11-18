package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class a3 extends FrameLayout implements l3 {
    public final l3 f28754a;

    public a3(l3 l3Var) {
        super(l3Var.getContext());
        this.f28754a = l3Var;
    }

    @Override
    public RectF getRect() {
        return this.f28754a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f28754a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.f28754a.z(canvas, rectF, f10, rectF2, f11);
    }
}
