package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class g6 {
    public final q5 f27101a;
    public final StaticLayout f27102b;
    public final float f27103c;
    public final int d;
    public final float f27104e;
    public final float f27105f;
    public final j6 f27106g;

    public g6(j6 j6Var, StaticLayout staticLayout, float f10, int i10) {
        float f11;
        this.f27106g = j6Var;
        this.f27102b = staticLayout;
        this.d = i10;
        this.f27103c = f10;
        float f12 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f27104e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        }
        this.f27105f = f12;
        if (j6Var.getCallback() instanceof View) {
            this.f27101a = u5.update(j6Var.f28007l, (View) j6Var.getCallback(), this.f27101a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        this.f27102b.draw(canvas);
        u5.drawAnimatedEmojis(canvas, this.f27102b, this.f27101a, 0.0f, null, 0.0f, 0.0f, 0.0f, f10, this.f27106g.U);
    }
}
