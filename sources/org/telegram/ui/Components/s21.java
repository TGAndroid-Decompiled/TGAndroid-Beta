package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class s21 extends Drawable {
    public final xi0 f32463a;
    public int f32464b;
    public final TextPaint f32465c;

    public s21(TextPaint textPaint) {
        hg.a aVar = new hg.a(this, 9);
        this.f32465c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        xi0 xi0Var = new xi0(R.raw.dots_loading, (int) textSize, "dots_loading", (int) (textSize * 1.25f));
        this.f32463a = xi0Var;
        xi0Var.setCallback(aVar);
        xi0Var.I(1);
        xi0Var.K((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        xi0Var.H(true);
        xi0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f32465c.getColor();
        int i10 = this.f32464b;
        xi0 xi0Var = this.f32463a;
        if (color != i10) {
            xi0Var.W = true;
            xi0Var.O(color, "Comp 1");
            xi0Var.m();
            xi0Var.H(true);
            xi0Var.S(0L);
            this.f32464b = color;
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
