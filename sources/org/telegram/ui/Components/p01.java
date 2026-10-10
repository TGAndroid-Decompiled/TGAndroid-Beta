package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p01 extends FrameLayout {
    public final s01 f29634a;
    public boolean f29635b;
    public boolean f29636c;
    public boolean d;
    public boolean f29637e;

    public p01(s01 s01Var, View view, boolean z10) {
        super(s01Var.getContext());
        this.d = false;
        this.f29637e = true;
        this.f29634a = s01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, w7.x5.d(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f29635b;
        s01 s01Var = this.f29634a;
        if (z10 || this.f29636c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = s01Var.f30628c;
            boolean z11 = this.f29635b;
            if (z11 && this.d) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11 && this.f29637e) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f29636c;
            if (z12 && this.f29637e) {
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
            s01Var.f30627b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = s01Var.h;
            float width = getWidth() - s01Var.h;
            float height = getHeight();
            float f14 = s01Var.h;
            if (this.f29636c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            if (!this.f29637e) {
                rectF.right += s01Var.f30630f;
            }
            s01Var.f30627b.addRoundRect(rectF, s01Var.f30628c, Path.Direction.CW);
            canvas2.drawPath(s01Var.f30627b, s01Var.f30629e);
        } else {
            float f15 = s01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - s01Var.h, getHeight() + s01Var.h, s01Var.f30629e);
        }
        super.onDraw(canvas2);
    }
}
