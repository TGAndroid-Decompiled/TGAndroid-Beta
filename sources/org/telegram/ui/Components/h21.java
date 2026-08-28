package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class h21 extends Drawable {
    public final mi0 f28955a;
    public int f28956b;
    public final TextPaint f28957c;

    public h21(TextPaint textPaint) {
        eg.a aVar = new eg.a(this, 9);
        this.f28957c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        mi0 mi0Var = new mi0(R.raw.dots_loading, (int) textSize, "dots_loading", (int) (textSize * 1.25f));
        this.f28955a = mi0Var;
        mi0Var.setCallback(aVar);
        mi0Var.I(1);
        mi0Var.K((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        mi0Var.H(true);
        mi0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f28957c.getColor();
        int i9 = this.f28956b;
        mi0 mi0Var = this.f28955a;
        if (color != i9) {
            mi0Var.W = true;
            mi0Var.O(color, "Comp 1");
            mi0Var.m();
            mi0Var.H(true);
            mi0Var.S(0L);
            this.f28956b = color;
        }
        mi0Var.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
