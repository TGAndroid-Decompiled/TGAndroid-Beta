package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.zv0;
public final class c3 extends View {
    public zv0 f31447a;
    public boolean f31448b;

    @Override
    public final void onDraw(Canvas canvas) {
        zv0 zv0Var;
        if (!this.f31448b && (zv0Var = this.f31447a) != null) {
            zv0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31448b = z10;
        invalidate();
    }
}
