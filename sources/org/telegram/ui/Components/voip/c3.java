package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ww0;
public final class c3 extends View {
    public ww0 f31375a;
    public boolean f31376b;

    @Override
    public final void onDraw(Canvas canvas) {
        ww0 ww0Var;
        if (!this.f31376b && (ww0Var = this.f31375a) != null) {
            ww0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31376b = z10;
        invalidate();
    }
}
