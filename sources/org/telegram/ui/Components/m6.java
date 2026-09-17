package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class m6 {
    public final v5 f28415a;
    public final StaticLayout f28416b;
    public final float f28417c;
    public final int d;
    public final float f28418e;
    public final float f28419f;
    public final p6 f28420g;

    public m6(p6 p6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f28420g = p6Var;
        this.f28416b = staticLayout;
        this.d = i10;
        this.f28417c = f7;
        float f11 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f28418e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        }
        this.f28419f = f11;
        if (p6Var.getCallback() instanceof View) {
            this.f28415a = z5.update(p6Var.f29321l, (View) p6Var.getCallback(), this.f28415a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f28416b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f28416b, this.f28415a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f28420g.U);
    }
}
