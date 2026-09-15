package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class j6 {
    public final t5 f25237a;
    public final StaticLayout f25238b;
    public final float f25239c;
    public final int d;
    public final float e;
    public final float f25240f;
    public final m6 f25241g;

    public j6(m6 m6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f25241g = m6Var;
        this.f25238b = staticLayout;
        this.d = i10;
        this.f25239c = f7;
        float f11 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        }
        this.f25240f = f11;
        if (m6Var.getCallback() instanceof View) {
            this.f25237a = x5.update(m6Var.f26093l, (View) m6Var.getCallback(), this.f25237a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f25238b.draw(canvas);
        x5.drawAnimatedEmojis(canvas, this.f25238b, this.f25237a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f25241g.U);
    }
}
