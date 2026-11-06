package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class f6 {
    public final n5 f33461a;
    public final StaticLayout f33462b;
    public final float f33463c;
    public final int d;
    public final float f33464e;
    public final float f33465f;
    public final float f33466g;
    public final float h;
    public final i6 f33467i;

    public f6(i6 i6Var, StaticLayout staticLayout, float f10, int i7) {
        float f11;
        float f12;
        float f13;
        this.f33467i = i6Var;
        this.f33462b = staticLayout;
        this.d = i7;
        this.f33463c = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f33464e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        } else {
            f12 = 0.0f;
        }
        this.f33465f = f12;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f13 = staticLayout.getLineBaseline(0);
        } else {
            f13 = 0.0f;
        }
        this.f33466g = f13;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f33466g : 0.0f;
        if (i6Var.getCallback() instanceof View) {
            this.f33461a = r5.update(i6Var.f34521p, (View) i6Var.getCallback(), this.f33461a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        int i7;
        i6 i6Var = this.f33467i;
        int i10 = i6Var.B;
        TextPaint textPaint = i6Var.f34506a;
        int max = Math.max(0, Math.min(255, (int) (i10 * f10)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (i6Var.U) {
                textPaint.setShadowLayer(i6Var.V, 0.0f, i6Var.W, i6Var.X);
            }
            if (max < 255) {
                i7 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i7 = -1;
            }
            this.f33462b.draw(canvas);
            r5.drawAnimatedEmojis(canvas, this.f33462b, this.f33461a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, i6Var.f34507a0);
            if (i7 != -1) {
                canvas.restoreToCount(i7);
            }
        }
    }
}
