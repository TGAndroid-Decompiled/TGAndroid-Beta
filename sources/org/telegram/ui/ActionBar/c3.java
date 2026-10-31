package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class c3 extends FrameLayout implements o3 {
    public final o3 f20204a;

    public c3(o3 o3Var) {
        super(o3Var.getContext());
        this.f20204a = o3Var;
    }

    @Override
    public RectF getRect() {
        return this.f20204a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f20204a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.f20204a.x(canvas, rectF, f7, rectF2, f10);
    }
}
