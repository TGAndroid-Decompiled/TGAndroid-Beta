package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.zw0;
public final class c3 extends View {
    public zw0 f31561a;
    public boolean f31562b;

    @Override
    public final void onDraw(Canvas canvas) {
        zw0 zw0Var;
        if (!this.f31562b && (zw0Var = this.f31561a) != null) {
            zw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31562b = z10;
        invalidate();
    }
}
