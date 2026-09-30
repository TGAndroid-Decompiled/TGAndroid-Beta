package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.nw0;
public final class f3 extends View {
    public nw0 f29264a;
    public boolean f29265b;

    @Override
    public final void onDraw(Canvas canvas) {
        nw0 nw0Var;
        if (!this.f29265b && (nw0Var = this.f29264a) != null) {
            nw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f29265b = z10;
        invalidate();
    }
}
