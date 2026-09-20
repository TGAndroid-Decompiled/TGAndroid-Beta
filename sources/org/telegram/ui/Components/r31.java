package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class r31 extends Drawable {
    public final hj0 f27760a;
    public int f27761b;
    public final TextPaint f27762c;

    public r31(TextPaint textPaint) {
        ah.d dVar = new ah.d(this, 6);
        this.f27762c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        hj0 hj0Var = new hj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f27760a = hj0Var;
        hj0Var.setCallback(dVar);
        hj0Var.K(1);
        hj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        hj0Var.J(true);
        hj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f27762c.getColor();
        int i10 = this.f27761b;
        hj0 hj0Var = this.f27760a;
        if (color != i10) {
            hj0Var.Z = true;
            hj0Var.Q(color, "Comp 1");
            hj0Var.o();
            hj0Var.J(true);
            hj0Var.V(0L);
            this.f27761b = color;
        }
        hj0Var.draw(canvas);
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
