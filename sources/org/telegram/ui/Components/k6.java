package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class k6 {
    public final u5 f25627a;
    public final StaticLayout f25628b;
    public final float f25629c;
    public final int d;
    public final float e;
    public final float f25630f;
    public final n6 f25631g;

    public k6(n6 n6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f25631g = n6Var;
        this.f25628b = staticLayout;
        this.d = i10;
        this.f25629c = f7;
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
        this.f25630f = f11;
        if (n6Var.getCallback() instanceof View) {
            this.f25627a = y5.update(n6Var.f26650l, (View) n6Var.getCallback(), this.f25627a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f25628b.draw(canvas);
        y5.drawAnimatedEmojis(canvas, this.f25628b, this.f25627a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f25631g.U);
    }
}
