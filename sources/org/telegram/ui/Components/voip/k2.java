package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.bu0;
public final class k2 extends View {
    public bu0 f39441a;
    public boolean f39442b;

    @Override
    public final void onDraw(Canvas canvas) {
        bu0 bu0Var;
        if (!this.f39442b && (bu0Var = this.f39441a) != null) {
            bu0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f39442b = z10;
        invalidate();
    }
}
