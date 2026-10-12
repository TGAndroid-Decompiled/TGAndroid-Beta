package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class n6 {
    public final x5 f28738a;
    public final StaticLayout f28739b;
    public final float f28740c;
    public final int d;
    public final float f28741e;
    public final float f28742f;
    public final float f28743g;
    public final float h;
    public final q6 f28744i;

    public n6(q6 q6Var, StaticLayout staticLayout, float f7, int i10) {
        float f10;
        float f11;
        float f12;
        this.f28744i = q6Var;
        this.f28739b = staticLayout;
        this.d = i10;
        this.f28740c = f7;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f28741e = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineWidth(0);
        } else {
            f11 = 0.0f;
        }
        this.f28742f = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineBaseline(0);
        } else {
            f12 = 0.0f;
        }
        this.f28743g = f12;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f28743g : 0.0f;
        if (q6Var.getCallback() instanceof View) {
            this.f28738a = b6.update(q6Var.f29725p, (View) q6Var.getCallback(), this.f28738a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f7) {
        int i10;
        q6 q6Var = this.f28744i;
        int i11 = q6Var.B;
        TextPaint textPaint = q6Var.f29710a;
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
            this.f28739b.draw(canvas);
            b6.drawAnimatedEmojis(canvas, this.f28739b, this.f28738a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, q6Var.f29711a0);
            if (i10 != -1) {
                canvas.restoreToCount(i10);
            }
        }
    }
}
