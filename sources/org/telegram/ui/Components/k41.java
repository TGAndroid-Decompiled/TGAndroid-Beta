package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class k41 extends Drawable {
    public final xj0 f29807a;
    public int f29808b;
    public final TextPaint f29809c;

    public k41(TextPaint textPaint) {
        bh.u0 u0Var = new bh.u0(this, 8);
        this.f29809c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        xj0 xj0Var = new xj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f29807a = xj0Var;
        xj0Var.setCallback(u0Var);
        xj0Var.K(1);
        xj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        xj0Var.J(true);
        xj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f29809c.getColor();
        int i10 = this.f29808b;
        xj0 xj0Var = this.f29807a;
        if (color != i10) {
            xj0Var.Z = true;
            xj0Var.Q(color, "Comp 1");
            xj0Var.o();
            xj0Var.J(true);
            xj0Var.V(0L);
            this.f29808b = color;
        }
        xj0Var.draw(canvas);
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
