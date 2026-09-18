package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class l6 {
    public final v5 f26030a;
    public final StaticLayout f26031b;
    public final float f26032c;
    public final int d;
    public final float e;
    public final float f26033f;
    public final o6 f26034g;

    public l6(o6 o6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f26034g = o6Var;
        this.f26031b = staticLayout;
        this.d = i10;
        this.f26032c = f7;
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
        this.f26033f = f11;
        if (o6Var.getCallback() instanceof View) {
            this.f26030a = z5.update(o6Var.f26875l, (View) o6Var.getCallback(), this.f26030a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f26031b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f26031b, this.f26030a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f26034g.U);
    }
}
