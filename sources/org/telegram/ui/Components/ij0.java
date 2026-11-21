package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ij0 extends Drawable {
    public final Paint f36268a = new Paint(1);
    public final View f36269b;
    public final Path f36270c;
    public final RectF d;
    public final ek0 f36271e;

    public ij0(ek0 ek0Var, View view, Path path, RectF rectF) {
        this.f36271e = ek0Var;
        this.f36269b = view;
        this.f36270c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f36269b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f36270c);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, this.f36271e.f34875o2);
        Paint paint = this.f36268a;
        paint.setColor(i0.a.o(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f36268a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
