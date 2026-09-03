package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class al0 extends Drawable {
    public final Paint f25274a = new Paint(1);
    public final View f25275b;
    public final Path f25276c;
    public final RectF d;
    public final sl0 f25277e;

    public al0(sl0 sl0Var, View view, Path path, RectF rectF) {
        this.f25277e = sl0Var;
        this.f25275b = view;
        this.f25276c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f25275b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f25276c);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, this.f25277e.f31106m2);
        Paint paint = this.f25274a;
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
        this.f25274a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
