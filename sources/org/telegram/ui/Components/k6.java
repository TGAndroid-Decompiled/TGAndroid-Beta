package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class k6 {
    public final u5 f36809a;
    public final StaticLayout f36810b;
    public final float f36811c;
    public final int d;
    public final float f36812e;
    public final float f36813f;
    public final float f36814g;
    public final float h;
    public final n6 f36815i;

    public k6(n6 n6Var, StaticLayout staticLayout, float f10, int i7) {
        float f11;
        float f12;
        float f13;
        this.f36815i = n6Var;
        this.f36810b = staticLayout;
        this.d = i7;
        this.f36811c = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f36812e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        } else {
            f12 = 0.0f;
        }
        this.f36813f = f12;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f13 = staticLayout.getLineBaseline(0);
        } else {
            f13 = 0.0f;
        }
        this.f36814g = f13;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f36814g : 0.0f;
        if (n6Var.getCallback() instanceof View) {
            this.f36809a = y5.update(n6Var.f37810p, (View) n6Var.getCallback(), this.f36809a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        int i7;
        n6 n6Var = this.f36815i;
        int i10 = n6Var.C;
        TextPaint textPaint = n6Var.f37794a;
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
            this.f36810b.draw(canvas);
            y5.drawAnimatedEmojis(canvas, this.f36810b, this.f36809a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, n6Var.f37797b0);
            if (i7 != -1) {
                canvas.restoreToCount(i7);
            }
        }
    }
}
