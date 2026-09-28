package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.nw0;
public final class f3 extends View {
    public nw0 f29274a;
    public boolean f29275b;

    @Override
    public final void onDraw(Canvas canvas) {
        nw0 nw0Var;
        if (!this.f29275b && (nw0Var = this.f29274a) != null) {
            nw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f29275b = z10;
        invalidate();
    }
}
