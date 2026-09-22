package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class d31 extends Drawable {
    public final xi0 f23208a;
    public int f23209b;
    public final TextPaint f23210c;

    public d31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.f23210c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        xi0 xi0Var = new xi0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f23208a = xi0Var;
        xi0Var.setCallback(fVar);
        xi0Var.K(1);
        xi0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        xi0Var.J(true);
        xi0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f23210c.getColor();
        int i10 = this.f23209b;
        xi0 xi0Var = this.f23208a;
        if (color != i10) {
            xi0Var.Z = true;
            xi0Var.Q(color, "Comp 1");
            xi0Var.o();
            xi0Var.J(true);
            xi0Var.V(0L);
            this.f23209b = color;
        }
        xi0Var.draw(canvas);
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
