package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class j6 {
    public final t5 f36299a;
    public final StaticLayout f36300b;
    public final float f36301c;
    public final int d;
    public final float f36302e;
    public final float f36303f;
    public final float f36304g;
    public final float h;
    public final m6 f36305i;

    public j6(m6 m6Var, StaticLayout staticLayout, float f10, int i7) {
        float f11;
        float f12;
        float f13;
        this.f36305i = m6Var;
        this.f36300b = staticLayout;
        this.d = i7;
        this.f36301c = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f36302e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        } else {
            f12 = 0.0f;
        }
        this.f36303f = f12;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f13 = staticLayout.getLineBaseline(0);
        } else {
            f13 = 0.0f;
        }
        this.f36304g = f13;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f36304g : 0.0f;
        if (m6Var.getCallback() instanceof View) {
            this.f36299a = x5.update(m6Var.f37408p, (View) m6Var.getCallback(), this.f36299a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        int i7;
        m6 m6Var = this.f36305i;
        int i10 = m6Var.C;
        TextPaint textPaint = m6Var.f37392a;
        int max = Math.max(0, Math.min(255, (int) (i10 * f10)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (m6Var.V) {
                textPaint.setShadowLayer(m6Var.W, 0.0f, m6Var.X, m6Var.Y);
            }
            if (max < 255) {
                i7 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i7 = -1;
            }
            this.f36300b.draw(canvas);
            x5.drawAnimatedEmojis(canvas, this.f36300b, this.f36299a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, m6Var.f37395b0);
            if (i7 != -1) {
                canvas.restoreToCount(i7);
            }
        }
    }
}
