package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class fl0 extends Drawable {
    public final Paint f24312a = new Paint(1);
    public final View f24313b;
    public final Path f24314c;
    public final RectF d;
    public final zl0 e;

    public fl0(zl0 zl0Var, View view, Path path, RectF rectF) {
        this.e = zl0Var;
        this.f24313b = view;
        this.f24314c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f24313b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f24314c);
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, this.e.f31015p2);
        Paint paint = this.f24312a;
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
        this.f24312a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
