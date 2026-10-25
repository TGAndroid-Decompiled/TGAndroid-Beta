package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.gx0;
public final class f3 extends View {
    public gx0 f33800a;
    public boolean f33801b;

    @Override
    public final void onDraw(Canvas canvas) {
        gx0 gx0Var;
        if (!this.f33801b && (gx0Var = this.f33800a) != null) {
            gx0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f33801b = z10;
        invalidate();
    }
}
