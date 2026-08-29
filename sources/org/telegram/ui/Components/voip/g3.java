package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.sv0;
public final class g3 extends View {
    public sv0 f33714a;
    public boolean f33715b;

    @Override
    public final void onDraw(Canvas canvas) {
        sv0 sv0Var;
        if (!this.f33715b && (sv0Var = this.f33714a) != null) {
            sv0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f33715b = z10;
        invalidate();
    }
}
