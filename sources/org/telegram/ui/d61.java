package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d61 extends FrameLayout {
    public final Path f35687a;
    public final Paint f35688b;
    public final boolean f35689c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.f6 f35690e;
    public final Integer f35691f;
    public final j71 h;

    public d61(j71 j71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        super(context);
        this.h = j71Var;
        this.f35689c = z10;
        this.d = z11;
        this.f35690e = f6Var;
        this.f35691f = num;
        this.f35687a = new Path();
        this.f35688b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        j71 j71Var = this.h;
        if (!j71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f35689c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f35688b;
            if (z10) {
                org.telegram.ui.ActionBar.j6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, this.f35690e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f35691f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (j71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (j71Var.f37630a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, j71Var.f37633b1, height, getPaddingTop()), ((width - dp) * j71Var.f37630a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (j71Var.f37630a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * j71Var.f37630a1) + getPaddingLeft() + dp, (height * j71Var.f37633b1) + getPaddingTop());
            }
            Path path = this.f35687a;
            path.rewind();
            path.addRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
    }
}
