package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.bw0;
public final class f3 extends View {
    public bw0 f32044a;
    public boolean f32045b;

    @Override
    public final void onDraw(Canvas canvas) {
        bw0 bw0Var;
        if (!this.f32045b && (bw0Var = this.f32044a) != null) {
            bw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z4) {
        this.f32045b = z4;
        invalidate();
    }
}
