package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.ou0;
public final class y2 extends View {
    public ou0 f41502a;
    public boolean f41503b;

    @Override
    public final void onDraw(Canvas canvas) {
        ou0 ou0Var;
        if (!this.f41503b && (ou0Var = this.f41502a) != null) {
            ou0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f41503b = z10;
        invalidate();
    }
}
