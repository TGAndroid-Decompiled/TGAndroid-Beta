package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.vw0;
public final class c3 extends View {
    public vw0 f31426a;
    public boolean f31427b;

    @Override
    public final void onDraw(Canvas canvas) {
        vw0 vw0Var;
        if (!this.f31427b && (vw0Var = this.f31426a) != null) {
            vw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31427b = z10;
        invalidate();
    }
}
