package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class al0 extends Drawable {
    public final Paint f23449a = new Paint(1);
    public final View f23450b;
    public final Path f23451c;
    public final RectF d;
    public final sl0 e;

    public al0(sl0 sl0Var, View view, Path path, RectF rectF) {
        this.e = sl0Var;
        this.f23450b = view;
        this.f23451c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f23450b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f23451c);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, this.e.f28750m2);
        Paint paint = this.f23449a;
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
        this.f23449a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
