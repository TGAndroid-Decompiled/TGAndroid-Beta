package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class w11 extends Drawable {
    public final ch0 f41229a;
    public int f41230b;
    public final TextPaint f41231c;

    public w11(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.f41231c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ch0 ch0Var = new ch0(2131624001, (int) textSize, (int) (textSize * 1.25f));
        this.f41229a = ch0Var;
        ch0Var.setCallback(bVar);
        ch0Var.K(1);
        ch0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        ch0Var.J(true);
        ch0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f41231c.getColor();
        int i7 = this.f41230b;
        ch0 ch0Var = this.f41229a;
        if (color != i7) {
            ch0Var.f33573a0 = true;
            ch0Var.Q(color, "Comp 1");
            ch0Var.o();
            ch0Var.J(true);
            ch0Var.V(0L);
            this.f41230b = color;
        }
        ch0Var.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
