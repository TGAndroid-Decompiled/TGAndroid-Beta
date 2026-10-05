package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.xw0;
public final class f3 extends View {
    public xw0 f31932a;
    public boolean f31933b;

    @Override
    public final void onDraw(Canvas canvas) {
        xw0 xw0Var;
        if (!this.f31933b && (xw0Var = this.f31932a) != null) {
            xw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31933b = z10;
        invalidate();
    }
}
