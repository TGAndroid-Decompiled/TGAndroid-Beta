package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rz0 extends TextView {
    public final sz0 f28615a;
    public boolean f28616b;
    public boolean f28617c;

    public rz0(sz0 sz0Var, CharSequence charSequence) {
        super(sz0Var.getContext());
        this.f28615a = sz0Var;
        org.telegram.ui.ActionBar.f6 f6Var = sz0Var.f28843a;
        setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        setTypeface(AndroidUtilities.bold());
        setTextSize(1, 14.0f);
        setText(charSequence);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        boolean z4 = this.f28616b;
        sz0 sz0Var = this.f28615a;
        if (z4 || this.f28617c) {
            canvas2 = canvas;
            float dp = AndroidUtilities.dp(10.0f);
            float[] fArr = sz0Var.f28845c;
            if (this.f28616b) {
                f10 = dp;
            } else {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            fArr[0] = f10;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[5] = 0.0f;
            fArr[4] = 0.0f;
            if (!this.f28617c) {
                dp = 0.0f;
            }
            fArr[7] = dp;
            fArr[6] = dp;
            sz0Var.f28844b.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            float f12 = sz0Var.h;
            float width = getWidth() + sz0Var.h;
            float height = getHeight();
            float f13 = sz0Var.h;
            if (this.f28617c) {
                f11 = -1.0f;
            } else {
                f11 = 1.0f;
            }
            rectF.set(f12, f12, width, (f13 * AndroidUtilities.dp(f11)) + height);
            sz0Var.f28844b.addRoundRect(rectF, sz0Var.f28845c, Path.Direction.CW);
            canvas2.drawPath(sz0Var.f28844b, sz0Var.d);
            canvas2.drawPath(sz0Var.f28844b, sz0Var.e);
        } else {
            float f14 = sz0Var.h;
            canvas2 = canvas;
            canvas2.drawRect(f14, f14, getWidth() + sz0Var.h, getHeight() + sz0Var.h, sz0Var.d);
            float f15 = sz0Var.h;
            canvas2.drawRect(f15, f15, getWidth() + sz0Var.h, getHeight() + sz0Var.h, sz0Var.e);
        }
        super.onDraw(canvas2);
    }
}
