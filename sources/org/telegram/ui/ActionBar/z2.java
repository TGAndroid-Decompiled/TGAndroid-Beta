package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class z2 extends FrameLayout implements k3 {
    public final k3 f30284a;

    public z2(k3 k3Var) {
        super(k3Var.getContext());
        this.f30284a = k3Var;
    }

    @Override
    public RectF getRect() {
        return this.f30284a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f30284a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.f30284a.z(canvas, rectF, f10, rectF2, f11);
    }
}
