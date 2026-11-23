package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.nu0;
public final class z2 extends View {
    public nu0 f41398a;
    public boolean f41399b;

    @Override
    public final void onDraw(Canvas canvas) {
        nu0 nu0Var;
        if (!this.f41399b && (nu0Var = this.f41398a) != null) {
            nu0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f41399b = z10;
        invalidate();
    }
}
