package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class bl0 extends Drawable {
    public final Paint f25631a = new Paint(1);
    public final View f25632b;
    public final Path f25633c;
    public final RectF d;
    public final tl0 f25634e;

    public bl0(tl0 tl0Var, View view, Path path, RectF rectF) {
        this.f25634e = tl0Var;
        this.f25632b = view;
        this.f25633c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f25632b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f25633c);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, this.f25634e.f31383m2);
        Paint paint = this.f25631a;
        paint.setColor(i0.a.k(v02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25631a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
