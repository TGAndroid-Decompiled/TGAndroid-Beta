package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class l41 extends Drawable {
    public final yj0 f30111a;
    public int f30112b;
    public final TextPaint f30113c;

    public l41(TextPaint textPaint) {
        bh.u0 u0Var = new bh.u0(this, 8);
        this.f30113c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        yj0 yj0Var = new yj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f30111a = yj0Var;
        yj0Var.setCallback(u0Var);
        yj0Var.K(1);
        yj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        yj0Var.J(true);
        yj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f30113c.getColor();
        int i10 = this.f30112b;
        yj0 yj0Var = this.f30111a;
        if (color != i10) {
            yj0Var.Z = true;
            yj0Var.Q(color, "Comp 1");
            yj0Var.o();
            yj0Var.J(true);
            yj0Var.V(0L);
            this.f30112b = color;
        }
        yj0Var.draw(canvas);
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
