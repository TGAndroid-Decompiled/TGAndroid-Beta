package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qz0 extends FrameLayout {
    public final sz0 f30570a;
    public boolean f30571b;
    public boolean f30572c;
    public boolean d;

    public qz0(sz0 sz0Var, View view, boolean z4) {
        super(sz0Var.getContext());
        this.f30570a = sz0Var;
        setWillNotDraw(false);
        if (!z4) {
            setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        }
        addView(view, k7.c6.c(-1.0f, -1));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z4 = this.f30572c;
        sz0 sz0Var = this.f30570a;
        if (z4 || this.d) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = sz0Var.f31219c;
            boolean z10 = this.f30572c;
            if (z10) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            if (z10) {
                f11 = dp;
            } else {
                f11 = 0.0f;
            }
            fArr[3] = f11;
            fArr[2] = f11;
            boolean z11 = this.d;
            if (z11) {
                f12 = dp;
            } else {
                f12 = 0.0f;
            }
            fArr[5] = f12;
            fArr[4] = f12;
            if (!z11) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            sz0Var.f31218b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f14 = sz0Var.h;
            float width = getWidth() - sz0Var.h;
            float height = getHeight();
            float f15 = sz0Var.h;
            if (this.d) {
                f13 = -1.0f;
            } else {
                f13 = 1.0f;
            }
            rectF.set(f14, f14, width, (f15 * AndroidUtilities.dp(f13)) + height);
            sz0Var.f31218b.addRoundRect(rectF, sz0Var.f31219c, Path.Direction.CW);
            if (this.f30571b) {
                canvas2.drawPath(sz0Var.f31218b, sz0Var.d);
            }
            canvas2.drawPath(sz0Var.f31218b, sz0Var.f31220e);
        } else {
            if (this.f30571b) {
                float f16 = sz0Var.h;
                canvas2 = canvas;
                canvas2.drawRect(f16, f16, getWidth() + sz0Var.h, getHeight() + sz0Var.h, sz0Var.d);
            } else {
                canvas2 = canvas;
            }
            float f17 = sz0Var.h;
            canvas2.drawRect(f17, f17, getWidth() - sz0Var.h, getHeight() + sz0Var.h, sz0Var.f31220e);
        }
        super.onDraw(canvas2);
    }

    public void setFilled(boolean z4) {
        this.f30571b = z4;
    }
}
