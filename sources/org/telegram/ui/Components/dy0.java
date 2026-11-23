package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class dy0 extends TextView {
    public final ey0 f34601a;
    public boolean f34602b;
    public boolean f34603c;

    public dy0(ey0 ey0Var, CharSequence charSequence) {
        super(ey0Var.getContext());
        this.f34601a = ey0Var;
        org.telegram.ui.ActionBar.h6 h6Var = ey0Var.f34986a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.t6.U(this, org.telegram.ui.ActionBar.m6.G6, h6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        boolean z10 = this.f34602b;
        ey0 ey0Var = this.f34601a;
        if (z10 || this.f34603c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = ey0Var.f34988c;
            if (this.f34602b) {
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
            if (!this.f34603c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            ey0Var.f34987b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = ey0Var.h;
            float width = getWidth() + ey0Var.h;
            float height = getHeight();
            float f12 = ey0Var.h;
            if (this.f34603c) {
                i7 = -1;
            }
            rectF.set(f11, f11, width, (f12 * i7) + height);
            ey0Var.f34987b.addRoundRect(rectF, ey0Var.f34988c, Path.Direction.CW);
            canvas2.drawPath(ey0Var.f34987b, ey0Var.d);
            canvas2.drawPath(ey0Var.f34987b, ey0Var.f34989e);
        } else {
            float f13 = ey0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + ey0Var.h, getHeight() + ey0Var.h, ey0Var.d);
            float f14 = ey0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + ey0Var.h, getHeight() + ey0Var.h, ey0Var.f34989e);
        }
        super.onDraw(canvas2);
    }
}
