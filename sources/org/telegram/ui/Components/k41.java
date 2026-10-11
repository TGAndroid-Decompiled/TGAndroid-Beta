package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class k41 extends Drawable {
    public final ek0 f27841a;
    public int f27842b;
    public final TextPaint f27843c;

    public k41(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.f27843c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ek0 ek0Var = new ek0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f27841a = ek0Var;
        ek0Var.setCallback(fVar);
        ek0Var.K(1);
        ek0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        ek0Var.J(true);
        ek0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f27843c.getColor();
        int i10 = this.f27842b;
        ek0 ek0Var = this.f27841a;
        if (color != i10) {
            ek0Var.Z = true;
            ek0Var.Q(color, "Comp 1");
            ek0Var.o();
            ek0Var.J(true);
            ek0Var.V(0L);
            this.f27842b = color;
        }
        ek0Var.draw(canvas);
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
