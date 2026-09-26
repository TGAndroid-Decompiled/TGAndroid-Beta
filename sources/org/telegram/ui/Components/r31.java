package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class r31 extends Drawable {
    public final jj0 f27824a;
    public int f27825b;
    public final TextPaint f27826c;

    public r31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.f27826c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        jj0 jj0Var = new jj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f27824a = jj0Var;
        jj0Var.setCallback(fVar);
        jj0Var.K(1);
        jj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        jj0Var.J(true);
        jj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f27826c.getColor();
        int i10 = this.f27825b;
        jj0 jj0Var = this.f27824a;
        if (color != i10) {
            jj0Var.Z = true;
            jj0Var.Q(color, "Comp 1");
            jj0Var.o();
            jj0Var.J(true);
            jj0Var.V(0L);
            this.f27825b = color;
        }
        jj0Var.draw(canvas);
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
