package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class rk0 extends Drawable {
    public final Paint f27640a = new Paint(1);
    public final View f27641b;
    public final Path f27642c;
    public final RectF d;
    public final ll0 e;

    public rk0(ll0 ll0Var, View view, Path path, RectF rectF) {
        this.e = ll0Var;
        this.f27641b = view;
        this.f27642c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f27641b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f27642c);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, this.e.f25969p2);
        Paint paint = this.f27640a;
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
        this.f27640a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
