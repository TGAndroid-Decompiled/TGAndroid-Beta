package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class z31 extends Drawable {
    public final vj0 f32831a;
    public int f32832b;
    public final TextPaint f32833c;

    public z31(TextPaint textPaint) {
        ah.f1 f1Var = new ah.f1(this, 7);
        this.f32833c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        vj0 vj0Var = new vj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f32831a = vj0Var;
        vj0Var.setCallback(f1Var);
        vj0Var.K(1);
        vj0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        vj0Var.J(true);
        vj0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f32833c.getColor();
        int i10 = this.f32832b;
        vj0 vj0Var = this.f32831a;
        if (color != i10) {
            vj0Var.Z = true;
            vj0Var.Q(color, "Comp 1");
            vj0Var.o();
            vj0Var.J(true);
            vj0Var.V(0L);
            this.f32832b = color;
        }
        vj0Var.draw(canvas);
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
