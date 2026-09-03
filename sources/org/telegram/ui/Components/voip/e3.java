package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.bw0;
public final class e3 extends View {
    public bw0 f29594a;
    public boolean f29595b;

    @Override
    public final void onDraw(Canvas canvas) {
        bw0 bw0Var;
        if (!this.f29595b && (bw0Var = this.f29594a) != null) {
            bw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z4) {
        this.f29595b = z4;
        invalidate();
    }
}
