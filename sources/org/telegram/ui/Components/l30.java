package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l30 extends TextView {
    public final Paint[] f28582a;
    public final o30 f28583b;

    public l30(o30 o30Var, Context context) {
        super(context);
        this.f28583b = o30Var;
        this.f28582a = new Paint[o30Var.f29662e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f28582a;
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
        o30 o30Var = this.f28583b;
        int i10 = o30Var.h;
        Paint[] paintArr = this.f28582a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[o30Var.h]);
        float f10 = o30Var.f29663f;
        if (f10 > 0.0f) {
            int i11 = o30Var.h;
            if (i11 + 1 < paintArr.length) {
                paintArr[i11 + 1].setAlpha((int) (f10 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[o30Var.h + 1]);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l30.onSizeChanged(int, int, int, int):void");
    }
}
