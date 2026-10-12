package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.zw0;
public final class d3 extends View {
    public zw0 f30146a;
    public boolean f30147b;

    @Override
    public final void onDraw(Canvas canvas) {
        zw0 zw0Var;
        if (!this.f30147b && (zw0Var = this.f30146a) != null) {
            zw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f30147b = z10;
        invalidate();
    }
}
