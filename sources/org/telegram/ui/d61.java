package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d61 extends FrameLayout {
    public final Path f36957a;
    public final Paint f36958b;
    public final boolean f36959c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.d6 f36960e;
    public final Integer f36961f;
    public final j71 h;

    public d61(j71 j71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        super(context);
        this.h = j71Var;
        this.f36959c = z10;
        this.d = z11;
        this.f36960e = d6Var;
        this.f36961f = num;
        this.f36957a = new Path();
        this.f36958b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        j71 j71Var = this.h;
        if (!j71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f36959c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f36958b;
            if (z10) {
                org.telegram.ui.ActionBar.h6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, this.f36960e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f36961f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (j71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (j71Var.f38911a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.y(1.0f, j71Var.f38914b1, height, getPaddingTop()), ((width - dp) * j71Var.f38911a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (j71Var.f38911a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * j71Var.f38911a1) + getPaddingLeft() + dp, (height * j71Var.f38914b1) + getPaddingTop());
            }
            Path path = this.f36957a;
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
