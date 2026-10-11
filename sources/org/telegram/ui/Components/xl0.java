package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class xl0 extends Drawable {
    public final Paint f33027a = new Paint(1);
    public final View f33028b;
    public final Path f33029c;
    public final RectF d;
    public final rm0 f33030e;

    public xl0(rm0 rm0Var, View view, Path path, RectF rectF) {
        this.f33030e = rm0Var;
        this.f33028b = view;
        this.f33029c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f33028b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f33029c);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, this.f33030e.f30570n2);
        Paint paint = this.f33027a;
        paint.setColor(i0.a.k(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33027a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
