package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class m6 {
    public final w5 f28515a;
    public final StaticLayout f28516b;
    public final float f28517c;
    public final int d;
    public final float e;
    public final float f28518f;
    public final float f28519g;
    public final float h;
    public final p6 f28520i;

    public m6(p6 p6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        float f11;
        float f12;
        this.f28520i = p6Var;
        this.f28516b = staticLayout;
        this.d = i10;
        this.f28517c = f7;
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
        this.f28518f = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineBaseline(0);
        } else {
            f12 = 0.0f;
        }
        this.f28519g = f12;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f28519g : 0.0f;
        if (p6Var.getCallback() instanceof View) {
            this.f28515a = a6.update(p6Var.f29449p, (View) p6Var.getCallback(), this.f28515a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        int i10;
        p6 p6Var = this.f28520i;
        int i11 = p6Var.B;
        TextPaint textPaint = p6Var.f29435a;
        int max = Math.max(0, Math.min(255, (int) (i11 * f7)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (p6Var.U) {
                textPaint.setShadowLayer(p6Var.V, 0.0f, p6Var.W, p6Var.X);
            }
            if (max < 255) {
                i10 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i10 = -1;
            }
            this.f28516b.draw(canvas);
            a6.drawAnimatedEmojis(canvas, this.f28516b, this.f28515a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, p6Var.f29436a0);
            if (i10 != -1) {
                canvas.restoreToCount(i10);
            }
        }
    }
}
