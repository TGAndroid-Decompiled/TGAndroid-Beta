package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class zk0 extends Drawable {
    public final Paint f31404a = new Paint(1);
    public final View f31405b;
    public final Path f31406c;
    public final RectF d;
    public final rl0 e;

    public zk0(rl0 rl0Var, View view, Path path, RectF rectF) {
        this.e = rl0Var;
        this.f31405b = view;
        this.f31406c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f31405b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f31406c);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, this.e.f28511m2);
        Paint paint = this.f31404a;
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
        this.f31404a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
