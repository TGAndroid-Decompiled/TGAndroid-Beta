package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class cl0 extends Drawable {
    public final Paint f23353a = new Paint(1);
    public final View f23354b;
    public final Path f23355c;
    public final RectF d;
    public final wl0 e;

    public cl0(wl0 wl0Var, View view, Path path, RectF rectF) {
        this.e = wl0Var;
        this.f23354b = view;
        this.f23355c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f23354b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f23355c);
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, this.e.f30115p2);
        Paint paint = this.f23353a;
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
        this.f23353a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
