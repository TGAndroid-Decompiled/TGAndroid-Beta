package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class j3 extends FrameLayout implements v3 {
    public final v3 f21494a;

    public j3(v3 v3Var) {
        super(v3Var.getContext());
        this.f21494a = v3Var;
    }

    @Override
    public RectF getRect() {
        return this.f21494a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z4) {
        this.f21494a.setDrawingFromOverlay(z4);
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.f21494a.z(canvas, rectF, f10, rectF2, f11);
    }
}
