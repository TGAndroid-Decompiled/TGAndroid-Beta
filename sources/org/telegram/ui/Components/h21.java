package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class h21 extends Drawable {
    public final nh0 f35622a;
    public int f35623b;
    public final TextPaint f35624c;

    public h21(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.f35624c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        nh0 nh0Var = new nh0(2131624001, (int) textSize, (int) (textSize * 1.25f));
        this.f35622a = nh0Var;
        nh0Var.setCallback(bVar);
        nh0Var.K(1);
        nh0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        nh0Var.J(true);
        nh0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f35624c.getColor();
        int i7 = this.f35623b;
        nh0 nh0Var = this.f35622a;
        if (color != i7) {
            nh0Var.f37799a0 = true;
            nh0Var.Q(color, "Comp 1");
            nh0Var.o();
            nh0Var.J(true);
            nh0Var.V(0L);
            this.f35623b = color;
        }
        nh0Var.draw(canvas);
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
