package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c40 extends TextView {
    public final Paint[] f24805a;
    public final org.telegram.ui.h50 f24806b;

    public c40(org.telegram.ui.h50 h50Var, Context context) {
        super(context);
        this.f24806b = h50Var;
        this.f24805a = new Paint[h50Var.f25885e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f24805a;
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
        org.telegram.ui.h50 h50Var = this.f24806b;
        int i11 = h50Var.h;
        Paint[] paintArr = this.f24805a;
        paintArr[i11].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[h50Var.h]);
        float f7 = h50Var.f25886f;
        if (f7 > 0.0f && (i10 = h50Var.h + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[h50Var.h + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c40.onSizeChanged(int, int, int, int):void");
    }
}
