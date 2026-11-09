package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class s11 extends Drawable {
    public final ah0 f37879a;
    public int f37880b;
    public final TextPaint f37881c;

    public s11(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.f37881c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ah0 ah0Var = new ah0(2131624000, (int) textSize, (int) (textSize * 1.25f));
        this.f37879a = ah0Var;
        ah0Var.setCallback(bVar);
        ah0Var.K(1);
        ah0Var.M((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        ah0Var.J(true);
        ah0Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.f37881c.getColor();
        int i7 = this.f37880b;
        ah0 ah0Var = this.f37879a;
        if (color != i7) {
            ah0Var.Z = true;
            ah0Var.Q(color, "Comp 1");
            ah0Var.o();
            ah0Var.J(true);
            ah0Var.V(0L);
            this.f37880b = color;
        }
        ah0Var.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
