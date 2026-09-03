package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class c31 extends Drawable {
    public final hj0 f25760a;
    public int f25761b;
    public final TextPaint f25762c;

    public c31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 9);
        this.f25762c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        hj0 hj0Var = new hj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f25760a = hj0Var;
        hj0Var.setCallback(fVar);
        hj0Var.I(1);
        hj0Var.K((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        hj0Var.H(true);
        hj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f25762c.getColor();
        int i10 = this.f25761b;
        hj0 hj0Var = this.f25760a;
        if (color != i10) {
            hj0Var.X = true;
            hj0Var.O(color, "Comp 1");
            hj0Var.m();
            hj0Var.H(true);
            hj0Var.S(0L);
            this.f25761b = color;
        }
        hj0Var.draw(canvas);
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
