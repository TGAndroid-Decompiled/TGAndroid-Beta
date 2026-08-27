package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

public final class g3 extends FrameLayout implements t3 {

    public final t3 f22975a;

    public g3(t3 t3Var) {
        super(t3Var.getContext());
        this.f22975a = t3Var;
    }

    @Override
    public RectF getRect() {
        return this.f22975a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f22975a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.f22975a.z(canvas, rectF, f10, rectF2, f11);
    }
}
