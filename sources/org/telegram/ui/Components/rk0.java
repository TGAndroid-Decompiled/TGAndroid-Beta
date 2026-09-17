package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class rk0 extends Drawable {
    public final Paint f30038a = new Paint(1);
    public final View f30039b;
    public final Path f30040c;
    public final RectF d;
    public final ll0 f30041e;

    public rk0(ll0 ll0Var, View view, Path path, RectF rectF) {
        this.f30041e = ll0Var;
        this.f30039b = view;
        this.f30040c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f30039b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f30040c);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d6, this.f30041e.f28225p2);
        Paint paint = this.f30038a;
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
        this.f30038a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
