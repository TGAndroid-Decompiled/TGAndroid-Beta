package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class k30 extends TextView {
    public final Paint[] f25609a;
    public final n30 f25610b;

    public k30(n30 n30Var, Context context) {
        super(context);
        this.f25610b = n30Var;
        this.f25609a = new Paint[n30Var.e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f25609a;
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
        n30 n30Var = this.f25610b;
        int i10 = n30Var.h;
        Paint[] paintArr = this.f25609a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[n30Var.h]);
        float f7 = n30Var.f26659f;
        if (f7 > 0.0f) {
            int i11 = n30Var.h;
            if (i11 + 1 < paintArr.length) {
                paintArr[i11 + 1].setAlpha((int) (f7 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[n30Var.h + 1]);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k30.onSizeChanged(int, int, int, int):void");
    }
}
