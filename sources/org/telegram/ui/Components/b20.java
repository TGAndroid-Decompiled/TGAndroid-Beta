package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class b20 extends TextView {
    public final Paint[] f33153a;
    public final org.telegram.ui.d30 f33154b;

    public b20(org.telegram.ui.d30 d30Var, Context context) {
        super(context);
        this.f33154b = d30Var;
        this.f33153a = new Paint[d30Var.f34154p1.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = this.f33153a;
            if (i7 < paintArr.length) {
                paintArr[i7] = new Paint(1);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        org.telegram.ui.d30 d30Var = this.f33154b;
        int i10 = d30Var.f34156r1;
        Paint[] paintArr = this.f33153a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[d30Var.f34156r1]);
        float f10 = d30Var.f34155q1;
        if (f10 > 0.0f && (i7 = d30Var.f34156r1 + 1) < paintArr.length) {
            paintArr[i7].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[d30Var.f34156r1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b20.onSizeChanged(int, int, int, int):void");
    }
}
