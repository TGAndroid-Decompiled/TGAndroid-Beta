package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class g6 {
    public final q5 f27117a;
    public final StaticLayout f27118b;
    public final float f27119c;
    public final int d;
    public final float f27120e;
    public final float f27121f;
    public final j6 f27122g;

    public g6(j6 j6Var, StaticLayout staticLayout, float f10, int i10) {
        float f11;
        this.f27122g = j6Var;
        this.f27118b = staticLayout;
        this.d = i10;
        this.f27119c = f10;
        float f12 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f27120e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        }
        this.f27121f = f12;
        if (j6Var.getCallback() instanceof View) {
            this.f27117a = u5.update(j6Var.f28037l, (View) j6Var.getCallback(), this.f27117a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        this.f27118b.draw(canvas);
        u5.drawAnimatedEmojis(canvas, this.f27118b, this.f27117a, 0.0f, null, 0.0f, 0.0f, 0.0f, f10, this.f27122g.U);
    }
}
