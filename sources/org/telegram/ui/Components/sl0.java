package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class sl0 extends Drawable {
    public final Paint f30515a = new Paint(1);
    public final View f30516b;
    public final Path f30517c;
    public final RectF d;
    public final mm0 e;

    public sl0(mm0 mm0Var, View view, Path path, RectF rectF) {
        this.e = mm0Var;
        this.f30516b = view;
        this.f30517c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f30516b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f30517c);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.e.f28705n2);
        Paint paint = this.f30515a;
        paint.setColor(i0.a.o(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30515a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
