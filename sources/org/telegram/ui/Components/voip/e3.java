package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.lw0;
public final class e3 extends View {
    public lw0 f29344a;
    public boolean f29345b;

    @Override
    public final void onDraw(Canvas canvas) {
        lw0 lw0Var;
        if (!this.f29345b && (lw0Var = this.f29344a) != null) {
            lw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f29345b = z10;
        invalidate();
    }
}
