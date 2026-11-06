package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class l01 extends FrameLayout {
    public final Path f47348a;
    public final Paint f47349b;
    public final boolean f47350c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.f6 f47351e;
    public final Integer f47352f;
    public final q11 h;

    public l01(q11 q11Var, Context context, boolean z9, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        super(context);
        this.h = q11Var;
        this.f47350c = z9;
        this.d = z10;
        this.f47351e = f6Var;
        this.f47352f = num;
        this.f47348a = new Path();
        this.f47349b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        q11 q11Var = this.h;
        if (!q11Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f47350c) {
            canvas.save();
            boolean z9 = this.d;
            Paint paint = this.f47349b;
            if (z9) {
                org.telegram.ui.ActionBar.k6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.f47351e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f47352f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.g0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (q11Var.n()) {
                org.telegram.messenger.g0.P.set((L - (q11Var.f48991a1 * L)) + getPaddingLeft(), com.google.android.recaptcha.internal.a.z(1.0f, q11Var.f48994b1, height, getPaddingTop()), ((width - L) * q11Var.f48991a1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.g0.P.set((L - (q11Var.f48991a1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * q11Var.f48991a1) + getPaddingLeft() + L, (height * q11Var.f48994b1) + getPaddingTop());
            }
            Path path = this.f47348a;
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
