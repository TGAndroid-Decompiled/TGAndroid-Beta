package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
public final class l6 {
    public final v5 f28286a;
    public final StaticLayout f28287b;
    public final float f28288c;
    public final int d;
    public final float f28289e;
    public final float f28290f;
    public final o6 f28291g;

    public l6(o6 o6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        this.f28291g = o6Var;
        this.f28287b = staticLayout;
        this.d = i10;
        this.f28288c = f7;
        float f11 = 0.0f;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f28289e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        }
        this.f28290f = f11;
        if (o6Var.getCallback() instanceof View) {
            this.f28286a = z5.update(o6Var.f29248l, (View) o6Var.getCallback(), this.f28286a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        this.f28287b.draw(canvas);
        z5.drawAnimatedEmojis(canvas, this.f28287b, this.f28286a, 0.0f, null, 0.0f, 0.0f, 0.0f, f7, this.f28291g.U);
    }
}
