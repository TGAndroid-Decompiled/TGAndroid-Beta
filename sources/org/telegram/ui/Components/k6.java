package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class k6 {
    public final u5 f29944a;
    public final StaticLayout f29945b;
    public final float f29946c;
    public final int d;
    public final float f29947e;
    public final float f29948f;
    public final n6 f29949g;

    public k6(n6 n6Var, StaticLayout staticLayout, float f9, int i10) {
        float f10;
        this.f29949g = n6Var;
        this.f29945b = staticLayout;
        this.d = i10;
        this.f29946c = f9;
        float f11 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f29947e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        }
        this.f29948f = f11;
        if (n6Var.getCallback() instanceof View) {
            this.f29944a = y5.update(n6Var.f30870l, (View) n6Var.getCallback(), this.f29944a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f9) {
        this.f29945b.draw(canvas);
        y5.drawAnimatedEmojis(canvas, this.f29945b, this.f29944a, 0.0f, null, 0.0f, 0.0f, 0.0f, f9, this.f29949g.U);
    }
}
