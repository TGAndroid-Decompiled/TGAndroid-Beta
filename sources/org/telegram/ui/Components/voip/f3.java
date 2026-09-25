package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.lw0;
public final class f3 extends View {
    public lw0 f29353a;
    public boolean f29354b;

    @Override
    public final void onDraw(Canvas canvas) {
        lw0 lw0Var;
        if (!this.f29354b && (lw0Var = this.f29353a) != null) {
            lw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f29354b = z10;
        invalidate();
    }
}
