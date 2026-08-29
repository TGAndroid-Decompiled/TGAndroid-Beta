package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class f30 extends TextView {
    public final Paint[] f28300a;
    public final i30 f28301b;

    public f30(i30 i30Var, Context context) {
        super(context);
        this.f28301b = i30Var;
        this.f28300a = new Paint[i30Var.f29308e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f28300a;
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
        i30 i30Var = this.f28301b;
        int i10 = i30Var.h;
        Paint[] paintArr = this.f28300a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[i30Var.h]);
        float f9 = i30Var.f29309f;
        if (f9 > 0.0f) {
            int i11 = i30Var.h;
            if (i11 + 1 < paintArr.length) {
                paintArr[i11 + 1].setAlpha((int) (f9 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[i30Var.h + 1]);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f30.onSizeChanged(int, int, int, int):void");
    }
}
