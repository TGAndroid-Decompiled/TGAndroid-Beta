package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ti0 extends Drawable {
    public final Paint f38341a = new Paint(1);
    public final View f38342b;
    public final Path f38343c;
    public final RectF d;
    public final pj0 f38344e;

    public ti0(pj0 pj0Var, View view, Path path, RectF rectF) {
        this.f38344e = pj0Var;
        this.f38342b = view;
        this.f38343c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f38342b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f38343c);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27848d6, this.f38344e.f36939n2);
        Paint paint = this.f38341a;
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
        this.f38341a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
