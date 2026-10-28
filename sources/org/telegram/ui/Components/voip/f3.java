package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.hx0;
public final class f3 extends View {
    public hx0 f33908a;
    public boolean f33909b;

    @Override
    public final void onDraw(Canvas canvas) {
        hx0 hx0Var;
        if (!this.f33909b && (hx0Var = this.f33908a) != null) {
            hx0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f33909b = z10;
        invalidate();
    }
}
