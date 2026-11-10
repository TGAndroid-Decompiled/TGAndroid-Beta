package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.du0;
public final class v2 extends View {
    public du0 f39592a;
    public boolean f39593b;

    @Override
    public final void onDraw(Canvas canvas) {
        du0 du0Var;
        if (!this.f39593b && (du0Var = this.f39592a) != null) {
            du0Var.b(canvas, this);
        }
    }

    public void setState(boolean z9) {
        this.f39593b = z9;
        invalidate();
    }
}
