package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.zv0;
public final class c3 extends View {
    public zv0 f31474a;
    public boolean f31475b;

    @Override
    public final void onDraw(Canvas canvas) {
        zv0 zv0Var;
        if (!this.f31475b && (zv0Var = this.f31474a) != null) {
            zv0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31475b = z10;
        invalidate();
    }
}
