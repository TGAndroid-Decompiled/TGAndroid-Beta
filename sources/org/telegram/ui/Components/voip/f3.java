package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ww0;
public final class f3 extends View {
    public ww0 f31865a;
    public boolean f31866b;

    @Override
    public final void onDraw(Canvas canvas) {
        ww0 ww0Var;
        if (!this.f31866b && (ww0Var = this.f31865a) != null) {
            ww0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31866b = z10;
        invalidate();
    }
}
