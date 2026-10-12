package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w01 extends TextView {
    public final x01 f32231a;
    public boolean f32232b;
    public boolean f32233c;

    public w01(x01 x01Var, CharSequence charSequence) {
        super(x01Var.getContext());
        this.f32231a = x01Var;
        org.telegram.ui.ActionBar.c6 c6Var = x01Var.f32599a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        boolean z10 = this.f32232b;
        x01 x01Var = this.f32231a;
        if (z10 || this.f32233c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = x01Var.f32601c;
            if (this.f32232b) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            int i10 = 1;
            fArr[1] = f7;
            fArr[0] = f7;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f32233c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            x01Var.f32600b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = x01Var.h;
            float width = getWidth() + x01Var.h;
            float height = getHeight();
            float f11 = x01Var.h;
            if (this.f32233c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            x01Var.f32600b.addRoundRect(rectF, x01Var.f32601c, Path.Direction.CW);
            canvas2.drawPath(x01Var.f32600b, x01Var.d);
            canvas2.drawPath(x01Var.f32600b, x01Var.f32602e);
        } else {
            float f12 = x01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + x01Var.h, getHeight() + x01Var.h, x01Var.d);
            float f13 = x01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + x01Var.h, getHeight() + x01Var.h, x01Var.f32602e);
        }
        super.onDraw(canvas2);
    }
}
