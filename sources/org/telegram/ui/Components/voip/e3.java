package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.aw0;
public final class e3 extends View {
    public aw0 f28938a;
    public boolean f28939b;

    @Override
    public final void onDraw(Canvas canvas) {
        aw0 aw0Var;
        if (!this.f28939b && (aw0Var = this.f28938a) != null) {
            aw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f28939b = z10;
        invalidate();
    }
}
