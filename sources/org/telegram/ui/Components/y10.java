package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class y10 extends TextView {
    public final Paint[] f40459a;
    public final org.telegram.ui.f30 f40460b;

    public y10(org.telegram.ui.f30 f30Var, Context context) {
        super(context);
        this.f40460b = f30Var;
        this.f40459a = new Paint[f30Var.f32090o1.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = this.f40459a;
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
        org.telegram.ui.f30 f30Var = this.f40460b;
        int i10 = f30Var.f32092q1;
        Paint[] paintArr = this.f40459a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[f30Var.f32092q1]);
        float f10 = f30Var.f32091p1;
        if (f10 > 0.0f && (i7 = f30Var.f32092q1 + 1) < paintArr.length) {
            paintArr[i7].setAlpha((int) (f10 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paintArr[f30Var.f32092q1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y10.onSizeChanged(int, int, int, int):void");
    }
}
