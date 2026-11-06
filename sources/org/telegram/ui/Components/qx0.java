package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class qx0 extends FrameLayout {
    public final sx0 f37425a;
    public boolean f37426b;
    public boolean f37427c;
    public boolean d;

    public qx0(sx0 sx0Var, View view, boolean z9) {
        super(sx0Var.getContext());
        this.f37425a = sx0Var;
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
        boolean z9 = this.f37427c;
        sx0 sx0Var = this.f37425a;
        if (z9 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = sx0Var.f38142c;
            boolean z10 = this.f37427c;
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
            sx0Var.f38141b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = sx0Var.h;
            float width = getWidth() - sx0Var.h;
            float height = getHeight();
            float f15 = sx0Var.h;
            if (this.d) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            sx0Var.f38141b.addRoundRect(rectF, sx0Var.f38142c, Path.Direction.CW);
            if (this.f37426b) {
                canvas2.drawPath(sx0Var.f38141b, sx0Var.d);
            }
            canvas2.drawPath(sx0Var.f38141b, sx0Var.f38143e);
        } else {
            if (this.f37426b) {
                float f16 = sx0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f16, f16, getWidth() + sx0Var.h, getHeight() + sx0Var.h, sx0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f17 = sx0Var.h;
            canvas2.drawRect(f17, f17, getWidth() - sx0Var.h, getHeight() + sx0Var.h, sx0Var.f38143e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z9) {
        this.f37426b = z9;
    }
}
