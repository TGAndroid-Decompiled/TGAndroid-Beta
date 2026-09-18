package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.Components.mw0;
public final class e3 extends View {
    public mw0 f29237a;
    public boolean f29238b;

    @Override
    public final void onDraw(Canvas canvas) {
        mw0 mw0Var;
        if (!this.f29238b && (mw0Var = this.f29237a) != null) {
            mw0Var.b(canvas, this);
        }
    }

    public void setState(boolean z10) {
        this.f29238b = z10;
        invalidate();
    }
}
