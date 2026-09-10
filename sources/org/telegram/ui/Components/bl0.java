package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class bl0 extends Drawable {
    public final Paint f21854a = new Paint(1);
    public final View f21855b;
    public final Path f21856c;
    public final RectF d;
    public final vl0 e;

    public bl0(vl0 vl0Var, View view, Path path, RectF rectF) {
        this.e = vl0Var;
        this.f21855b = view;
        this.f21856c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f21855b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f21856c);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, this.e.f27987p2);
        Paint paint = this.f21854a;
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
        this.f21854a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
