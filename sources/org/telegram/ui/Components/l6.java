package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class l6 {
    public final v5 f26018a;
    public final StaticLayout f26019b;
    public final float f26020c;
    public final int d;
    public final float e;
    public final float f26021f;
    public final o6 f26022g;

    public l6(o6 o6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f26022g = o6Var;
        this.f26019b = staticLayout;
        this.d = i10;
        this.f26020c = f7;
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
        this.f26021f = f11;
        if (o6Var.getCallback() instanceof View) {
            this.f26018a = z5.update(o6Var.f26932l, (View) o6Var.getCallback(), this.f26018a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f26019b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f26019b, this.f26018a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f26022g.U);
    }
}
