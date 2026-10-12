package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class e41 extends Drawable {
    public final yj0 f24608a;
    public int f24609b;
    public final TextPaint f24610c;

    public e41(TextPaint textPaint) {
        ah.f1 f1Var = new ah.f1(this, 6);
        this.f24610c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        yj0 yj0Var = new yj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f24608a = yj0Var;
        yj0Var.setCallback(f1Var);
        yj0Var.K(1);
        yj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        yj0Var.J(true);
        yj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f24610c.getColor();
        int i10 = this.f24609b;
        yj0 yj0Var = this.f24608a;
        if (color != i10) {
            yj0Var.Z = true;
            yj0Var.Q(color, "Comp 1");
            yj0Var.o();
            yj0Var.J(true);
            yj0Var.V(0L);
            this.f24609b = color;
        }
        yj0Var.draw(canvas);
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
