package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ij0 extends Drawable {
    public final Paint f36217a = new Paint(1);
    public final View f36218b;
    public final Path f36219c;
    public final RectF d;
    public final ek0 f36220e;

    public ij0(ek0 ek0Var, View view, Path path, RectF rectF) {
        this.f36220e = ek0Var;
        this.f36218b = view;
        this.f36219c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f36218b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f36219c);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.f36220e.f34859o2);
        Paint paint = this.f36217a;
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
        this.f36217a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
