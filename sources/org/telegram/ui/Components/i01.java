package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class i01 extends FrameLayout {
    public final l01 f27351a;
    public boolean f27352b;
    public boolean f27353c;
    public boolean d;
    public boolean f27354e;

    public i01(l01 l01Var, View view, boolean z10) {
        super(l01Var.getContext());
        this.d = false;
        this.f27354e = true;
        this.f27351a = l01Var;
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
        boolean z10 = this.f27352b;
        l01 l01Var = this.f27351a;
        if (z10 || this.f27353c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = l01Var.f28337c;
            boolean z11 = this.f27352b;
            if (z11 && this.d) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11 && this.f27354e) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f27353c;
            if (z12 && this.f27354e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            dp = (z12 && this.d) ? 0.0f : 0.0f;
            fArr[7] = dp;
            fArr[6] = dp;
            l01Var.f28336b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = l01Var.h;
            float width = getWidth() - l01Var.h;
            float height = getHeight();
            float f14 = l01Var.h;
            if (this.f27353c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            if (!this.f27354e) {
                rectF.right += l01Var.f28339f;
            }
            l01Var.f28336b.addRoundRect(rectF, l01Var.f28337c, Path.Direction.CW);
            canvas2.drawPath(l01Var.f28336b, l01Var.f28338e);
        } else {
            float f15 = l01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - l01Var.h, getHeight() + l01Var.h, l01Var.f28338e);
        }
        super.onDraw(canvas2);
    }
}
