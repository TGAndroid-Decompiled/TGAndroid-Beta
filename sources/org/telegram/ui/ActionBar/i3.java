package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class i3 extends FrameLayout implements v3 {
    public final v3 f18977a;

    public i3(v3 v3Var) {
        super(v3Var.getContext());
        this.f18977a = v3Var;
    }

    @Override
    public RectF getRect() {
        return this.f18977a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f18977a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.f18977a.x(canvas, rectF, f7, rectF2, f10);
    }
}
