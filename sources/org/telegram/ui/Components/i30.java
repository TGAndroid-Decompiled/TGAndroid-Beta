package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class i30 extends TextView {
    public final Paint[] f26979a;
    public final l30 f26980b;

    public i30(l30 l30Var, Context context) {
        super(context);
        this.f26980b = l30Var;
        this.f26979a = new Paint[l30Var.f28065e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f26979a;
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
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        l30 l30Var = this.f26980b;
        int i10 = l30Var.h;
        Paint[] paintArr = this.f26979a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[l30Var.h]);
        float f7 = l30Var.f28066f;
        if (f7 > 0.0f) {
            int i11 = l30Var.h;
            if (i11 + 1 < paintArr.length) {
                paintArr[i11 + 1].setAlpha((int) (f7 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[l30Var.h + 1]);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i30.onSizeChanged(int, int, int, int):void");
    }
}
