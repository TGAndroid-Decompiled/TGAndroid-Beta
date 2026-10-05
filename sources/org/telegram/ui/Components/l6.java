package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class l6 {
    public final v5 f28376a;
    public final StaticLayout f28377b;
    public final float f28378c;
    public final int d;
    public final float f28379e;
    public final float f28380f;
    public final o6 f28381g;

    public l6(o6 o6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f28381g = o6Var;
        this.f28377b = staticLayout;
        this.d = i10;
        this.f28378c = f7;
        float f11 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f28379e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        }
        this.f28380f = f11;
        if (o6Var.getCallback() instanceof View) {
            this.f28376a = z5.update(o6Var.f29362l, (View) o6Var.getCallback(), this.f28376a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f28377b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f28377b, this.f28376a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f28381g.U);
    }
}
