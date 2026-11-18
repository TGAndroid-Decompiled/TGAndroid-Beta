package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class i20 extends TextView {
    public final Paint[] f36029a;
    public final org.telegram.ui.g30 f36030b;

    public i20(org.telegram.ui.g30 g30Var, Context context) {
        super(context);
        this.f36030b = g30Var;
        this.f36029a = new Paint[g30Var.f36986p1.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = this.f36029a;
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
        org.telegram.ui.g30 g30Var = this.f36030b;
        int i10 = g30Var.f36988r1;
        Paint[] paintArr = this.f36029a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[g30Var.f36988r1]);
        float f10 = g30Var.f36987q1;
        if (f10 > 0.0f && (i7 = g30Var.f36988r1 + 1) < paintArr.length) {
            paintArr[i7].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[g30Var.f36988r1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i20.onSizeChanged(int, int, int, int):void");
    }
}
