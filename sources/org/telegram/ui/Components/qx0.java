package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class qx0 extends FrameLayout {
    public final tx0 f37420a;
    public boolean f37421b;
    public boolean f37422c;
    public boolean d;
    public boolean f37423e;

    public qx0(tx0 tx0Var, View view, boolean z9) {
        super(tx0Var.getContext());
        this.d = false;
        this.f37423e = true;
        this.f37420a = tx0Var;
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
        boolean z9 = this.f37421b;
        tx0 tx0Var = this.f37420a;
        if (z9 || this.f37422c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = tx0Var.f38421c;
            boolean z10 = this.f37421b;
            if (z10 && this.d) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z10 && this.f37423e) {
                f11 = L;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z11 = this.f37422c;
            if (z11 && this.f37423e) {
                f12 = L;
            } else {
                f12 = 0.0f;
            }
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z11 || !this.d) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            tx0Var.f38420b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = tx0Var.h;
            float width = getWidth() - tx0Var.h;
            float height = getHeight();
            float f15 = tx0Var.h;
            if (this.f37422c) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            if (!this.f37423e) {
                rectF.right += tx0Var.f38423f;
            }
            tx0Var.f38420b.addRoundRect(rectF, tx0Var.f38421c, Path.Direction.CW);
            canvas2.drawPath(tx0Var.f38420b, tx0Var.f38422e);
        } else {
            float f16 = tx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f16, f16, getWidth() - tx0Var.h, getHeight() + tx0Var.h, tx0Var.f38422e);
        }
        super.onDraw(canvas2);
    }
}
