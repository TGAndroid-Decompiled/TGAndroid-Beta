package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.gv0;
public final class m2 extends View {
    public gv0 f31611a;
    public boolean f31612b;

    @Override
    public final void onDraw(Canvas canvas) {
        gv0 gv0Var;
        if (!this.f31612b && (gv0Var = this.f31611a) != null) {
            gv0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f31612b = z10;
        invalidate();
    }
}
