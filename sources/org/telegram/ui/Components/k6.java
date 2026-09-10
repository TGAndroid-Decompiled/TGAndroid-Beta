package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class k6 {
    public final u5 f24614a;
    public final StaticLayout f24615b;
    public final float f24616c;
    public final int d;
    public final float e;
    public final float f24617f;
    public final n6 f24618g;

    public k6(n6 n6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f24618g = n6Var;
        this.f24615b = staticLayout;
        this.d = i10;
        this.f24616c = f7;
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
        this.f24617f = f11;
        if (n6Var.getCallback() instanceof View) {
            this.f24614a = y5.update(n6Var.f25432l, (View) n6Var.getCallback(), this.f24614a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f24615b.draw(canvas);
        y5.drawAnimatedEmojis(canvas, this.f24615b, this.f24614a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f24618g.U);
    }
}
