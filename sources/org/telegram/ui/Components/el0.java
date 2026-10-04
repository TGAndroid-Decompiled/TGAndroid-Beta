package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class el0 extends Drawable {
    public final Paint f26079a = new Paint(1);
    public final View f26080b;
    public final Path f26081c;
    public final RectF d;
    public final zl0 f26082e;

    public el0(zl0 zl0Var, View view, Path path, RectF rectF) {
        this.f26082e = zl0Var;
        this.f26080b = view;
        this.f26081c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f26080b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f26081c);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d6, this.f26082e.f33546p2);
        Paint paint = this.f26079a;
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
        this.f26079a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
