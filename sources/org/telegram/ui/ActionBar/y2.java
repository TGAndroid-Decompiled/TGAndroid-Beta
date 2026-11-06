package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class y2 extends FrameLayout implements i3 {
    public final i3 f28773a;

    public y2(i3 i3Var) {
        super(i3Var.getContext());
        this.f28773a = i3Var;
    }

    @Override
    public RectF getRect() {
        return this.f28773a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z9) {
        this.f28773a.setDrawingFromOverlay(z9);
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.f28773a.z(canvas, rectF, f10, rectF2, f11);
    }
}
