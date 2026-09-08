package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class h3 extends FrameLayout implements v3 {
    public final v3 f20508a;

    public h3(v3 v3Var) {
        super(v3Var.getContext());
        this.f20508a = v3Var;
    }

    @Override
    public RectF getRect() {
        return this.f20508a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f20508a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.f20508a.z(canvas, rectF, f7, rectF2, f10);
    }
}
