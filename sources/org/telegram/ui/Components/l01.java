package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l01 extends FrameLayout {
    public final n01 f28125a;
    public boolean f28126b;
    public boolean f28127c;
    public boolean d;

    public l01(n01 n01Var, View view, boolean z10) {
        super(n01Var.getContext());
        this.f28125a = n01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.z5.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f28127c;
        n01 n01Var = this.f28125a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = n01Var.f28747c;
            boolean z11 = this.f28127c;
            if (z11) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.d;
            if (z12) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            n01Var.f28746b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = n01Var.h;
            float width = getWidth() - n01Var.h;
            float height = getHeight();
            float f14 = n01Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            n01Var.f28746b.addRoundRect(rectF, n01Var.f28747c, Path.Direction.CW);
            if (this.f28126b) {
                canvas2.drawPath(n01Var.f28746b, n01Var.d);
            }
            canvas2.drawPath(n01Var.f28746b, n01Var.e);
        } else {
            if (this.f28126b) {
                float f15 = n01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + n01Var.h, getHeight() + n01Var.h, n01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = n01Var.h;
            canvas2.drawRect(f16, f16, getWidth() - n01Var.h, getHeight() + n01Var.h, n01Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f28126b = z10;
    }
}
