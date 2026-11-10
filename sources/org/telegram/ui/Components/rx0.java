package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class rx0 extends FrameLayout {
    public final tx0 f37753a;
    public boolean f37754b;
    public boolean f37755c;
    public boolean d;

    public rx0(tx0 tx0Var, View view, boolean z9) {
        super(tx0Var.getContext());
        this.f37753a = tx0Var;
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
        boolean z9 = this.f37755c;
        tx0 tx0Var = this.f37753a;
        if (z9 || this.d) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = tx0Var.f38425c;
            boolean z10 = this.f37755c;
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
            tx0Var.f38424b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = tx0Var.h;
            float width = getWidth() - tx0Var.h;
            float height = getHeight();
            float f15 = tx0Var.h;
            if (this.d) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            tx0Var.f38424b.addRoundRect(rectF, tx0Var.f38425c, Path.Direction.CW);
            if (this.f37754b) {
                canvas2.drawPath(tx0Var.f38424b, tx0Var.d);
            }
            canvas2.drawPath(tx0Var.f38424b, tx0Var.f38426e);
        } else {
            if (this.f37754b) {
                float f16 = tx0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f16, f16, getWidth() + tx0Var.h, getHeight() + tx0Var.h, tx0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f17 = tx0Var.h;
            canvas2.drawRect(f17, f17, getWidth() - tx0Var.h, getHeight() + tx0Var.h, tx0Var.f38426e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z9) {
        this.f37754b = z9;
    }
}
