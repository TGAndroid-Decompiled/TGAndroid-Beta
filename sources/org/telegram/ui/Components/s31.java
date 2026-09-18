package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class s31 extends Drawable {
    public final ij0 f28044a;
    public int f28045b;
    public final TextPaint f28046c;

    public s31(TextPaint textPaint) {
        ah.d dVar = new ah.d(this, 6);
        this.f28046c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ij0 ij0Var = new ij0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f28044a = ij0Var;
        ij0Var.setCallback(dVar);
        ij0Var.K(1);
        ij0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        ij0Var.J(true);
        ij0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f28046c.getColor();
        int i10 = this.f28045b;
        ij0 ij0Var = this.f28044a;
        if (color != i10) {
            ij0Var.Z = true;
            ij0Var.Q(color, "Comp 1");
            ij0Var.o();
            ij0Var.J(true);
            ij0Var.V(0L);
            this.f28045b = color;
        }
        ij0Var.draw(canvas);
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
