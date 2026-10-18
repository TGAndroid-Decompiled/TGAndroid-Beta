package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r30 extends TextView {
    public final Paint[] f29808a;
    public final org.telegram.ui.r40 f29809b;

    public r30(org.telegram.ui.r40 r40Var, Context context) {
        super(context);
        this.f29809b = r40Var;
        this.f29808a = new Paint[r40Var.e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f29808a;
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
        org.telegram.ui.r40 r40Var = this.f29809b;
        int i11 = r40Var.h;
        Paint[] paintArr = this.f29808a;
        paintArr[i11].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[r40Var.h]);
        float f7 = r40Var.f30872f;
        if (f7 > 0.0f && (i10 = r40Var.h + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[r40Var.h + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r30.onSizeChanged(int, int, int, int):void");
    }
}
