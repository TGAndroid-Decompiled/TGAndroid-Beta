package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v01 extends FrameLayout {
    public final x01 f31317a;
    public boolean f31318b;
    public boolean f31319c;
    public boolean d;

    public v01(x01 x01Var, View view, boolean z10) {
        super(x01Var.getContext());
        this.f31317a = x01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.w5.d(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f31319c;
        x01 x01Var = this.f31317a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = x01Var.f32601c;
            boolean z11 = this.f31319c;
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
            x01Var.f32600b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = x01Var.h;
            float width = getWidth() - x01Var.h;
            float height = getHeight();
            float f14 = x01Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            x01Var.f32600b.addRoundRect(rectF, x01Var.f32601c, Path.Direction.CW);
            if (this.f31318b) {
                canvas2.drawPath(x01Var.f32600b, x01Var.d);
            }
            canvas2.drawPath(x01Var.f32600b, x01Var.f32602e);
        } else {
            if (this.f31318b) {
                float f15 = x01Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + x01Var.h, getHeight() + x01Var.h, x01Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = x01Var.h;
            canvas2.drawRect(f16, f16, getWidth() - x01Var.h, getHeight() + x01Var.h, x01Var.f32602e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f31318b = z10;
    }
}
