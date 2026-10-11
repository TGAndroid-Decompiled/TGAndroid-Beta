package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class n6 {
    public final x5 f29047a;
    public final StaticLayout f29048b;
    public final float f29049c;
    public final int d;
    public final float f29050e;
    public final float f29051f;
    public final float f29052g;
    public final float h;
    public final q6 f29053i;

    public n6(q6 q6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        float f11;
        float f12;
        this.f29053i = q6Var;
        this.f29048b = staticLayout;
        this.d = i10;
        this.f29049c = f7;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f29050e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        } else {
            f11 = 0.0f;
        }
        this.f29051f = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineBaseline(0);
        } else {
            f12 = 0.0f;
        }
        this.f29052g = f12;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f29052g : 0.0f;
        if (q6Var.getCallback() instanceof View) {
            this.f29047a = b6.update(q6Var.f30147p, (View) q6Var.getCallback(), this.f29047a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        int i10;
        q6 q6Var = this.f29053i;
        int i11 = q6Var.B;
        TextPaint textPaint = q6Var.f30132a;
        int max = Math.max(0, Math.min(255, (int) (i11 * f7)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (q6Var.U) {
                textPaint.setShadowLayer(q6Var.V, 0.0f, q6Var.W, q6Var.X);
            }
            if (max < 255) {
                i10 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i10 = -1;
            }
            this.f29048b.draw(canvas);
            b6.drawAnimatedEmojis(canvas, this.f29048b, this.f29047a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, q6Var.f30133a0);
            if (i10 != -1) {
                canvas.restoreToCount(i10);
            }
        }
    }
}
