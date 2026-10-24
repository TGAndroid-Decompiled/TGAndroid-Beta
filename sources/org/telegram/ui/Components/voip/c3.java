package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.yw0;
public final class c3 extends View {
    public yw0 f31531a;
    public boolean f31532b;

    @Override
    public final void onDraw(Canvas canvas) {
        yw0 yw0Var;
        if (!this.f31532b && (yw0Var = this.f31531a) != null) {
            yw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31532b = z10;
        invalidate();
    }
}
