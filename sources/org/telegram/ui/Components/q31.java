package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class q31 extends Drawable {
    public final hj0 f26312a;
    public int f26313b;
    public final TextPaint f26314c;

    public q31(TextPaint textPaint) {
        hi.s0 s0Var = new hi.s0(this, 5);
        this.f26314c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        hj0 hj0Var = new hj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f26312a = hj0Var;
        hj0Var.setCallback(s0Var);
        hj0Var.K(1);
        hj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        hj0Var.J(true);
        hj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f26314c.getColor();
        int i10 = this.f26313b;
        hj0 hj0Var = this.f26312a;
        if (color != i10) {
            hj0Var.f23646a0 = true;
            hj0Var.Q(color, "Comp 1");
            hj0Var.o();
            hj0Var.J(true);
            hj0Var.U(0L);
            this.f26313b = color;
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
