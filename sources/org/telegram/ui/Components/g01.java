package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g01 extends FrameLayout {
    public final j01 f26430a;
    public boolean f26431b;
    public boolean f26432c;
    public boolean d;
    public boolean e;

    public g01(j01 j01Var, View view, boolean z10) {
        super(j01Var.getContext());
        this.d = false;
        this.e = true;
        this.f26430a = j01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.z5.d(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f26431b;
        j01 j01Var = this.f26430a;
        if (z10 || this.f26432c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = j01Var.f27388c;
            boolean z11 = this.f26431b;
            if (z11 && this.d) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11 && this.e) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f26432c;
            if (z12 && this.e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            if (!z12 || !this.d) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            j01Var.f27387b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = j01Var.h;
            float width = getWidth() - j01Var.h;
            float height = getHeight();
            float f14 = j01Var.h;
            if (this.f26432c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            if (!this.e) {
                rectF.right += j01Var.f27389f;
            }
            j01Var.f27387b.addRoundRect(rectF, j01Var.f27388c, Path.Direction.CW);
            canvas2.drawPath(j01Var.f27387b, j01Var.e);
        } else {
            float f15 = j01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - j01Var.h, getHeight() + j01Var.h, j01Var.e);
        }
        super.onDraw(canvas2);
    }
}
