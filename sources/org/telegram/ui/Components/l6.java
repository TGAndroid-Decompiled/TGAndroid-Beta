package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class l6 {
    public final v5 f28285a;
    public final StaticLayout f28286b;
    public final float f28287c;
    public final int d;
    public final float f28288e;
    public final float f28289f;
    public final o6 f28290g;

    public l6(o6 o6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f28290g = o6Var;
        this.f28286b = staticLayout;
        this.d = i10;
        this.f28287c = f7;
        float f11 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f28288e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        }
        this.f28289f = f11;
        if (o6Var.getCallback() instanceof View) {
            this.f28285a = z5.update(o6Var.f29247l, (View) o6Var.getCallback(), this.f28285a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f28286b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f28286b, this.f28285a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f28290g.U);
    }
}
