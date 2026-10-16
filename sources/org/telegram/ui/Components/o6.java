package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class o6 {
    public final x5 f27550a;
    public final StaticLayout f27551b;
    public final float f27552c;
    public final int d;
    public final float e;
    public final float f27553f;
    public final float f27554g;
    public final float h;
    public final r6 f27555i;

    public o6(r6 r6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        float f11;
        float f12;
        this.f27555i = r6Var;
        this.f27551b = staticLayout;
        this.d = i10;
        this.f27552c = f7;
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
        this.f27553f = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineBaseline(0);
        } else {
            f12 = 0.0f;
        }
        this.f27554g = f12;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f27554g : 0.0f;
        if (r6Var.getCallback() instanceof View) {
            this.f27550a = b6.update(r6Var.f28447p, (View) r6Var.getCallback(), this.f27550a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        int i10;
        r6 r6Var = this.f27555i;
        int i11 = r6Var.B;
        TextPaint textPaint = r6Var.f28433a;
        int max = Math.max(0, Math.min(255, (int) (i11 * f7)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (r6Var.U) {
                textPaint.setShadowLayer(r6Var.V, 0.0f, r6Var.W, r6Var.X);
            }
            if (max < 255) {
                i10 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i10 = -1;
            }
            this.f27551b.draw(canvas);
            b6.drawAnimatedEmojis(canvas, this.f27551b, this.f27550a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, r6Var.f28434a0);
            if (i10 != -1) {
                canvas.restoreToCount(i10);
            }
        }
    }
}
