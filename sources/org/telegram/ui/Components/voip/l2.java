package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.fv0;
public final class l2 extends View {
    public fv0 f31532a;
    public boolean f31533b;

    @Override
    public final void onDraw(Canvas canvas) {
        fv0 fv0Var;
        if (!this.f31533b && (fv0Var = this.f31532a) != null) {
            fv0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31533b = z10;
        invalidate();
    }
}
