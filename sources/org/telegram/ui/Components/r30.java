package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r30 extends TextView {
    public final Paint[] f29798a;
    public final org.telegram.ui.p40 f29799b;

    public r30(org.telegram.ui.p40 p40Var, Context context) {
        super(context);
        this.f29799b = p40Var;
        this.f29798a = new Paint[p40Var.e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f29798a;
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
        org.telegram.ui.p40 p40Var = this.f29799b;
        int i11 = p40Var.h;
        Paint[] paintArr = this.f29798a;
        paintArr[i11].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[p40Var.h]);
        float f7 = p40Var.f30833f;
        if (f7 > 0.0f && (i10 = p40Var.h + 1) < paintArr.length) {
            paintArr[i10].setAlpha((int) (f7 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[p40Var.h + 1]);
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r30.onSizeChanged(int, int, int, int):void");
    }
}
