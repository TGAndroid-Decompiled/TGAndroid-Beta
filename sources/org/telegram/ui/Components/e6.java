package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class e6 {
    public final m5 f33173a;
    public final StaticLayout f33174b;
    public final float f33175c;
    public final int d;
    public final float f33176e;
    public final float f33177f;
    public final float f33178g;
    public final float h;
    public final h6 f33179i;

    public e6(h6 h6Var, StaticLayout staticLayout, float f10, int i7) {
        float f11;
        float f12;
        float f13;
        this.f33179i = h6Var;
        this.f33174b = staticLayout;
        this.d = i7;
        this.f33175c = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f33176e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        } else {
            f12 = 0.0f;
        }
        this.f33177f = f12;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f13 = staticLayout.getLineBaseline(0);
        } else {
            f13 = 0.0f;
        }
        this.f33178g = f13;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f33178g : 0.0f;
        if (h6Var.getCallback() instanceof View) {
            this.f33173a = q5.update(h6Var.f34200p, (View) h6Var.getCallback(), this.f33173a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        int i7;
        h6 h6Var = this.f33179i;
        int i10 = h6Var.B;
        TextPaint textPaint = h6Var.f34185a;
        int max = Math.max(0, Math.min(255, (int) (i10 * f10)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (h6Var.U) {
                textPaint.setShadowLayer(h6Var.V, 0.0f, h6Var.W, h6Var.X);
            }
            if (max < 255) {
                i7 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i7 = -1;
            }
            this.f33174b.draw(canvas);
            q5.drawAnimatedEmojis(canvas, this.f33174b, this.f33173a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, h6Var.f34186a0);
            if (i7 != -1) {
                canvas.restoreToCount(i7);
            }
        }
    }
}
