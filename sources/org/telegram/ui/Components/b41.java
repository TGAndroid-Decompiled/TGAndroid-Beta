package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class b41 extends Drawable {
    public final kj0 f24786a;
    public int f24787b;
    public final TextPaint f24788c;

    public b41(TextPaint textPaint) {
        ah.d dVar = new ah.d(this, 6);
        this.f24788c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        kj0 kj0Var = new kj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f24786a = kj0Var;
        kj0Var.setCallback(dVar);
        kj0Var.K(1);
        kj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        kj0Var.J(true);
        kj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f24788c.getColor();
        int i10 = this.f24787b;
        kj0 kj0Var = this.f24786a;
        if (color != i10) {
            kj0Var.Z = true;
            kj0Var.Q(color, "Comp 1");
            kj0Var.o();
            kj0Var.J(true);
            kj0Var.V(0L);
            this.f24787b = color;
        }
        kj0Var.draw(canvas);
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
