package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class w20 extends TextView {

    public final Paint[] f34096a;

    public final z20 f34097b;

    public w20(z20 z20Var, Context context) {
        super(context);
        this.f34097b = z20Var;
        this.f34096a = new Paint[z20Var.f35137e.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f34096a;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        z20 z20Var = this.f34097b;
        int i10 = z20Var.h;
        Paint[] paintArr = this.f34096a;
        paintArr[i10].setAlpha(255);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[z20Var.h]);
        float f10 = z20Var.f35138f;
        if (f10 > 0.0f) {
            int i11 = z20Var.h;
            if (i11 + 1 < paintArr.length) {
                paintArr[i11 + 1].setAlpha((int) (f10 * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[z20Var.h + 1]);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        LinearGradient linearGradient;
        super.onSizeChanged(i10, i11, i12, i13);
        int i16 = 0;
        while (true) {
            Paint[] paintArr = this.f34096a;
            if (i16 >= paintArr.length) {
                return;
            }
            int i17 = -9015575;
            if (i16 == 0) {
                i17 = -11033346;
                i14 = -9015575;
            } else {
                if (i16 == 1) {
                    i17 = -8919716;
                    i14 = -11089922;
                } else {
                    i14 = -1026983;
                    i15 = -1792170;
                }
                if (i15 != 0) {
                    linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i17, i14, i15}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i17, i14}, (float[]) null, Shader.TileMode.CLAMP);
                }
                paintArr[i16].setShader(linearGradient);
                i16++;
            }
            i15 = 0;
            if (i15 != 0) {
                linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i17, i14, i15}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i17, i14}, (float[]) null, Shader.TileMode.CLAMP);
            }
            paintArr[i16].setShader(linearGradient);
            i16++;
        }
    }
}
