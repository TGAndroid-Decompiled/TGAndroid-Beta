package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m30 extends TextView {
    public final Paint[] f28511a;
    public final p30 f28512b;

    public m30(p30 p30Var, Context context) {
        super(context);
        this.f28512b = p30Var;
        this.f28511a = new Paint[p30Var.f29494e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f28511a;
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
        p30 p30Var = this.f28512b;
        int i10 = p30Var.h;
        Paint[] paintArr = this.f28511a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[p30Var.h]);
        float f7 = p30Var.f29495f;
        if (f7 > 0.0f) {
            int i11 = p30Var.h;
            if (i11 + 1 < paintArr.length) {
                paintArr[i11 + 1].setAlpha((int) (f7 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[p30Var.h + 1]);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m30.onSizeChanged(int, int, int, int):void");
    }
}
