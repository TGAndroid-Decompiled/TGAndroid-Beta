package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;
public final class n41 extends Drawable {
    public final fk0 f28717a;
    public int f28718b;
    public final TextPaint f28719c;

    public n41(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.f28719c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        fk0 fk0Var = new fk0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.f28717a = fk0Var;
        fk0Var.setCallback(fVar);
        fk0Var.K(1);
        fk0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        fk0Var.J(true);
        fk0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f28719c.getColor();
        int i10 = this.f28718b;
        fk0 fk0Var = this.f28717a;
        if (color != i10) {
            fk0Var.Z = true;
            fk0Var.Q(color, "Comp 1");
            fk0Var.o();
            fk0Var.J(true);
            fk0Var.V(0L);
            this.f28718b = color;
        }
        fk0Var.draw(canvas);
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
