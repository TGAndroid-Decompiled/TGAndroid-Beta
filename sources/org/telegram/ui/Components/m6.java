package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class m6 {
    public final w5 f28398a;
    public final StaticLayout f28399b;
    public final float f28400c;
    public final int d;
    public final float e;
    public final float f28401f;
    public final float f28402g;
    public final float h;
    public final p6 f28403i;

    public m6(p6 p6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        float f11;
        float f12;
        this.f28403i = p6Var;
        this.f28399b = staticLayout;
        this.d = i10;
        this.f28400c = f7;
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
        this.f28401f = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineBaseline(0);
        } else {
            f12 = 0.0f;
        }
        this.f28402g = f12;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f28402g : 0.0f;
        if (p6Var.getCallback() instanceof View) {
            this.f28398a = a6.update(p6Var.f29194p, (View) p6Var.getCallback(), this.f28398a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        int i10;
        p6 p6Var = this.f28403i;
        int i11 = p6Var.B;
        TextPaint textPaint = p6Var.f29180a;
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
            this.f28399b.draw(canvas);
            a6.drawAnimatedEmojis(canvas, this.f28399b, this.f28398a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, p6Var.f29181a0);
            if (i10 != -1) {
                canvas.restoreToCount(i10);
            }
        }
    }
}
