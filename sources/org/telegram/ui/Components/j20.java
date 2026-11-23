package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class j20 extends TextView {
    public final Paint[] f36235a;
    public final org.telegram.ui.f30 f36236b;

    public j20(org.telegram.ui.f30 f30Var, Context context) {
        super(context);
        this.f36236b = f30Var;
        this.f36235a = new Paint[f30Var.f37353p1.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = this.f36235a;
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
        org.telegram.ui.f30 f30Var = this.f36236b;
        int i10 = f30Var.f37355r1;
        Paint[] paintArr = this.f36235a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[f30Var.f37355r1]);
        float f10 = f30Var.f37354q1;
        if (f10 > 0.0f && (i7 = f30Var.f37355r1 + 1) < paintArr.length) {
            paintArr[i7].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[f30Var.f37355r1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j20.onSizeChanged(int, int, int, int):void");
    }
}
