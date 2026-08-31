package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.cw0;
public final class f3 extends View {
    public cw0 f32039a;
    public boolean f32040b;

    @Override
    public final void onDraw(Canvas canvas) {
        cw0 cw0Var;
        if (!this.f32040b && (cw0Var = this.f32039a) != null) {
            cw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z4) {
        this.f32040b = z4;
        invalidate();
    }
}
