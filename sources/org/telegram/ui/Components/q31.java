package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class q31 extends Drawable {
    public final ij0 f27488a;
    public int f27489b;
    public final TextPaint f27490c;

    public q31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.f27490c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ij0 ij0Var = new ij0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f27488a = ij0Var;
        ij0Var.setCallback(fVar);
        ij0Var.K(1);
        ij0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        ij0Var.J(true);
        ij0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f27490c.getColor();
        int i10 = this.f27489b;
        ij0 ij0Var = this.f27488a;
        if (color != i10) {
            ij0Var.Z = true;
            ij0Var.Q(color, "Comp 1");
            ij0Var.o();
            ij0Var.J(true);
            ij0Var.V(0L);
            this.f27489b = color;
        }
        ij0Var.draw(canvas);
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
