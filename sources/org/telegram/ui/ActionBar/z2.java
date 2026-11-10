package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class z2 extends FrameLayout implements j3 {
    public final j3 f28815a;

    public z2(j3 j3Var) {
        super(j3Var.getContext());
        this.f28815a = j3Var;
    }

    @Override
    public RectF getRect() {
        return this.f28815a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z9) {
        this.f28815a.setDrawingFromOverlay(z9);
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.f28815a.z(canvas, rectF, f10, rectF2, f11);
    }
}
