package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ex0;
public final class e3 extends View {
    public ex0 f31994a;
    public boolean f31995b;

    @Override
    public final void onDraw(Canvas canvas) {
        ex0 ex0Var;
        if (!this.f31995b && (ex0Var = this.f31994a) != null) {
            ex0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31995b = z10;
        invalidate();
    }
}
