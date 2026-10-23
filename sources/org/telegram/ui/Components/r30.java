package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r30 extends TextView {
    public final Paint[] f30060a;
    public final org.telegram.ui.s40 f30061b;

    public r30(org.telegram.ui.s40 s40Var, Context context) {
        super(context);
        this.f30061b = s40Var;
        this.f30060a = new Paint[s40Var.e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f30060a;
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
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        org.telegram.ui.s40 s40Var = this.f30061b;
        int i11 = s40Var.h;
        Paint[] paintArr = this.f30060a;
        paintArr[i11].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[s40Var.h]);
        float f7 = s40Var.f31071f;
        if (f7 > 0.0f && (i10 = s40Var.h + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[s40Var.h + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r30.onSizeChanged(int, int, int, int):void");
    }
}
