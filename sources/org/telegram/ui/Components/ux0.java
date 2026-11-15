package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class ux0 extends TextView {
    public final vx0 f40185a;
    public boolean f40186b;
    public boolean f40187c;

    public ux0(vx0 vx0Var, CharSequence charSequence) {
        super(vx0Var.getContext());
        this.f40185a = vx0Var;
        org.telegram.ui.ActionBar.e6 e6Var = vx0Var.f41174a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.q6.U(this, org.telegram.ui.ActionBar.j6.G6, e6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        boolean z10 = this.f40186b;
        vx0 vx0Var = this.f40185a;
        if (z10 || this.f40187c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = vx0Var.f41176c;
            if (this.f40186b) {
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
            if (!this.f40187c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            vx0Var.f41175b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = vx0Var.h;
            float width = getWidth() + vx0Var.h;
            float height = getHeight();
            float f12 = vx0Var.h;
            if (this.f40187c) {
                i7 = -1;
            }
            rectF.set(f11, f11, width, (f12 * i7) + height);
            vx0Var.f41175b.addRoundRect(rectF, vx0Var.f41176c, Path.Direction.CW);
            canvas2.drawPath(vx0Var.f41175b, vx0Var.d);
            canvas2.drawPath(vx0Var.f41175b, vx0Var.f41177e);
        } else {
            float f13 = vx0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + vx0Var.h, getHeight() + vx0Var.h, vx0Var.d);
            float f14 = vx0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + vx0Var.h, getHeight() + vx0Var.h, vx0Var.f41177e);
        }
        super.onDraw(canvas2);
    }
}
