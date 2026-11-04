package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class d6 {
    public final l5 f32952a;
    public final StaticLayout f32953b;
    public final float f32954c;
    public final int d;
    public final float f32955e;
    public final float f32956f;
    public final float f32957g;
    public final float h;
    public final g6 f32958i;

    public d6(g6 g6Var, StaticLayout staticLayout, float f10, int i3) {
        float f11;
        float f12;
        float f13;
        this.f32958i = g6Var;
        this.f32953b = staticLayout;
        this.d = i3;
        this.f32954c = f10;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f32955e = f11;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f12 = staticLayout.getLineWidth(0);
        } else {
            f12 = 0.0f;
        }
        this.f32956f = f12;
        if (staticLayout != null && staticLayout.getLineCount() > 0) {
            f13 = staticLayout.getLineBaseline(0);
        } else {
            f13 = 0.0f;
        }
        this.f32957g = f13;
        this.h = staticLayout != null ? staticLayout.getHeight() - this.f32957g : 0.0f;
        if (g6Var.getCallback() instanceof View) {
            this.f32952a = p5.update(g6Var.f33996p, (View) g6Var.getCallback(), this.f32952a, staticLayout);
        }
    }

    public final void a(Canvas canvas, float f10) {
        int i3;
        g6 g6Var = this.f32958i;
        int i10 = g6Var.B;
        TextPaint textPaint = g6Var.f33981a;
        int max = Math.max(0, Math.min(255, (int) (i10 * f10)));
        if (max != 0) {
            textPaint.setAlpha(255);
            if (g6Var.U) {
                textPaint.setShadowLayer(g6Var.V, 0.0f, g6Var.W, g6Var.X);
            }
            if (max < 255) {
                i3 = canvas.saveLayerAlpha(null, max, 31);
            } else {
                i3 = -1;
            }
            this.f32953b.draw(canvas);
            p5.drawAnimatedEmojis(canvas, this.f32953b, this.f32952a, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, g6Var.f33982a0);
            if (i3 != -1) {
                canvas.restoreToCount(i3);
            }
        }
    }
}
