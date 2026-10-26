package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class o6 {
    public final y5 f31161a;
    public final StaticLayout f31162b;
    public final float f31163c;
    public final int d;
    public final float e;
    public final float f31164f;
    public final float f31165g;
    public final float h;
    public final r6 f31166i;

    public o6(r6 r6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        float f11;
        float f12;
        this.f31166i = r6Var;
        this.f31162b = staticLayout;
        this.d = i10;
        this.f31163c = f7;
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
        this.f31164f = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineBaseline(0);
        } else {
            f12 = 0.0f;
        }
        this.f31165g = f12;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f31165g : 0.0f;
        if (r6Var.getCallback() instanceof View) {
            this.f31161a = c6.update(r6Var.f32133p, (View) r6Var.getCallback(), this.f31161a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        int i10;
        r6 r6Var = this.f31166i;
        int i11 = r6Var.B;
        TextPaint textPaint = r6Var.f32119a;
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
            this.f31162b.draw(canvas);
            c6.drawAnimatedEmojis(canvas, this.f31162b, this.f31161a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, r6Var.f32120a0);
            if (i10 != -1) {
                canvas.restoreToCount(i10);
            }
        }
    }
}
