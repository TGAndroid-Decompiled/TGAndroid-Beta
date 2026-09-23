package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.aw0;
public final class e3 extends View {
    public aw0 f28912a;
    public boolean f28913b;

    @Override
    public final void onDraw(Canvas canvas) {
        aw0 aw0Var;
        if (!this.f28913b && (aw0Var = this.f28912a) != null) {
            aw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f28913b = z10;
        invalidate();
    }
}
