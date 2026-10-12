package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v30 extends TextView {
    public final Paint[] f29872a;
    public final org.telegram.ui.m50 f29873b;

    public v30(org.telegram.ui.m50 m50Var, Context context) {
        super(context);
        this.f29873b = m50Var;
        this.f29872a = new Paint[m50Var.e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f29872a;
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
        org.telegram.ui.m50 m50Var = this.f29873b;
        int i11 = m50Var.h;
        Paint[] paintArr = this.f29872a;
        paintArr[i11].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[m50Var.h]);
        float f7 = m50Var.f31468f;
        if (f7 > 0.0f && (i10 = m50Var.h + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[m50Var.h + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v30.onSizeChanged(int, int, int, int):void");
    }
}
