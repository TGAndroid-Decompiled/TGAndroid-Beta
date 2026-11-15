package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.du0;
public final class z2 extends View {
    public du0 f41119a;
    public boolean f41120b;

    @Override
    public final void onDraw(Canvas canvas) {
        du0 du0Var;
        if (!this.f41120b && (du0Var = this.f41119a) != null) {
            du0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f41120b = z10;
        invalidate();
    }
}
