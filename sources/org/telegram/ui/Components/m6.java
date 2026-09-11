package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class m6 {
    public final v5 f28387a;
    public final StaticLayout f28388b;
    public final float f28389c;
    public final int d;
    public final float f28390e;
    public final float f28391f;
    public final p6 f28392g;

    public m6(p6 p6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f28392g = p6Var;
        this.f28388b = staticLayout;
        this.d = i10;
        this.f28389c = f7;
        float f11 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f28390e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        }
        this.f28391f = f11;
        if (p6Var.getCallback() instanceof View) {
            this.f28387a = z5.update(p6Var.f29293l, (View) p6Var.getCallback(), this.f28387a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f28388b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f28388b, this.f28387a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f28392g.U);
    }
}
