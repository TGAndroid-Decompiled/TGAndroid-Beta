package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.uw0;
public final class c3 extends View {
    public uw0 f31422a;
    public boolean f31423b;

    @Override
    public final void onDraw(Canvas canvas) {
        uw0 uw0Var;
        if (!this.f31423b && (uw0Var = this.f31422a) != null) {
            uw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31423b = z10;
        invalidate();
    }
}
