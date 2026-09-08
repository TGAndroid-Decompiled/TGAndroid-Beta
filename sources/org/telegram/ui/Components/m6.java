package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class m6 {
    public final v5 f28414a;
    public final StaticLayout f28415b;
    public final float f28416c;
    public final int d;
    public final float f28417e;
    public final float f28418f;
    public final p6 f28419g;

    public m6(p6 p6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f28419g = p6Var;
        this.f28415b = staticLayout;
        this.d = i10;
        this.f28416c = f7;
        float f11 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f28417e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        }
        this.f28418f = f11;
        if (p6Var.getCallback() instanceof View) {
            this.f28414a = z5.update(p6Var.f29320l, (View) p6Var.getCallback(), this.f28414a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f28415b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f28415b, this.f28414a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f28419g.U);
    }
}
