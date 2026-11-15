package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class tx0 extends FrameLayout {
    public final vx0 f39829a;
    public boolean f39830b;
    public boolean f39831c;
    public boolean d;

    public tx0(vx0 vx0Var, View view, boolean z10) {
        super(vx0Var.getContext());
        this.f39829a = vx0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.ja.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10 = this.f39831c;
        vx0 vx0Var = this.f39829a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = vx0Var.f41179c;
            boolean z11 = this.f39831c;
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
            vx0Var.f41178b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = vx0Var.h;
            float width = getWidth() - vx0Var.h;
            float height = getHeight();
            float f15 = vx0Var.h;
            if (this.d) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            vx0Var.f41178b.addRoundRect(rectF, vx0Var.f41179c, Path.Direction.CW);
            if (this.f39830b) {
                canvas2.drawPath(vx0Var.f41178b, vx0Var.d);
            }
            canvas2.drawPath(vx0Var.f41178b, vx0Var.f41180e);
        } else {
            if (this.f39830b) {
                float f16 = vx0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f16, f16, getWidth() + vx0Var.h, getHeight() + vx0Var.h, vx0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f17 = vx0Var.h;
            canvas2.drawRect(f17, f17, getWidth() - vx0Var.h, getHeight() + vx0Var.h, vx0Var.f41180e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f39830b = z10;
    }
}
