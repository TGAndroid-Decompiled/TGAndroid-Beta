package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class k6 {
    public final u5 f25666a;
    public final StaticLayout f25667b;
    public final float f25668c;
    public final int d;
    public final float e;
    public final float f25669f;
    public final n6 f25670g;

    public k6(n6 n6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f25670g = n6Var;
        this.f25667b = staticLayout;
        this.d = i10;
        this.f25668c = f7;
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
        this.f25669f = f11;
        if (n6Var.getCallback() instanceof View) {
            this.f25666a = y5.update(n6Var.f26582l, (View) n6Var.getCallback(), this.f25666a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f25667b.draw(canvas);
        y5.drawAnimatedEmojis(canvas, this.f25667b, this.f25666a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f25670g.U);
    }
}
