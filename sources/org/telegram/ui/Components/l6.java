package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class l6 {
    public final v5 f25915a;
    public final StaticLayout f25916b;
    public final float f25917c;
    public final int d;
    public final float e;
    public final float f25918f;
    public final o6 f25919g;

    public l6(o6 o6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f25919g = o6Var;
        this.f25916b = staticLayout;
        this.d = i10;
        this.f25917c = f7;
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
        this.f25918f = f11;
        if (o6Var.getCallback() instanceof View) {
            this.f25915a = z5.update(o6Var.f26954l, (View) o6Var.getCallback(), this.f25915a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f25916b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f25916b, this.f25915a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f25919g.U);
    }
}
