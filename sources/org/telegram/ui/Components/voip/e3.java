package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.dx0;
public final class e3 extends View {
    public dx0 f31929a;
    public boolean f31930b;

    @Override
    public final void onDraw(Canvas canvas) {
        dx0 dx0Var;
        if (!this.f31930b && (dx0Var = this.f31929a) != null) {
            dx0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31930b = z10;
        invalidate();
    }
}
