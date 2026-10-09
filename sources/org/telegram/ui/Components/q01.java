package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class q01 extends TextView {
    public final r01 f29982a;
    public boolean f29983b;
    public boolean f29984c;

    public q01(r01 r01Var, CharSequence charSequence) {
        super(r01Var.getContext());
        this.f29982a = r01Var;
        org.telegram.ui.ActionBar.e6 e6Var = r01Var.f30325a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        boolean z10 = this.f29983b;
        r01 r01Var = this.f29982a;
        if (z10 || this.f29984c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = r01Var.f30327c;
            if (this.f29983b) {
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
            if (!this.f29984c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            r01Var.f30326b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f10 = r01Var.h;
            float width = getWidth() + r01Var.h;
            float height = getHeight();
            float f11 = r01Var.h;
            if (this.f29984c) {
                i10 = -1;
            }
            rectF.set(f10, f10, width, (f11 * i10) + height);
            r01Var.f30326b.addRoundRect(rectF, r01Var.f30327c, Path.Direction.CW);
            canvas2.drawPath(r01Var.f30326b, r01Var.d);
            canvas2.drawPath(r01Var.f30326b, r01Var.f30328e);
        } else {
            float f12 = r01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f12, f12, getWidth() + r01Var.h, getHeight() + r01Var.h, r01Var.d);
            float f13 = r01Var.h;
            canvas2.drawRect(f13, f13, getWidth() + r01Var.h, getHeight() + r01Var.h, r01Var.f30328e);
        }
        super.onDraw(canvas2);
    }
}
