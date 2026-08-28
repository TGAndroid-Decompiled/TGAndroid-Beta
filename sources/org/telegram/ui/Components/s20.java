package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s20 extends TextView {
    public final Paint[] f32340a;
    public final v20 f32341b;

    public s20(v20 v20Var, Context context) {
        super(context);
        this.f32341b = v20Var;
        this.f32340a = new Paint[v20Var.f33241e.length];
        int i9 = 0;
        while (true) {
            Paint[] paintArr = this.f32340a;
            if (i9 < paintArr.length) {
                paintArr[i9] = new Paint(1);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        v20 v20Var = this.f32341b;
        int i9 = v20Var.h;
        Paint[] paintArr = this.f32340a;
        paintArr[i9].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v20Var.h]);
        float f10 = v20Var.f33242f;
        if (f10 > 0.0f) {
            int i10 = v20Var.h;
            if (i10 + 1 < paintArr.length) {
                paintArr[i10 + 1].setAlpha((int) (f10 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v20Var.h + 1]);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s20.onSizeChanged(int, int, int, int):void");
    }
}
