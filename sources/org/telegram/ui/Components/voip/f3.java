package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.fx0;
public final class f3 extends View {
    public fx0 f31986a;
    public boolean f31987b;

    @Override
    public final void onDraw(Canvas canvas) {
        fx0 fx0Var;
        if (!this.f31987b && (fx0Var = this.f31986a) != null) {
            fx0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31987b = z10;
        invalidate();
    }
}
