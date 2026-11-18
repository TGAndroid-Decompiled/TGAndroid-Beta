package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class f21 extends Drawable {
    public final mh0 f34914a;
    public int f34915b;
    public final TextPaint f34916c;

    public f21(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.f34916c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        mh0 mh0Var = new mh0(2131624001, (int) textSize, (int) (textSize * 1.25f));
        this.f34914a = mh0Var;
        mh0Var.setCallback(bVar);
        mh0Var.K(1);
        mh0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        mh0Var.J(true);
        mh0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f34916c.getColor();
        int i7 = this.f34915b;
        mh0 mh0Var = this.f34914a;
        if (color != i7) {
            mh0Var.f37480a0 = true;
            mh0Var.Q(color, "Comp 1");
            mh0Var.o();
            mh0Var.J(true);
            mh0Var.V(0L);
            this.f34915b = color;
        }
        mh0Var.draw(canvas);
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
