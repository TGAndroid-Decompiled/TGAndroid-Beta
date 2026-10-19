package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class y31 extends Drawable {
    public final uj0 f32541a;
    public int f32542b;
    public final TextPaint f32543c;

    public y31(TextPaint textPaint) {
        ah.f1 f1Var = new ah.f1(this, 7);
        this.f32543c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        uj0 uj0Var = new uj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f32541a = uj0Var;
        uj0Var.setCallback(f1Var);
        uj0Var.K(1);
        uj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        uj0Var.J(true);
        uj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f32543c.getColor();
        int i10 = this.f32542b;
        uj0 uj0Var = this.f32541a;
        if (color != i10) {
            uj0Var.Z = true;
            uj0Var.Q(color, "Comp 1");
            uj0Var.o();
            uj0Var.J(true);
            uj0Var.V(0L);
            this.f32542b = color;
        }
        uj0Var.draw(canvas);
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
