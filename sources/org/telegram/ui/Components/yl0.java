package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class yl0 extends Drawable {
    public final Paint f33294a = new Paint(1);
    public final View f33295b;
    public final Path f33296c;
    public final RectF d;
    public final sm0 f33297e;

    public yl0(sm0 sm0Var, View view, Path path, RectF rectF) {
        this.f33297e = sm0Var;
        this.f33295b = view;
        this.f33296c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f33295b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f33296c);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, this.f33297e.f30807n2);
        Paint paint = this.f33294a;
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
        this.f33294a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
