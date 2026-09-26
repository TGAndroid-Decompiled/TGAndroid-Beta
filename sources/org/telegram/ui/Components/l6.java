package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class l6 {
    public final v5 f25974a;
    public final StaticLayout f25975b;
    public final float f25976c;
    public final int d;
    public final float e;
    public final float f25977f;
    public final o6 f25978g;

    public l6(o6 o6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f25978g = o6Var;
        this.f25975b = staticLayout;
        this.d = i10;
        this.f25976c = f7;
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
        this.f25977f = f11;
        if (o6Var.getCallback() instanceof View) {
            this.f25974a = z5.update(o6Var.f26969l, (View) o6Var.getCallback(), this.f25974a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f25975b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f25975b, this.f25974a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f25978g.U);
    }
}
