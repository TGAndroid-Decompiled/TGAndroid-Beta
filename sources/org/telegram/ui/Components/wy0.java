package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class wy0 extends FrameLayout {

    public final yy0 f34375a;

    public boolean f34376b;

    public boolean f34377c;
    public boolean d;

    public wy0(yy0 yy0Var, View view, boolean z10) {
        super(yy0Var.getContext());
        this.f34375a = yy0Var;
        setWillNotDraw(false);
        if (!z10) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, h7.z5.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10 = this.f34377c;
        yy0 yy0Var = this.f34375a;
        if (z10 || this.d) {
            canvas2 = canvas;
            float fDp = AndroidUtilities.dp(10.0f);
            float[] fArr = yy0Var.f35064c;
            boolean z11 = this.f34377c;
            float f10 = z11 ? fDp : 0.0f;
            fArr[1] = f10;
            fArr[0] = f10;
            float f11 = z11 ? fDp : 0.0f;
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z12 = this.d;
            float f12 = z12 ? fDp : 0.0f;
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z12) {
                fDp = 0.0f;
            }
            fArr[7] = fDp;
            fArr[6] = fDp;
            yy0Var.f35063b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f13 = yy0Var.h;
            rectF.set(f13, f13, getWidth() - yy0Var.h, (yy0Var.h * AndroidUtilities.dp(this.d ? -1.0f : 1.0f)) + getHeight());
            yy0Var.f35063b.addRoundRect(rectF, yy0Var.f35064c, Path.Direction.CW);
            if (this.f34376b) {
                canvas2.drawPath(yy0Var.f35063b, yy0Var.d);
            }
            canvas2.drawPath(yy0Var.f35063b, yy0Var.f35065e);
        } else {
            if (this.f34376b) {
                float f14 = yy0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f14, f14, getWidth() + yy0Var.h, getHeight() + yy0Var.h, yy0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f15 = yy0Var.h;
            canvas2.drawRect(f15, f15, getWidth() - yy0Var.h, getHeight() + yy0Var.h, yy0Var.f35065e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z10) {
        this.f34376b = z10;
    }
}
