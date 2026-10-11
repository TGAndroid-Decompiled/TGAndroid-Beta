package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q01 extends FrameLayout {
    public final t01 f29945a;
    public boolean f29946b;
    public boolean f29947c;
    public boolean d;
    public boolean f29948e;

    public q01(t01 t01Var, View view, boolean z10) {
        super(t01Var.getContext());
        this.d = false;
        this.f29948e = true;
        this.f29945a = t01Var;
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
        boolean z10 = this.f29946b;
        t01 t01Var = this.f29945a;
        if (z10 || this.f29947c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = t01Var.f30924c;
            boolean z11 = this.f29946b;
            if (z11 && this.d) {
                f7 = dp;
            } else {
                f7 = 0.0f;
            }
            fArr[1] = f7;
            fArr[0] = f7;
            if (z11 && this.f29948e) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            fArr[2] = f10;
            boolean z12 = this.f29947c;
            if (z12 && this.f29948e) {
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
            t01Var.f30923b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = t01Var.h;
            float width = getWidth() - t01Var.h;
            float height = getHeight();
            float f14 = t01Var.h;
            if (this.f29947c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * f12) + height);
            if (!this.f29948e) {
                rectF.right += t01Var.f30926f;
            }
            t01Var.f30923b.addRoundRect(rectF, t01Var.f30924c, Path.Direction.CW);
            canvas2.drawPath(t01Var.f30923b, t01Var.f30925e);
        } else {
            float f15 = t01Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - t01Var.h, getHeight() + t01Var.h, t01Var.f30925e);
        }
        super.onDraw(canvas2);
    }
}
