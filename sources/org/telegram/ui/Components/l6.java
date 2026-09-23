package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class l6 {
    public final v5 f25822a;
    public final StaticLayout f25823b;
    public final float f25824c;
    public final int d;
    public final float e;
    public final float f25825f;
    public final o6 f25826g;

    public l6(o6 o6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f25826g = o6Var;
        this.f25823b = staticLayout;
        this.d = i10;
        this.f25824c = f7;
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
        this.f25825f = f11;
        if (o6Var.getCallback() instanceof View) {
            this.f25822a = z5.update(o6Var.f26621l, (View) o6Var.getCallback(), this.f25822a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f25823b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f25823b, this.f25822a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f25826g.U);
    }
}
