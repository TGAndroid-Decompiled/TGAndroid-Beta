package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class cy0 extends FrameLayout {
    public final ey0 f34336a;
    public boolean f34337b;
    public boolean f34338c;
    public boolean d;

    public cy0(ey0 ey0Var, View view, boolean z10) {
        super(ey0Var.getContext());
        this.f34336a = ey0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.ma.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10 = this.f34338c;
        ey0 ey0Var = this.f34336a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = ey0Var.f35015c;
            boolean z11 = this.f34338c;
            if (z11) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z11) {
                f11 = L;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.d;
            if (z12) {
                f12 = L;
            } else {
                f12 = 0.0f;
            }
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z12) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            ey0Var.f35014b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = ey0Var.h;
            float width = getWidth() - ey0Var.h;
            float height = getHeight();
            float f15 = ey0Var.h;
            if (this.d) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            ey0Var.f35014b.addRoundRect(rectF, ey0Var.f35015c, Path.Direction.CW);
            if (this.f34337b) {
                canvas2.drawPath(ey0Var.f35014b, ey0Var.d);
            }
            canvas2.drawPath(ey0Var.f35014b, ey0Var.f35016e);
        } else {
            if (this.f34337b) {
                float f16 = ey0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f16, f16, getWidth() + ey0Var.h, getHeight() + ey0Var.h, ey0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f17 = ey0Var.h;
            canvas2.drawRect(f17, f17, getWidth() - ey0Var.h, getHeight() + ey0Var.h, ey0Var.f35016e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f34337b = z10;
    }
}
