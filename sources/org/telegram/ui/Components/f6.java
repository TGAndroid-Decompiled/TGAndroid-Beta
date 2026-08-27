package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;

public final class f6 {

    public final p5 f28264a;

    public final StaticLayout f28265b;

    public final float f28266c;
    public final int d;

    public final float f28267e;

    public final float f28268f;

    public final i6 f28269g;

    public f6(i6 i6Var, StaticLayout staticLayout, float f10, int i10) {
        this.f28269g = i6Var;
        this.f28265b = staticLayout;
        this.d = i10;
        this.f28266c = f10;
        float lineWidth = 0.0f;
        this.f28267e = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            lineWidth = staticLayout.getLineWidth(0);
        }
        this.f28268f = lineWidth;
        if (i6Var.getCallback() instanceof View) {
            this.f28264a = t5.update(i6Var.f29247l, (View) i6Var.getCallback(), this.f28264a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        this.f28265b.draw(canvas);
        t5.drawAnimatedEmojis(canvas, this.f28265b, this.f28264a, 0.0f, null, 0.0f, 0.0f, 0.0f, f10, this.f28269g.U);
    }
}
