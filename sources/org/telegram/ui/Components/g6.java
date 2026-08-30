package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class g6 {
    public final q5 f25057a;
    public final StaticLayout f25058b;
    public final float f25059c;
    public final int d;
    public final float e;
    public final float f25060f;
    public final j6 f25061g;

    public g6(j6 j6Var, StaticLayout staticLayout, float f10, int i10) {
        float f11;
        this.f25061g = j6Var;
        this.f25058b = staticLayout;
        this.d = i10;
        this.f25059c = f10;
        float f12 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        }
        this.f25060f = f12;
        if (j6Var.getCallback() instanceof View) {
            this.f25057a = u5.update(j6Var.f25891l, (View) j6Var.getCallback(), this.f25057a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        this.f25058b.draw(canvas);
        u5.drawAnimatedEmojis(canvas, this.f25058b, this.f25057a, 0.0f, null, 0.0f, 0.0f, 0.0f, f10, this.f25061g.U);
    }
}
