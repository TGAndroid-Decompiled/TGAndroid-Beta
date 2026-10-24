package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class k6 {
    public final u5 f27869a;
    public final StaticLayout f27870b;
    public final float f27871c;
    public final int d;
    public final float e;
    public final float f27872f;
    public final float f27873g;
    public final float h;
    public final n6 f27874i;

    public k6(n6 n6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        float f11;
        float f12;
        this.f27874i = n6Var;
        this.f27870b = staticLayout;
        this.d = i10;
        this.f27871c = f7;
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
        this.f27872f = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineBaseline(0);
        } else {
            f12 = 0.0f;
        }
        this.f27873g = f12;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f27873g : 0.0f;
        if (n6Var.getCallback() instanceof View) {
            this.f27869a = y5.update(n6Var.f28809p, (View) n6Var.getCallback(), this.f27869a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        int i10;
        n6 n6Var = this.f27874i;
        int i11 = n6Var.B;
        TextPaint textPaint = n6Var.f28795a;
        int max = Math.max(0, Math.min(255, (int) (i11 * f7)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (n6Var.U) {
                textPaint.setShadowLayer(n6Var.V, 0.0f, n6Var.W, n6Var.X);
            }
            if (max < 255) {
                i10 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i10 = -1;
            }
            this.f27870b.draw(canvas);
            y5.drawAnimatedEmojis(canvas, this.f27870b, this.f27869a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, n6Var.f28796a0);
            if (i10 != -1) {
                canvas.restoreToCount(i10);
            }
        }
    }
}
