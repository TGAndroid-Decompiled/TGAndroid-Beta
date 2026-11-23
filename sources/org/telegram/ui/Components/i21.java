package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class i21 extends Drawable {
    public final oh0 f36083a;
    public int f36084b;
    public final TextPaint f36085c;

    public i21(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.f36085c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        oh0 oh0Var = new oh0(2131624001, (int) textSize, (int) (textSize * 1.25f));
        this.f36083a = oh0Var;
        oh0Var.setCallback(bVar);
        oh0Var.K(1);
        oh0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        oh0Var.J(true);
        oh0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f36085c.getColor();
        int i7 = this.f36084b;
        oh0 oh0Var = this.f36083a;
        if (color != i7) {
            oh0Var.f38173a0 = true;
            oh0Var.Q(color, "Comp 1");
            oh0Var.o();
            oh0Var.J(true);
            oh0Var.V(0L);
            this.f36084b = color;
        }
        oh0Var.draw(canvas);
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
