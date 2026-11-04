package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class b01 extends FrameLayout {
    public final Path f43868a;
    public final Paint f43869b;
    public final boolean f43870c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.e6 f43871e;
    public final Integer f43872f;
    public final g11 h;

    public b01(g11 g11Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        super(context);
        this.h = g11Var;
        this.f43870c = z10;
        this.d = z11;
        this.f43871e = e6Var;
        this.f43872f = num;
        this.f43868a = new Path();
        this.f43869b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        g11 g11Var = this.h;
        if (!g11Var.R0) {
            super.dispatchDraw(canvas);
        } else if (this.f43870c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f43869b;
            if (z10) {
                org.telegram.ui.ActionBar.k6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.f43871e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f43872f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.g0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (g11Var.n()) {
                org.telegram.messenger.g0.P.set((L - (g11Var.f45440b1 * L)) + getPaddingLeft(), com.google.android.recaptcha.internal.a.y(1.0f, g11Var.f45443c1, height, getPaddingTop()), ((width - L) * g11Var.f45440b1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.g0.P.set((L - (g11Var.f45440b1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * g11Var.f45440b1) + getPaddingLeft() + L, (height * g11Var.f45443c1) + getPaddingTop());
            }
            Path path = this.f43868a;
            path.rewind();
            path.addRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
    }
}
