package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class j6 {
    public final t5 f25138a;
    public final StaticLayout f25139b;
    public final float f25140c;
    public final int d;
    public final float e;
    public final float f25141f;
    public final m6 f25142g;

    public j6(m6 m6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f25142g = m6Var;
        this.f25139b = staticLayout;
        this.d = i10;
        this.f25140c = f7;
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
        this.f25141f = f11;
        if (m6Var.getCallback() instanceof View) {
            this.f25138a = x5.update(m6Var.f26074l, (View) m6Var.getCallback(), this.f25138a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f25139b.draw(canvas);
        x5.drawAnimatedEmojis(canvas, this.f25139b, this.f25138a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f25142g.U);
    }
}
