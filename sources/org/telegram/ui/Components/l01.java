package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l01 extends FrameLayout {
    public final o01 f28191a;
    public boolean f28192b;
    public boolean f28193c;
    public boolean d;
    public boolean e;

    public l01(o01 o01Var, View view, boolean z10) {
        super(o01Var.getContext());
        this.d = false;
        this.e = true;
        this.f28191a = o01Var;
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
        boolean z10 = this.f28192b;
        o01 o01Var = this.f28191a;
        if (z10 || this.f28193c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = o01Var.f29056c;
            boolean z11 = this.f28192b;
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
            boolean z12 = this.f28193c;
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
            o01Var.f29055b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = o01Var.h;
            float width = getWidth() - o01Var.h;
            float height = getHeight();
            float f14 = o01Var.h;
            if (this.f28193c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            if (!this.e) {
                rectF.right += o01Var.f29057f;
            }
            o01Var.f29055b.addRoundRect(rectF, o01Var.f29056c, Path.Direction.CW);
            canvas2.drawPath(o01Var.f29055b, o01Var.e);
        } else {
            float f15 = o01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - o01Var.h, getHeight() + o01Var.h, o01Var.e);
        }
        super.onDraw(canvas2);
    }
}
