package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class i01 extends FrameLayout {
    public final Path f47861a;
    public final Paint f47862b;
    public final boolean f47863c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.e6 f47864e;
    public final Integer f47865f;
    public final n11 h;

    public i01(n11 n11Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        super(context);
        this.h = n11Var;
        this.f47863c = z10;
        this.d = z11;
        this.f47864e = e6Var;
        this.f47865f = num;
        this.f47861a = new Path();
        this.f47862b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        n11 n11Var = this.h;
        if (!n11Var.R0) {
            super.dispatchDraw(canvas);
        } else if (this.f47863c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f47862b;
            if (z10) {
                org.telegram.ui.ActionBar.j6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.f47864e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f47865f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.g0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (n11Var.n()) {
                org.telegram.messenger.g0.P.set((L - (n11Var.f49369b1 * L)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, n11Var.f49372c1, height, getPaddingTop()), ((width - L) * n11Var.f49369b1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.g0.P.set((L - (n11Var.f49369b1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * n11Var.f49369b1) + getPaddingLeft() + L, (height * n11Var.f49372c1) + getPaddingTop());
            }
            Path path = this.f47861a;
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
