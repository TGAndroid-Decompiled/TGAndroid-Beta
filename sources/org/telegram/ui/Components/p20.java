package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class p20 extends TextView {
    public final Paint[] f29319a;
    public final org.telegram.ui.a40 f29320b;

    public p20(org.telegram.ui.a40 a40Var, Context context) {
        super(context);
        this.f29320b = a40Var;
        this.f29319a = new Paint[a40Var.l1.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f29319a;
            if (i10 < paintArr.length) {
                paintArr[i10] = new Paint(1);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        org.telegram.ui.a40 a40Var = this.f29320b;
        int i11 = a40Var.f29863n1;
        Paint[] paintArr = this.f29319a;
        paintArr[i11].setAlpha(255);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paintArr[a40Var.f29863n1]);
        float f7 = a40Var.f29862m1;
        if (f7 > 0.0f && (i10 = a40Var.f29863n1 + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paintArr[a40Var.f29863n1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p20.onSizeChanged(int, int, int, int):void");
    }
}
