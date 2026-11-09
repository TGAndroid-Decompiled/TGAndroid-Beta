package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.eu0;
public final class v2 extends View {
    public eu0 f39672a;
    public boolean f39673b;

    @Override
    public final void onDraw(Canvas canvas) {
        eu0 eu0Var;
        if (!this.f39673b && (eu0Var = this.f39672a) != null) {
            eu0Var.b(canvas, this);
        }
    }

    public void setState(boolean z9) {
        this.f39673b = z9;
        invalidate();
    }
}
