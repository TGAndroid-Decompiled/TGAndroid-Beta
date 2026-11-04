package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class u10 extends TextView {
    public final Paint[] f38609a;
    public final org.telegram.ui.x20 f38610b;

    public u10(org.telegram.ui.x20 x20Var, Context context) {
        super(context);
        this.f38610b = x20Var;
        this.f38609a = new Paint[x20Var.m1.length];
        int i3 = 0;
        while (true) {
            Paint[] paintArr = this.f38609a;
            if (i3 < paintArr.length) {
                paintArr[i3] = new Paint(1);
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        org.telegram.ui.x20 x20Var = this.f38610b;
        int i10 = x20Var.f40195o1;
        Paint[] paintArr = this.f38609a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[x20Var.f40195o1]);
        float f10 = x20Var.f40194n1;
        if (f10 > 0.0f && (i3 = x20Var.f40195o1 + 1) < paintArr.length) {
            paintArr[i3].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[x20Var.f40195o1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u10.onSizeChanged(int, int, int, int):void");
    }
}
