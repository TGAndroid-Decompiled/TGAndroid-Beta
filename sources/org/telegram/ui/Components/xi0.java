package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class xi0 extends Drawable {
    public final Paint f40369a = new Paint(1);
    public final View f40370b;
    public final Path f40371c;
    public final RectF d;
    public final tj0 f40372e;

    public xi0(tj0 tj0Var, View view, Path path, RectF rectF) {
        this.f40372e = tj0Var;
        this.f40370b = view;
        this.f40371c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f40370b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f40371c);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.f40372e.f38460o2);
        Paint paint = this.f40369a;
        paint.setColor(i0.a.o(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f40369a.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
