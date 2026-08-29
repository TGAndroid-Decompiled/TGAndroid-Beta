package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fz0 extends FrameLayout {
    public final hz0 f28660a;
    public boolean f28661b;
    public boolean f28662c;
    public boolean d;

    public fz0(hz0 hz0Var, View view, boolean z10) {
        super(hz0Var.getContext());
        this.f28660a = hz0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, i7.f6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f9;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.f28662c;
        hz0 hz0Var = this.f28660a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = hz0Var.f29283c;
            boolean z11 = this.f28662c;
            if (z11) {
                f9 = dp;
            } else {
                f9 = 0.0f;
            }
            fArr[1] = f9;
            fArr[0] = f9;
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
            hz0Var.f29282b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = hz0Var.h;
            float width = getWidth() - hz0Var.h;
            float height = getHeight();
            float f14 = hz0Var.h;
            if (this.d) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            rectF.set(f13, f13, width, (f14 * AndroidUtilities.dp(f12)) + height);
            hz0Var.f29282b.addRoundRect(rectF, hz0Var.f29283c, Path.Direction.CW);
            if (this.f28661b) {
                canvas2.drawPath(hz0Var.f29282b, hz0Var.d);
            }
            canvas2.drawPath(hz0Var.f29282b, hz0Var.f29284e);
        } else {
            if (this.f28661b) {
                float f15 = hz0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f15, f15, getWidth() + hz0Var.h, getHeight() + hz0Var.h, hz0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f16 = hz0Var.h;
            canvas2.drawRect(f16, f16, getWidth() - hz0Var.h, getHeight() + hz0Var.h, hz0Var.f29284e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f28661b = z10;
    }
}
