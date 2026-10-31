package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class p20 extends TextView {
    public final Paint[] f29269a;
    public final org.telegram.ui.b40 f29270b;

    public p20(org.telegram.ui.b40 b40Var, Context context) {
        super(context);
        this.f29270b = b40Var;
        this.f29269a = new Paint[b40Var.l1.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f29269a;
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
        org.telegram.ui.b40 b40Var = this.f29270b;
        int i11 = b40Var.f29807n1;
        Paint[] paintArr = this.f29269a;
        paintArr[i11].setAlpha(255);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paintArr[b40Var.f29807n1]);
        float f7 = b40Var.f29806m1;
        if (f7 > 0.0f && (i10 = b40Var.f29807n1 + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paintArr[b40Var.f29807n1 + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p20.onSizeChanged(int, int, int, int):void");
    }
}
