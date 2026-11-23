package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
public final class cy0 extends TextView {
    public final dy0 f34164a;
    public boolean f34165b;
    public boolean f34166c;

    public cy0(dy0 dy0Var, CharSequence charSequence) {
        super(dy0Var.getContext());
        this.f34164a = dy0Var;
        org.telegram.ui.ActionBar.i6 i6Var = dy0Var.f34491a;
        setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
        org.telegram.ui.ActionBar.u6.U(this, org.telegram.ui.ActionBar.n6.G6, i6Var);
        setTypeface(org.telegram.messenger.g0.o());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        boolean z10 = this.f34165b;
        dy0 dy0Var = this.f34164a;
        if (z10 || this.f34166c) {
            canvas2 = canvas;
            float L = org.telegram.messenger.g0.L(10.0f);
            float[] fArr = dy0Var.f34493c;
            if (this.f34165b) {
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
            if (!this.f34166c) {
                L = 0.0f;
            }
            fArr[7] = L;
            fArr[6] = L;
            dy0Var.f34492b.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            float f11 = dy0Var.h;
            float width = getWidth() + dy0Var.h;
            float height = getHeight();
            float f12 = dy0Var.h;
            if (this.f34166c) {
                i7 = -1;
            }
            rectF.set(f11, f11, width, (f12 * i7) + height);
            dy0Var.f34492b.addRoundRect(rectF, dy0Var.f34493c, Path.Direction.CW);
            canvas2.drawPath(dy0Var.f34492b, dy0Var.d);
            canvas2.drawPath(dy0Var.f34492b, dy0Var.f34494e);
        } else {
            float f13 = dy0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f13, f13, getWidth() + dy0Var.h, getHeight() + dy0Var.h, dy0Var.d);
            float f14 = dy0Var.h;
            canvas2.drawRect(f14, f14, getWidth() + dy0Var.h, getHeight() + dy0Var.h, dy0Var.f34494e);
        }
        super.onDraw(canvas2);
    }
}
