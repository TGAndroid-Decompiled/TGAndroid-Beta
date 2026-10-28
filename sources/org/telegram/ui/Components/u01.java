package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u01 extends FrameLayout {
    public final x01 f33184a;
    public boolean f33185b;
    public boolean f33186c;
    public boolean d;
    public boolean e;

    public u01(x01 x01Var, View view, boolean z10) {
        super(x01Var.getContext());
        this.d = false;
        this.e = true;
        this.f33184a = x01Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, kb1.g(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f33185b;
        x01 x01Var = this.f33184a;
        if (z10 || this.f33186c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = x01Var.f34629c;
            boolean z11 = this.f33185b;
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
            boolean z12 = this.f33186c;
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
            x01Var.f34628b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = x01Var.h;
            float width = getWidth() - x01Var.h;
            float height = getHeight();
            float f14 = x01Var.h;
            if (this.f33186c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            if (!this.e) {
                rectF.right += x01Var.f34630f;
            }
            x01Var.f34628b.addRoundRect(rectF, x01Var.f34629c, Path.Direction.CW);
            canvas2.drawPath(x01Var.f34628b, x01Var.e);
        } else {
            float f15 = x01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - x01Var.h, getHeight() + x01Var.h, x01Var.e);
        }
        super.onDraw(canvas2);
    }
}
