package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class k6 {
    public final u5 f36774a;
    public final StaticLayout f36775b;
    public final float f36776c;
    public final int d;
    public final float f36777e;
    public final float f36778f;
    public final float f36779g;
    public final float h;
    public final n6 f36780i;

    public k6(n6 n6Var, StaticLayout staticLayout, float f10, int i7) {
        float f11;
        float f12;
        float f13;
        this.f36780i = n6Var;
        this.f36775b = staticLayout;
        this.d = i7;
        this.f36776c = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f36777e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        } else {
            f12 = 0.0f;
        }
        this.f36778f = f12;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f13 = staticLayout.getLineBaseline(0);
        } else {
            f13 = 0.0f;
        }
        this.f36779g = f13;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f36779g : 0.0f;
        if (n6Var.getCallback() instanceof View) {
            this.f36774a = y5.update(n6Var.f37765p, (View) n6Var.getCallback(), this.f36774a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        int i7;
        n6 n6Var = this.f36780i;
        int i10 = n6Var.C;
        TextPaint textPaint = n6Var.f37749a;
        int max = Math.max(0, Math.min(255, (int) (i10 * f10)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (n6Var.V) {
                textPaint.setShadowLayer(n6Var.W, 0.0f, n6Var.X, n6Var.Y);
            }
            if (max < 255) {
                i7 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i7 = -1;
            }
            this.f36775b.draw(canvas);
            y5.drawAnimatedEmojis(canvas, this.f36775b, this.f36774a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, n6Var.f37752b0);
            if (i7 != -1) {
                canvas.restoreToCount(i7);
            }
        }
    }
}
