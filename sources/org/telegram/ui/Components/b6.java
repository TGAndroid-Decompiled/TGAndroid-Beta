package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class b6 {
    public final k5 f24547a;
    public final StaticLayout f24548b;
    public final float f24549c;
    public final int d;
    public final float e;
    public final float f24550f;
    public final float f24551g;
    public final float h;
    public final e6 f24552i;

    public b6(e6 e6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        float f11;
        float f12;
        this.f24552i = e6Var;
        this.f24548b = staticLayout;
        this.d = i10;
        this.f24549c = f7;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        } else {
            f11 = 0.0f;
        }
        this.f24550f = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineBaseline(0);
        } else {
            f12 = 0.0f;
        }
        this.f24551g = f12;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f24551g : 0.0f;
        if (e6Var.getCallback() instanceof View) {
            this.f24547a = o5.update(e6Var.f25707p, (View) e6Var.getCallback(), this.f24547a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        int i10;
        e6 e6Var = this.f24552i;
        int i11 = e6Var.B;
        TextPaint textPaint = e6Var.f25693a;
        int max = Math.max(0, Math.min(255, (int) (i11 * f7)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (e6Var.U) {
                textPaint.setShadowLayer(e6Var.V, 0.0f, e6Var.W, e6Var.X);
            }
            if (max < 255) {
                i10 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i10 = -1;
            }
            this.f24548b.draw(canvas);
            o5.drawAnimatedEmojis(canvas, this.f24548b, this.f24547a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, e6Var.f25694a0);
            if (i10 != -1) {
                canvas.restoreToCount(i10);
            }
        }
    }
}
