package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class tx0 extends TextView {
    public final ux0 f38525a;
    public boolean f38526b;
    public boolean f38527c;

    public tx0(ux0 ux0Var, CharSequence charSequence) {
        super(ux0Var.getContext());
        this.f38525a = ux0Var;
        org.telegram.ui.ActionBar.g6 g6Var = ux0Var.f38829a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.s6.U(this, org.telegram.ui.ActionBar.l6.G6, g6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        boolean z9 = this.f38526b;
        ux0 ux0Var = this.f38525a;
        if (z9 || this.f38527c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = ux0Var.f38831c;
            if (this.f38526b) {
                f10 = L;
            } else {
                f10 = 0.0f;
            }
            int i7 = 1;
            fArr[1] = f10;
            fArr[0] = f10;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f38527c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            ux0Var.f38830b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = ux0Var.h;
            float width = getWidth() + ux0Var.h;
            float height = getHeight();
            float f12 = ux0Var.h;
            if (this.f38527c) {
                i7 = -1;
            }
            rectF.set(f11, f11, width, (f12 * i7) + height);
            ux0Var.f38830b.addRoundRect(rectF, ux0Var.f38831c, Path.Direction.CW);
            canvas2.drawPath(ux0Var.f38830b, ux0Var.d);
            canvas2.drawPath(ux0Var.f38830b, ux0Var.f38832e);
        } else {
            float f13 = ux0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + ux0Var.h, getHeight() + ux0Var.h, ux0Var.d);
            float f14 = ux0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + ux0Var.h, getHeight() + ux0Var.h, ux0Var.f38832e);
        }
        super.onDraw(canvas2);
    }
}
