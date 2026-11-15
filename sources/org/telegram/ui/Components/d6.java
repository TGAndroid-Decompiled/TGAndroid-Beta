package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class d6 {
    public final l5 f33844a;
    public final StaticLayout f33845b;
    public final float f33846c;
    public final int d;
    public final float f33847e;
    public final float f33848f;
    public final float f33849g;
    public final float h;
    public final g6 f33850i;

    public d6(g6 g6Var, StaticLayout staticLayout, float f10, int i7) {
        float f11;
        float f12;
        float f13;
        this.f33850i = g6Var;
        this.f33845b = staticLayout;
        this.d = i7;
        this.f33846c = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f33847e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        } else {
            f12 = 0.0f;
        }
        this.f33848f = f12;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f13 = staticLayout.getLineBaseline(0);
        } else {
            f13 = 0.0f;
        }
        this.f33849g = f13;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f33849g : 0.0f;
        if (g6Var.getCallback() instanceof View) {
            this.f33844a = p5.update(g6Var.f34843p, (View) g6Var.getCallback(), this.f33844a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        int i7;
        g6 g6Var = this.f33850i;
        int i10 = g6Var.C;
        TextPaint textPaint = g6Var.f34827a;
        int max = Math.max(0, Math.min(255, (int) (i10 * f10)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (g6Var.V) {
                textPaint.setShadowLayer(g6Var.W, 0.0f, g6Var.X, g6Var.Y);
            }
            if (max < 255) {
                i7 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i7 = -1;
            }
            this.f33845b.draw(canvas);
            p5.drawAnimatedEmojis(canvas, this.f33845b, this.f33844a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, g6Var.f34830b0);
            if (i7 != -1) {
                canvas.restoreToCount(i7);
            }
        }
    }
}
