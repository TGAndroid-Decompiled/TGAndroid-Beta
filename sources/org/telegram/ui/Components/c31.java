package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class c31 extends Drawable {
    public final gj0 f23830a;
    public int f23831b;
    public final TextPaint f23832c;

    public c31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 9);
        this.f23832c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        gj0 gj0Var = new gj0(R.raw.dots_loading, (int) textSize, "dots_loading", (int) (textSize * 1.25f));
        this.f23830a = gj0Var;
        gj0Var.setCallback(fVar);
        gj0Var.I(1);
        gj0Var.K((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        gj0Var.H(true);
        gj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f23832c.getColor();
        int i10 = this.f23831b;
        gj0 gj0Var = this.f23830a;
        if (color != i10) {
            gj0Var.X = true;
            gj0Var.O(color, "Comp 1");
            gj0Var.m();
            gj0Var.H(true);
            gj0Var.S(0L);
            this.f23831b = color;
        }
        gj0Var.draw(canvas);
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
