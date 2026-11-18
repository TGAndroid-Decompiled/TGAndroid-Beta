package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.lu0;
public final class y2 extends View {
    public lu0 f41366a;
    public boolean f41367b;

    @Override
    public final void onDraw(Canvas canvas) {
        lu0 lu0Var;
        if (!this.f41367b && (lu0Var = this.f41366a) != null) {
            lu0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f41367b = z10;
        invalidate();
    }
}
