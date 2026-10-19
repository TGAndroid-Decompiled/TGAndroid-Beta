package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i5 extends LinearLayout {
    public final RectF f34322a;
    public final RectF f34323b;
    public final RectF f34324c;
    public final Paint d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final j5 f34325f;

    public i5(j5 j5Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f34325f = j5Var;
        this.e = d6Var;
        this.f34322a = new RectF();
        this.f34323b = new RectF();
        this.f34324c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j5 j5Var = this.f34325f;
        float d = j5Var.f34378f.d(j5Var.d, false);
        double d10 = d;
        TextView[] textViewArr = j5Var.f34377c;
        int clamp = Utilities.clamp((int) Math.floor(d10), textViewArr.length, 0);
        int clamp2 = Utilities.clamp((int) Math.ceil(d10), textViewArr.length, 0);
        RectF rectF = this.f34322a;
        if (clamp >= 0 && clamp < textViewArr.length) {
            TextView textView = textViewArr[clamp];
            rectF.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
        }
        RectF rectF2 = this.f34323b;
        if (clamp2 >= 0 && clamp2 < textViewArr.length) {
            TextView textView2 = textViewArr[clamp2];
            rectF2.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
        }
        RectF rectF3 = this.f34324c;
        AndroidUtilities.lerp(rectF, rectF2, d - clamp, rectF3);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.e));
        Paint paint = this.d;
        paint.setColor(m12);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
        super.dispatchDraw(canvas);
    }
}
