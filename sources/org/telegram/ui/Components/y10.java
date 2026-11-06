package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class y10 extends TextView {
    public final Paint[] f40463a;
    public final org.telegram.ui.c30 f40464b;

    public y10(org.telegram.ui.c30 c30Var, Context context) {
        super(context);
        this.f40464b = c30Var;
        this.f40463a = new Paint[c30Var.l1.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = this.f40463a;
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
        org.telegram.ui.c30 c30Var = this.f40464b;
        int i10 = c30Var.n1;
        Paint[] paintArr = this.f40463a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[c30Var.n1]);
        float f10 = c30Var.f31984m1;
        if (f10 > 0.0f && (i7 = c30Var.n1 + 1) < paintArr.length) {
            paintArr[i7].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[c30Var.n1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y10.onSizeChanged(int, int, int, int):void");
    }
}
