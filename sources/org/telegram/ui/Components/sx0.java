package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class sx0 extends FrameLayout {
    public final ux0 f38169a;
    public boolean f38170b;
    public boolean f38171c;
    public boolean d;

    public sx0(ux0 ux0Var, View view, boolean z9) {
        super(ux0Var.getContext());
        this.f38169a = ux0Var;
        setWillNotDraw(false);
        if (!z9) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.ha.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z9 = this.f38171c;
        ux0 ux0Var = this.f38169a;
        if (z9 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = ux0Var.f38831c;
            boolean z10 = this.f38171c;
            if (z10) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z10) {
                f11 = L;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z11 = this.d;
            if (z11) {
                f12 = L;
            } else {
                f12 = 0.0f;
            }
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z11) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            ux0Var.f38830b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = ux0Var.h;
            float width = getWidth() - ux0Var.h;
            float height = getHeight();
            float f15 = ux0Var.h;
            if (this.d) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            ux0Var.f38830b.addRoundRect(rectF, ux0Var.f38831c, Path.Direction.CW);
            if (this.f38170b) {
                canvas2.drawPath(ux0Var.f38830b, ux0Var.d);
            }
            canvas2.drawPath(ux0Var.f38830b, ux0Var.f38832e);
        } else {
            if (this.f38170b) {
                float f16 = ux0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f16, f16, getWidth() + ux0Var.h, getHeight() + ux0Var.h, ux0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f17 = ux0Var.h;
            canvas2.drawRect(f17, f17, getWidth() - ux0Var.h, getHeight() + ux0Var.h, ux0Var.f38832e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z9) {
        this.f38170b = z9;
    }
}
