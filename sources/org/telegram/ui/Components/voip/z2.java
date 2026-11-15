package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.du0;
public final class z2 extends View {
    public du0 f41122a;
    public boolean f41123b;

    @Override
    public final void onDraw(Canvas canvas) {
        du0 du0Var;
        if (!this.f41123b && (du0Var = this.f41122a) != null) {
            du0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f41123b = z10;
        invalidate();
    }
}
