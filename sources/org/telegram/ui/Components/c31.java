package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class c31 extends Drawable {
    public final xi0 f24878a;
    public int f24879b;
    public final TextPaint f24880c;

    public c31(TextPaint textPaint) {
        ah.g1 g1Var = new ah.g1(this, 6);
        this.f24880c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        xi0 xi0Var = new xi0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f24878a = xi0Var;
        xi0Var.setCallback(g1Var);
        xi0Var.I(1);
        xi0Var.K((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        xi0Var.H(true);
        xi0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f24880c.getColor();
        int i10 = this.f24879b;
        xi0 xi0Var = this.f24878a;
        if (color != i10) {
            xi0Var.f32551a0 = true;
            xi0Var.O(color, "Comp 1");
            xi0Var.m();
            xi0Var.H(true);
            xi0Var.S(0L);
            this.f24879b = color;
        }
        xi0Var.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
