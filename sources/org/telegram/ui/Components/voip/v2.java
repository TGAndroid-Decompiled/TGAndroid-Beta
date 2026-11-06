package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.cu0;
public final class v2 extends View {
    public cu0 f39527a;
    public boolean f39528b;

    @Override
    public final void onDraw(Canvas canvas) {
        cu0 cu0Var;
        if (!this.f39528b && (cu0Var = this.f39527a) != null) {
            cu0Var.b(canvas, this);
        }
    }

    public void setState(boolean z9) {
        this.f39528b = z9;
        invalidate();
    }
}
