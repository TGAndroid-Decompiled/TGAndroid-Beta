package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class sk0 extends Drawable {
    public final Paint f27880a = new Paint(1);
    public final View f27881b;
    public final Path f27882c;
    public final RectF d;
    public final ml0 e;

    public sk0(ml0 ml0Var, View view, Path path, RectF rectF) {
        this.e = ml0Var;
        this.f27881b = view;
        this.f27882c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f27881b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f27882c);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18863d6, this.e.f26194p2);
        Paint paint = this.f27880a;
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
        this.f27880a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
