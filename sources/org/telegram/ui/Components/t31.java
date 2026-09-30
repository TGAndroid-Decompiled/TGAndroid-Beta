package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class t31 extends Drawable {
    public final lj0 f28417a;
    public int f28418b;
    public final TextPaint f28419c;

    public t31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.f28419c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        lj0 lj0Var = new lj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f28417a = lj0Var;
        lj0Var.setCallback(fVar);
        lj0Var.K(1);
        lj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        lj0Var.J(true);
        lj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f28419c.getColor();
        int i10 = this.f28418b;
        lj0 lj0Var = this.f28417a;
        if (color != i10) {
            lj0Var.Z = true;
            lj0Var.Q(color, "Comp 1");
            lj0Var.o();
            lj0Var.J(true);
            lj0Var.V(0L);
            this.f28418b = color;
        }
        lj0Var.draw(canvas);
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
