package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.nw0;
public final class f3 extends View {
    public nw0 f29295a;
    public boolean f29296b;

    @Override
    public final void onDraw(Canvas canvas) {
        nw0 nw0Var;
        if (!this.f29296b && (nw0Var = this.f29295a) != null) {
            nw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f29296b = z10;
        invalidate();
    }
}
