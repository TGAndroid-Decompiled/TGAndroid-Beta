package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class h3 extends FrameLayout implements t3 {
    public final t3 f23478a;

    public h3(t3 t3Var) {
        super(t3Var.getContext());
        this.f23478a = t3Var;
    }

    @Override
    public RectF getRect() {
        return this.f23478a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f23478a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f9, RectF rectF2, float f10) {
        return this.f23478a.z(canvas, rectF, f9, rectF2, f10);
    }
}
