package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.bw0;
public final class e3 extends View {
    public bw0 f28921a;
    public boolean f28922b;

    @Override
    public final void onDraw(Canvas canvas) {
        bw0 bw0Var;
        if (!this.f28922b && (bw0Var = this.f28921a) != null) {
            bw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f28922b = z10;
        invalidate();
    }
}
