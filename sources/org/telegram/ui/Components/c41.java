package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class c41 extends Drawable {
    public final xj0 f25180a;
    public int f25181b;
    public final TextPaint f25182c;

    public c41(TextPaint textPaint) {
        ah.f1 f1Var = new ah.f1(this, 7);
        this.f25182c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        xj0 xj0Var = new xj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f25180a = xj0Var;
        xj0Var.setCallback(f1Var);
        xj0Var.K(1);
        xj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        xj0Var.J(true);
        xj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f25182c.getColor();
        int i10 = this.f25181b;
        xj0 xj0Var = this.f25180a;
        if (color != i10) {
            xj0Var.Z = true;
            xj0Var.Q(color, "Comp 1");
            xj0Var.o();
            xj0Var.J(true);
            xj0Var.V(0L);
            this.f25181b = color;
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
