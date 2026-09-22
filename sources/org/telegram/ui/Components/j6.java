package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class j6 {
    public final t5 f25234a;
    public final StaticLayout f25235b;
    public final float f25236c;
    public final int d;
    public final float e;
    public final float f25237f;
    public final m6 f25238g;

    public j6(m6 m6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f25238g = m6Var;
        this.f25235b = staticLayout;
        this.d = i10;
        this.f25236c = f7;
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
        this.f25237f = f11;
        if (m6Var.getCallback() instanceof View) {
            this.f25234a = x5.update(m6Var.f26092l, (View) m6Var.getCallback(), this.f25234a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f25235b.draw(canvas);
        x5.drawAnimatedEmojis(canvas, this.f25235b, this.f25234a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f25238g.U);
    }
}
