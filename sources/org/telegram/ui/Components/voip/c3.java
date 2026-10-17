package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.uw0;
public final class c3 extends View {
    public uw0 f31415a;
    public boolean f31416b;

    @Override
    public final void onDraw(Canvas canvas) {
        uw0 uw0Var;
        if (!this.f31416b && (uw0Var = this.f31415a) != null) {
            uw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31416b = z10;
        invalidate();
    }
}
