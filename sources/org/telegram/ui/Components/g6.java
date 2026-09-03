package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class g6 {
    public final q5 f25063a;
    public final StaticLayout f25064b;
    public final float f25065c;
    public final int d;
    public final float e;
    public final float f25066f;
    public final j6 f25067g;

    public g6(j6 j6Var, StaticLayout staticLayout, float f10, int i10) {
        float f11;
        this.f25067g = j6Var;
        this.f25064b = staticLayout;
        this.d = i10;
        this.f25065c = f10;
        float f12 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        }
        this.f25066f = f12;
        if (j6Var.getCallback() instanceof View) {
            this.f25063a = u5.update(j6Var.f25854l, (View) j6Var.getCallback(), this.f25063a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        this.f25064b.draw(canvas);
        u5.drawAnimatedEmojis(canvas, this.f25064b, this.f25063a, 0.0f, null, 0.0f, 0.0f, 0.0f, f10, this.f25067g.U);
    }
}
