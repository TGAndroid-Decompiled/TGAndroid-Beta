package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class i41 extends Drawable {
    public final ck0 f27238a;
    public int f27239b;
    public final TextPaint f27240c;

    public i41(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.f27240c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ck0 ck0Var = new ck0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f27238a = ck0Var;
        ck0Var.setCallback(fVar);
        ck0Var.K(1);
        ck0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        ck0Var.J(true);
        ck0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f27240c.getColor();
        int i10 = this.f27239b;
        ck0 ck0Var = this.f27238a;
        if (color != i10) {
            ck0Var.Z = true;
            ck0Var.Q(color, "Comp 1");
            ck0Var.o();
            ck0Var.J(true);
            ck0Var.V(0L);
            this.f27239b = color;
        }
        ck0Var.draw(canvas);
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
