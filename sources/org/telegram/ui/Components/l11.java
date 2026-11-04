package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class l11 extends Drawable {
    public final ch0 f35562a;
    public int f35563b;
    public final TextPaint f35564c;

    public l11(TextPaint textPaint) {
        ah.a aVar = new ah.a(this, 9);
        this.f35564c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ch0 ch0Var = new ch0(2131624000, (int) textSize, (int) (textSize * 1.25f));
        this.f35562a = ch0Var;
        ch0Var.setCallback(aVar);
        ch0Var.K(1);
        ch0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        ch0Var.J(true);
        ch0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f35564c.getColor();
        int i3 = this.f35563b;
        ch0 ch0Var = this.f35562a;
        if (color != i3) {
            ch0Var.f32719a0 = true;
            ch0Var.Q(color, "Comp 1");
            ch0Var.o();
            ch0Var.J(true);
            ch0Var.V(0L);
            this.f35563b = color;
        }
        ch0Var.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
