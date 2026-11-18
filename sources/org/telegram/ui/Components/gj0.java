package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class gj0 extends Drawable {
    public final Paint f35508a = new Paint(1);
    public final View f35509b;
    public final Path f35510c;
    public final RectF d;
    public final ck0 f35511e;

    public gj0(ck0 ck0Var, View view, Path path, RectF rectF) {
        this.f35511e = ck0Var;
        this.f35509b = view;
        this.f35510c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f35509b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f35510c);
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, this.f35511e.f34074o2);
        Paint paint = this.f35508a;
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
        this.f35508a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
