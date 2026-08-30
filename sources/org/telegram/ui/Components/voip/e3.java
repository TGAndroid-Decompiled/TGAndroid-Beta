package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.bw0;
public final class e3 extends View {
    public bw0 f29622a;
    public boolean f29623b;

    @Override
    public final void onDraw(Canvas canvas) {
        bw0 bw0Var;
        if (!this.f29623b && (bw0Var = this.f29622a) != null) {
            bw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z4) {
        this.f29623b = z4;
        invalidate();
    }
}
