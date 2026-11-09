package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class n01 extends FrameLayout {
    public final Path f48047a;
    public final Paint f48048b;
    public final boolean f48049c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.g6 f48050e;
    public final Integer f48051f;
    public final s11 h;

    public n01(s11 s11Var, Context context, boolean z9, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        super(context);
        this.h = s11Var;
        this.f48049c = z9;
        this.d = z10;
        this.f48050e = g6Var;
        this.f48051f = num;
        this.f48047a = new Path();
        this.f48048b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        s11 s11Var = this.h;
        if (!s11Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f48049c) {
            canvas.save();
            boolean z9 = this.d;
            Paint paint = this.f48048b;
            if (z9) {
                org.telegram.ui.ActionBar.l6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G8, this.f48050e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f48051f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.g0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (s11Var.n()) {
                org.telegram.messenger.g0.P.set((L - (s11Var.f49663a1 * L)) + getPaddingLeft(), com.google.android.recaptcha.internal.a.z(1.0f, s11Var.f49666b1, height, getPaddingTop()), ((width - L) * s11Var.f49663a1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.g0.P.set((L - (s11Var.f49663a1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * s11Var.f49663a1) + getPaddingLeft() + L, (height * s11Var.f49666b1) + getPaddingTop());
            }
            Path path = this.f48047a;
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
