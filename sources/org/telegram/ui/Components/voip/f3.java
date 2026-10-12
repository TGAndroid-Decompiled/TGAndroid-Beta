package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.jx0;
public final class f3 extends View {
    public jx0 f31672a;
    public boolean f31673b;

    @Override
    public final void onDraw(Canvas canvas) {
        jx0 jx0Var;
        if (!this.f31673b && (jx0Var = this.f31672a) != null) {
            jx0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31673b = z10;
        invalidate();
    }
}
