package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.kv0;

public final class d3 extends View {

    public kv0 f33530a;

    public boolean f33531b;

    @Override
    public final void onDraw(Canvas canvas) {
        kv0 kv0Var;
        if (this.f33531b || (kv0Var = this.f33530a) == null) {
            return;
        }
        kv0Var.b(canvas, this);
    }

    public void setState(boolean z10) {
        this.f33531b = z10;
        invalidate();
    }
}
