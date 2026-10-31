package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class t21 extends Drawable {
    public final bi0 f30426a;
    public int f30427b;
    public final TextPaint f30428c;

    public t21(TextPaint textPaint) {
        bi.s0 s0Var = new bi.s0(this, 5);
        this.f30428c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        bi0 bi0Var = new bi0(2131624000, (int) textSize, (int) (textSize * 1.25f));
        this.f30426a = bi0Var;
        bi0Var.setCallback(s0Var);
        bi0Var.K(1);
        bi0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        bi0Var.J(true);
        bi0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f30428c.getColor();
        int i10 = this.f30427b;
        bi0 bi0Var = this.f30426a;
        if (color != i10) {
            bi0Var.Z = true;
            bi0Var.Q(color, "Comp 1");
            bi0Var.o();
            bi0Var.J(true);
            bi0Var.V(0L);
            this.f30427b = color;
        }
        bi0Var.draw(canvas);
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
