package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ww0;
public final class c3 extends View {
    public ww0 f31380a;
    public boolean f31381b;

    @Override
    public final void onDraw(Canvas canvas) {
        ww0 ww0Var;
        if (!this.f31381b && (ww0Var = this.f31380a) != null) {
            ww0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31381b = z10;
        invalidate();
    }
}
