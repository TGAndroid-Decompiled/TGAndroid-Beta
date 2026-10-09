package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class h3 extends FrameLayout implements u3 {
    public final u3 f20683a;

    public h3(u3 u3Var) {
        super(u3Var.getContext());
        this.f20683a = u3Var;
    }

    @Override
    public RectF getRect() {
        return this.f20683a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f20683a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.f20683a.x(canvas, rectF, f7, rectF2, f10);
    }
}
