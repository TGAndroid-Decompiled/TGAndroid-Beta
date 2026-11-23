package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class by0 extends FrameLayout {
    public final ey0 f33904a;
    public boolean f33905b;
    public boolean f33906c;
    public boolean d;
    public boolean f33907e;

    public by0(ey0 ey0Var, View view, boolean z10) {
        super(ey0Var.getContext());
        this.d = false;
        this.f33907e = true;
        this.f33904a = ey0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        }
        addView(view, c8.na.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10 = this.f33905b;
        ey0 ey0Var = this.f33904a;
        if (z10 || this.f33906c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = ey0Var.f34988c;
            boolean z11 = this.f33905b;
            if (z11 && this.d) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z11 && this.f33907e) {
                f11 = L;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.f33906c;
            if (z12 && this.f33907e) {
                f12 = L;
            } else {
                f12 = 0.0f;
            }
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z12 || !this.d) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            ey0Var.f34987b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f14 = ey0Var.h;
            float width = getWidth() - ey0Var.h;
            float height = getHeight();
            float f15 = ey0Var.h;
            if (this.f33906c) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * f13) + height);
            if (!this.f33907e) {
                rectF.right += ey0Var.f34990f;
            }
            ey0Var.f34987b.addRoundRect(rectF, ey0Var.f34988c, Path.Direction.CW);
            canvas2.drawPath(ey0Var.f34987b, ey0Var.f34989e);
        } else {
            float f16 = ey0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f16, f16, getWidth() - ey0Var.h, getHeight() + ey0Var.h, ey0Var.f34989e);
        }
        super.onDraw(canvas2);
    }
}
