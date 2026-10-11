package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class j41 extends Drawable {
    public final dk0 f27604a;
    public int f27605b;
    public final TextPaint f27606c;

    public j41(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.f27606c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        dk0 dk0Var = new dk0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f27604a = dk0Var;
        dk0Var.setCallback(fVar);
        dk0Var.K(1);
        dk0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        dk0Var.J(true);
        dk0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f27606c.getColor();
        int i10 = this.f27605b;
        dk0 dk0Var = this.f27604a;
        if (color != i10) {
            dk0Var.Z = true;
            dk0Var.Q(color, "Comp 1");
            dk0Var.o();
            dk0Var.J(true);
            dk0Var.V(0L);
            this.f27605b = color;
        }
        dk0Var.draw(canvas);
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
