package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class u21 extends Drawable {
    public final ci0 f30837a;
    public int f30838b;
    public final TextPaint f30839c;

    public u21(TextPaint textPaint) {
        bi.s0 s0Var = new bi.s0(this, 5);
        this.f30839c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ci0 ci0Var = new ci0(2131624000, (int) textSize, (int) (textSize * 1.25f));
        this.f30837a = ci0Var;
        ci0Var.setCallback(s0Var);
        ci0Var.K(1);
        ci0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        ci0Var.J(true);
        ci0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f30839c.getColor();
        int i10 = this.f30838b;
        ci0 ci0Var = this.f30837a;
        if (color != i10) {
            ci0Var.Z = true;
            ci0Var.Q(color, "Comp 1");
            ci0Var.o();
            ci0Var.J(true);
            ci0Var.V(0L);
            this.f30838b = color;
        }
        ci0Var.draw(canvas);
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
