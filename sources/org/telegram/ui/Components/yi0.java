package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class yi0 extends Drawable {
    public final Paint f42007a = new Paint(1);
    public final View f42008b;
    public final Path f42009c;
    public final RectF d;
    public final uj0 f42010e;

    public yi0(uj0 uj0Var, View view, Path path, RectF rectF) {
        this.f42010e = uj0Var;
        this.f42008b = view;
        this.f42009c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.f42008b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.f42009c);
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.f42010e.f40069o2);
        Paint paint = this.f42007a;
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
        this.f42007a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
