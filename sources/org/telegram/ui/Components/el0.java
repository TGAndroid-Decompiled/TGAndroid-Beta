package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class el0 extends Drawable {
    public final Paint f23965a = new Paint(1);
    public final View f23966b;
    public final Path f23967c;
    public final RectF d;
    public final yl0 e;

    public el0(yl0 yl0Var, View view, Path path, RectF rectF) {
        this.e = yl0Var;
        this.f23966b = view;
        this.f23967c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f23966b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f23967c);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19109d6, this.e.f30704p2);
        Paint paint = this.f23965a;
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
        this.f23965a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
