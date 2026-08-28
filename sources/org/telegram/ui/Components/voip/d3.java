package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.iv0;
public final class d3 extends View {
    public iv0 f33480a;
    public boolean f33481b;

    @Override
    public final void onDraw(Canvas canvas) {
        iv0 iv0Var;
        if (!this.f33481b && (iv0Var = this.f33480a) != null) {
            iv0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f33481b = z10;
        invalidate();
    }
}
