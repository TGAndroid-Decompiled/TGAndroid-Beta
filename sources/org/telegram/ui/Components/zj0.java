package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class zj0 extends Drawable {
    public final Paint f33174a = new Paint(1);
    public final View f33175b;
    public final Path f33176c;
    public final RectF d;
    public final uk0 e;

    public zj0(uk0 uk0Var, View view, Path path, RectF rectF) {
        this.e = uk0Var;
        this.f33175b = view;
        this.f33176c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f33175b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f33176c);
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.e.f31008n2);
        Paint paint = this.f33174a;
        paint.setColor(i0.b.o(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33174a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
