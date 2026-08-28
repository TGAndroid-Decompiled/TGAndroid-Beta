package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class f6 {
    public final p5 f28308a;
    public final StaticLayout f28309b;
    public final float f28310c;
    public final int d;
    public final float f28311e;
    public final float f28312f;
    public final i6 f28313g;

    public f6(i6 i6Var, StaticLayout staticLayout, float f10, int i9) {
        float f11;
        this.f28313g = i6Var;
        this.f28309b = staticLayout;
        this.d = i9;
        this.f28310c = f10;
        float f12 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f28311e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        }
        this.f28312f = f12;
        if (i6Var.getCallback() instanceof View) {
            this.f28308a = t5.update(i6Var.f29341l, (View) i6Var.getCallback(), this.f28308a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        this.f28309b.draw(canvas);
        t5.drawAnimatedEmojis(canvas, this.f28309b, this.f28308a, 0.0f, null, 0.0f, 0.0f, 0.0f, f10, this.f28313g.U);
    }
}
