package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t30 extends TextView {
    public final Paint[] f32819a;
    public final org.telegram.ui.u40 f32820b;

    public t30(org.telegram.ui.u40 u40Var, Context context) {
        super(context);
        this.f32820b = u40Var;
        this.f32819a = new Paint[u40Var.e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f32819a;
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
        org.telegram.ui.u40 u40Var = this.f32820b;
        int i11 = u40Var.h;
        Paint[] paintArr = this.f32819a;
        paintArr[i11].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[u40Var.h]);
        float f7 = u40Var.f34351f;
        if (f7 > 0.0f && (i10 = u40Var.h + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[u40Var.h + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t30.onSizeChanged(int, int, int, int):void");
    }
}
