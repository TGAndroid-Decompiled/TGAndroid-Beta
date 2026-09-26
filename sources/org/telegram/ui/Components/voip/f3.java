package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.mw0;
public final class f3 extends View {
    public mw0 f29269a;
    public boolean f29270b;

    @Override
    public final void onDraw(Canvas canvas) {
        mw0 mw0Var;
        if (!this.f29270b && (mw0Var = this.f29269a) != null) {
            mw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f29270b = z10;
        invalidate();
    }
}
