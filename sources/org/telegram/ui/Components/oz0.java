package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class oz0 extends FrameLayout {
    public final qz0 f26899a;
    public boolean f26900b;
    public boolean f26901c;
    public boolean d;

    public oz0(qz0 qz0Var, View view, boolean z10) {
        super(qz0Var.getContext());
        this.f26899a = qz0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.x5.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f26901c;
        qz0 qz0Var = this.f26899a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = qz0Var.f27467c;
            boolean z11 = this.f26901c;
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
            qz0Var.f27466b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = qz0Var.h;
            float width = getWidth() - qz0Var.h;
            float height = getHeight();
            float f14 = qz0Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            qz0Var.f27466b.addRoundRect(rectF, qz0Var.f27467c, Path.Direction.CW);
            if (this.f26900b) {
                canvas2.drawPath(qz0Var.f27466b, qz0Var.d);
            }
            canvas2.drawPath(qz0Var.f27466b, qz0Var.e);
        } else {
            if (this.f26900b) {
                float f15 = qz0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + qz0Var.h, getHeight() + qz0Var.h, qz0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = qz0Var.h;
            canvas2.drawRect(f16, f16, getWidth() - qz0Var.h, getHeight() + qz0Var.h, qz0Var.e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f26900b = z10;
    }
}
