package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class hk0 extends Drawable {

    public final Paint f29050a = new Paint(1);

    public final View f29051b;

    public final Path f29052c;
    public final RectF d;

    public final zk0 f29053e;

    public hk0(zk0 zk0Var, View view, Path path, RectF rectF) {
        this.f29053e = zk0Var;
        this.f29051b = view;
        this.f29052c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f29051b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f29052c);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, this.f29053e.f35277l2);
        Paint paint = this.f29050a;
        paint.setColor(i0.b.k(iV0, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29050a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
