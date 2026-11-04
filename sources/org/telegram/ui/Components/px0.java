package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class px0 extends FrameLayout {
    public final rx0 f37265a;
    public boolean f37266b;
    public boolean f37267c;
    public boolean d;

    public px0(rx0 rx0Var, View view, boolean z10) {
        super(rx0Var.getContext());
        this.f37265a = rx0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, b8.mf.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10 = this.f37267c;
        rx0 rx0Var = this.f37265a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = rx0Var.f37838c;
            boolean z11 = this.f37267c;
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
            rx0Var.f37837b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = rx0Var.h;
            float width = getWidth() - rx0Var.h;
            float height = getHeight();
            float f15 = rx0Var.h;
            if (this.d) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            rx0Var.f37837b.addRoundRect(rectF, rx0Var.f37838c, Path.Direction.CW);
            if (this.f37266b) {
                canvas2.drawPath(rx0Var.f37837b, rx0Var.d);
            }
            canvas2.drawPath(rx0Var.f37837b, rx0Var.f37839e);
        } else {
            if (this.f37266b) {
                float f16 = rx0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f16, f16, getWidth() + rx0Var.h, getHeight() + rx0Var.h, rx0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f17 = rx0Var.h;
            canvas2.drawRect(f17, f17, getWidth() - rx0Var.h, getHeight() + rx0Var.h, rx0Var.f37839e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f37266b = z10;
    }
}
