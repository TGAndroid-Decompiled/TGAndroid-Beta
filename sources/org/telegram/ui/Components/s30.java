package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s30 extends TextView {
    public final Paint[] f26928a;
    public final v30 f26929b;

    public s30(v30 v30Var, Context context) {
        super(context);
        this.f26929b = v30Var;
        this.f26928a = new Paint[v30Var.e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f26928a;
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
        v30 v30Var = this.f26929b;
        int i10 = v30Var.h;
        Paint[] paintArr = this.f26928a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v30Var.h]);
        float f7 = v30Var.f27808f;
        if (f7 > 0.0f) {
            int i11 = v30Var.h;
            if (i11 + 1 < paintArr.length) {
                paintArr[i11 + 1].setAlpha((int) (f7 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v30Var.h + 1]);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s30.onSizeChanged(int, int, int, int):void");
    }
}
