package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class z10 extends TextView {
    public final Paint[] f40864a;
    public final org.telegram.ui.e30 f40865b;

    public z10(org.telegram.ui.e30 e30Var, Context context) {
        super(context);
        this.f40865b = e30Var;
        this.f40864a = new Paint[e30Var.l1.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = this.f40864a;
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
        org.telegram.ui.e30 e30Var = this.f40865b;
        int i10 = e30Var.n1;
        Paint[] paintArr = this.f40864a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[e30Var.n1]);
        float f10 = e30Var.f32500m1;
        if (f10 > 0.0f && (i7 = e30Var.n1 + 1) < paintArr.length) {
            paintArr[i7].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[e30Var.n1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z10.onSizeChanged(int, int, int, int):void");
    }
}
