package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ow0;
public final class f3 extends View {
    public ow0 f29270a;
    public boolean f29271b;

    @Override
    public final void onDraw(Canvas canvas) {
        ow0 ow0Var;
        if (!this.f29271b && (ow0Var = this.f29270a) != null) {
            ow0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f29271b = z10;
        invalidate();
    }
}
