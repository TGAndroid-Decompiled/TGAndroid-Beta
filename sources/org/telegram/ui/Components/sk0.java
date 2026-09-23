package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class sk0 extends Drawable {
    public final Paint f27945a = new Paint(1);
    public final View f27946b;
    public final Path f27947c;
    public final RectF d;
    public final ml0 e;

    public sk0(ml0 ml0Var, View view, Path path, RectF rectF) {
        this.e = ml0Var;
        this.f27946b = view;
        this.f27947c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f27946b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f27947c);
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, this.e.f26222p2);
        Paint paint = this.f27945a;
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
        this.f27945a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
