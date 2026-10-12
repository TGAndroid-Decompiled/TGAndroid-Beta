package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class cm0 extends Drawable {
    public final Paint f24969a = new Paint(1);
    public final View f24970b;
    public final Path f24971c;
    public final RectF d;
    public final wm0 f24972e;

    public cm0(wm0 wm0Var, View view, Path path, RectF rectF) {
        this.f24972e = wm0Var;
        this.f24970b = view;
        this.f24971c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f24970b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f24971c);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, this.f24972e.f32467n2);
        Paint paint = this.f24969a;
        paint.setColor(i0.a.k(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24969a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
