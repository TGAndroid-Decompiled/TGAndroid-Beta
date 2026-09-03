package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class i3 extends FrameLayout implements u3 {
    public final u3 f19772a;

    public i3(u3 u3Var) {
        super(u3Var.getContext());
        this.f19772a = u3Var;
    }

    @Override
    public RectF getRect() {
        return this.f19772a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z4) {
        this.f19772a.setDrawingFromOverlay(z4);
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        return this.f19772a.z(canvas, rectF, f10, rectF2, f11);
    }
}
