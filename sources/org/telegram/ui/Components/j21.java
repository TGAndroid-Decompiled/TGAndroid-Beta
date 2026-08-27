package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

public final class j21 extends Drawable {

    public final oi0 f29564a;

    public int f29565b;

    public final TextPaint f29566c;

    public j21(TextPaint textPaint) {
        fg.a aVar = new fg.a(this, 9);
        this.f29566c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        oi0 oi0Var = new oi0(R.raw.dots_loading, (int) textSize, "dots_loading", (int) (textSize * 1.25f));
        this.f29564a = oi0Var;
        oi0Var.setCallback(aVar);
        oi0Var.I(1);
        oi0Var.K((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        oi0Var.H(true);
        oi0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f29566c.getColor();
        int i10 = this.f29565b;
        oi0 oi0Var = this.f29564a;
        if (color != i10) {
            oi0Var.W = true;
            oi0Var.O(color, "Comp 1");
            oi0Var.m();
            oi0Var.H(true);
            oi0Var.S(0L);
            this.f29565b = color;
        }
        oi0Var.draw(canvas);
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
