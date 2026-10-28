package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class o6 {
    public final y5 f31166a;
    public final StaticLayout f31167b;
    public final float f31168c;
    public final int d;
    public final float e;
    public final float f31169f;
    public final float f31170g;
    public final float h;
    public final r6 f31171i;

    public o6(r6 r6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        float f11;
        float f12;
        this.f31171i = r6Var;
        this.f31167b = staticLayout;
        this.d = i10;
        this.f31168c = f7;
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
        this.f31169f = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineBaseline(0);
        } else {
            f12 = 0.0f;
        }
        this.f31170g = f12;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f31170g : 0.0f;
        if (r6Var.getCallback() instanceof View) {
            this.f31166a = c6.update(r6Var.f32154p, (View) r6Var.getCallback(), this.f31166a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        int i10;
        r6 r6Var = this.f31171i;
        int i11 = r6Var.B;
        TextPaint textPaint = r6Var.f32140a;
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
            this.f31167b.draw(canvas);
            c6.drawAnimatedEmojis(canvas, this.f31167b, this.f31166a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, r6Var.f32141a0);
            if (i10 != -1) {
                canvas.restoreToCount(i10);
            }
        }
    }
}
