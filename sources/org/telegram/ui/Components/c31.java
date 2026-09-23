package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class c31 extends Drawable {
    public final yi0 f22905a;
    public int f22906b;
    public final TextPaint f22907c;

    public c31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.f22907c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        yi0 yi0Var = new yi0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f22905a = yi0Var;
        yi0Var.setCallback(fVar);
        yi0Var.K(1);
        yi0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        yi0Var.J(true);
        yi0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f22907c.getColor();
        int i10 = this.f22906b;
        yi0 yi0Var = this.f22905a;
        if (color != i10) {
            yi0Var.Z = true;
            yi0Var.Q(color, "Comp 1");
            yi0Var.o();
            yi0Var.J(true);
            yi0Var.V(0L);
            this.f22906b = color;
        }
        yi0Var.draw(canvas);
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
