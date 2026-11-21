package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ou0;
public final class y2 extends View {
    public ou0 f41501a;
    public boolean f41502b;

    @Override
    public final void onDraw(Canvas canvas) {
        ou0 ou0Var;
        if (!this.f41502b && (ou0Var = this.f41501a) != null) {
            ou0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f41502b = z10;
        invalidate();
    }
}
