package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ex0;
public final class f3 extends View {
    public ex0 f32050a;
    public boolean f32051b;

    @Override
    public final void onDraw(Canvas canvas) {
        ex0 ex0Var;
        if (!this.f32051b && (ex0Var = this.f32050a) != null) {
            ex0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f32051b = z10;
        invalidate();
    }
}
