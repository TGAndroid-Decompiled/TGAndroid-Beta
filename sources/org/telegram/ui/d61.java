package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d61 extends FrameLayout {
    public final Path f35713a;
    public final Paint f35714b;
    public final boolean f35715c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.f6 f35716e;
    public final Integer f35717f;
    public final j71 h;

    public d61(j71 j71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        super(context);
        this.h = j71Var;
        this.f35715c = z10;
        this.d = z11;
        this.f35716e = f6Var;
        this.f35717f = num;
        this.f35713a = new Path();
        this.f35714b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        j71 j71Var = this.h;
        if (!j71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f35715c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f35714b;
            if (z10) {
                org.telegram.ui.ActionBar.j6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, this.f35716e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f35717f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (j71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (j71Var.f37656a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, j71Var.f37659b1, height, getPaddingTop()), ((width - dp) * j71Var.f37656a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (j71Var.f37656a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * j71Var.f37656a1) + getPaddingLeft() + dp, (height * j71Var.f37659b1) + getPaddingTop());
            }
            Path path = this.f35713a;
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
