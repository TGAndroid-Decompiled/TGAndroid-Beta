package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class h3 extends FrameLayout implements u3 {
    public final u3 f20679a;

    public h3(u3 u3Var) {
        super(u3Var.getContext());
        this.f20679a = u3Var;
    }

    @Override
    public RectF getRect() {
        return this.f20679a.getRect();
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        this.f20679a.setDrawingFromOverlay(z10);
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        return this.f20679a.y(canvas, rectF, f7, rectF2, f10);
    }
}
