package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j30 extends TextView {
    public final Paint[] f25860a;
    public final m30 f25861b;

    public j30(m30 m30Var, Context context) {
        super(context);
        this.f25861b = m30Var;
        this.f25860a = new Paint[m30Var.e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f25860a;
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
        m30 m30Var = this.f25861b;
        int i10 = m30Var.h;
        Paint[] paintArr = this.f25860a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[m30Var.h]);
        float f10 = m30Var.f26932f;
        if (f10 > 0.0f) {
            int i11 = m30Var.h;
            if (i11 + 1 < paintArr.length) {
                paintArr[i11 + 1].setAlpha((int) (f10 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[m30Var.h + 1]);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j30.onSizeChanged(int, int, int, int):void");
    }
}
