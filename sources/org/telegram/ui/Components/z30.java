package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z30 extends TextView {
    public final Paint[] f33452a;
    public final org.telegram.ui.f50 f33453b;

    public z30(org.telegram.ui.f50 f50Var, Context context) {
        super(context);
        this.f33453b = f50Var;
        this.f33452a = new Paint[f50Var.f25232e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f33452a;
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
        org.telegram.ui.f50 f50Var = this.f33453b;
        int i11 = f50Var.h;
        Paint[] paintArr = this.f33452a;
        paintArr[i11].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[f50Var.h]);
        float f7 = f50Var.f25233f;
        if (f7 > 0.0f && (i10 = f50Var.h + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[f50Var.h + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z30.onSizeChanged(int, int, int, int):void");
    }
}
