package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.lw0;
public final class e3 extends View {
    public lw0 f28116a;
    public boolean f28117b;

    @Override
    public final void onDraw(Canvas canvas) {
        lw0 lw0Var;
        if (!this.f28117b && (lw0Var = this.f28116a) != null) {
            lw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f28117b = z10;
        invalidate();
    }
}
