package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class rl0 extends Drawable {
    public final Paint f30228a = new Paint(1);
    public final View f30229b;
    public final Path f30230c;
    public final RectF d;
    public final lm0 e;

    public rl0(lm0 lm0Var, View view, Path path, RectF rectF) {
        this.e = lm0Var;
        this.f30229b = view;
        this.f30230c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f30229b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f30230c);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, this.e.f28396n2);
        Paint paint = this.f30228a;
        paint.setColor(i0.a.o(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30228a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
