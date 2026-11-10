package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ti0 extends Drawable {
    public final Paint f38314a = new Paint(1);
    public final View f38315b;
    public final Path f38316c;
    public final RectF d;
    public final pj0 f38317e;

    public ti0(pj0 pj0Var, View view, Path path, RectF rectF) {
        this.f38317e = pj0Var;
        this.f38315b = view;
        this.f38316c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f38315b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f38316c);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, this.f38317e.f36980n2);
        Paint paint = this.f38314a;
        paint.setColor(i0.a.o(w02, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38314a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
