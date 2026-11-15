package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class i01 extends FrameLayout {
    public final Path f47871a;
    public final Paint f47872b;
    public final boolean f47873c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.e6 f47874e;
    public final Integer f47875f;
    public final n11 h;

    public i01(n11 n11Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        super(context);
        this.h = n11Var;
        this.f47873c = z10;
        this.d = z11;
        this.f47874e = e6Var;
        this.f47875f = num;
        this.f47871a = new Path();
        this.f47872b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        n11 n11Var = this.h;
        if (!n11Var.R0) {
            super.dispatchDraw(canvas);
        } else if (this.f47873c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f47872b;
            if (z10) {
                org.telegram.ui.ActionBar.j6.n(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.f47874e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f47875f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float L = intValue + org.telegram.messenger.g0.L(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (n11Var.n()) {
                org.telegram.messenger.g0.P.set((L - (n11Var.f49370b1 * L)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, n11Var.f49373c1, height, getPaddingTop()), ((width - L) * n11Var.f49370b1) + getPaddingLeft() + L, getPaddingTop() + height);
            } else {
                org.telegram.messenger.g0.P.set((L - (n11Var.f49370b1 * L)) + getPaddingLeft(), getPaddingTop(), ((width - L) * n11Var.f49370b1) + getPaddingLeft() + L, (height * n11Var.f49373c1) + getPaddingTop());
            }
            Path path = this.f47871a;
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
