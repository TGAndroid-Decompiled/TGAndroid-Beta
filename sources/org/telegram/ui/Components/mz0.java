package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mz0 extends FrameLayout {
    public final pz0 f26266a;
    public boolean f26267b;
    public boolean f26268c;
    public boolean d;
    public boolean e;

    public mz0(pz0 pz0Var, View view, boolean z10) {
        super(pz0Var.getContext());
        this.d = false;
        this.e = true;
        this.f26266a = pz0Var;
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
        boolean z10 = this.f26267b;
        pz0 pz0Var = this.f26266a;
        if (z10 || this.f26268c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = pz0Var.f27201c;
            boolean z11 = this.f26267b;
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
            boolean z12 = this.f26268c;
            if (z12 && this.e) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[5] = f11;
            fArr[4] = f11;
            dp = (z12 && this.d) ? 0.0f : 0.0f;
            fArr[7] = dp;
            fArr[6] = dp;
            pz0Var.f27200b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = pz0Var.h;
            float width = getWidth() - pz0Var.h;
            float height = getHeight();
            float f14 = pz0Var.h;
            if (this.f26268c) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            if (!this.e) {
                rectF.right += pz0Var.f27202f;
            }
            pz0Var.f27200b.addRoundRect(rectF, pz0Var.f27201c, Path.Direction.CW);
            canvas2.drawPath(pz0Var.f27200b, pz0Var.e);
        } else {
            float f15 = pz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f15, f15, getWidth() - pz0Var.h, getHeight() + pz0Var.h, pz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
