package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class d31 extends Drawable {
    public final ij0 f26183a;
    public int f26184b;
    public final TextPaint f26185c;

    public d31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 9);
        this.f26185c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ij0 ij0Var = new ij0(R.raw.dots_loading, (int) textSize, "dots_loading", (int) (textSize * 1.25f));
        this.f26183a = ij0Var;
        ij0Var.setCallback(fVar);
        ij0Var.I(1);
        ij0Var.K((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        ij0Var.H(true);
        ij0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f26185c.getColor();
        int i10 = this.f26184b;
        ij0 ij0Var = this.f26183a;
        if (color != i10) {
            ij0Var.X = true;
            ij0Var.O(color, "Comp 1");
            ij0Var.m();
            ij0Var.H(true);
            ij0Var.S(0L);
            this.f26184b = color;
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
