package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class r11 extends Drawable {
    public final zg0 f37468a;
    public int f37469b;
    public final TextPaint f37470c;

    public r11(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.f37470c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        zg0 zg0Var = new zg0(2131624000, (int) textSize, (int) (textSize * 1.25f));
        this.f37468a = zg0Var;
        zg0Var.setCallback(bVar);
        zg0Var.K(1);
        zg0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        zg0Var.J(true);
        zg0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f37470c.getColor();
        int i7 = this.f37469b;
        zg0 zg0Var = this.f37468a;
        if (color != i7) {
            zg0Var.Z = true;
            zg0Var.Q(color, "Comp 1");
            zg0Var.o();
            zg0Var.J(true);
            zg0Var.V(0L);
            this.f37469b = color;
        }
        zg0Var.draw(canvas);
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
