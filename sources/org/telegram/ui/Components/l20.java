package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class l20 extends TextView {
    public final Paint[] f37070a;
    public final org.telegram.ui.g30 f37071b;

    public l20(org.telegram.ui.g30 g30Var, Context context) {
        super(context);
        this.f37071b = g30Var;
        this.f37070a = new Paint[g30Var.f38070p1.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = this.f37070a;
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
        org.telegram.ui.g30 g30Var = this.f37071b;
        int i10 = g30Var.f38072r1;
        Paint[] paintArr = this.f37070a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[g30Var.f38072r1]);
        float f10 = g30Var.f38071q1;
        if (f10 > 0.0f && (i7 = g30Var.f38072r1 + 1) < paintArr.length) {
            paintArr[i7].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[g30Var.f38072r1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l20.onSizeChanged(int, int, int, int):void");
    }
}
