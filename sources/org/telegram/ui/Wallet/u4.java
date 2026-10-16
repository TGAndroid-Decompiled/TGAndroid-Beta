package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u4 extends LinearLayout {
    public final RectF f33475a;
    public final RectF f33476b;
    public final RectF f33477c;
    public final Paint d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final v4 f33478f;

    public u4(v4 v4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f33478f = v4Var;
        this.e = c6Var;
        this.f33475a = new RectF();
        this.f33476b = new RectF();
        this.f33477c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v4 v4Var = this.f33478f;
        float d = v4Var.f33505f.d(v4Var.d, false);
        double d10 = d;
        TextView[] textViewArr = v4Var.f33504c;
        int clamp = Utilities.clamp((int) Math.floor(d10), textViewArr.length, 0);
        int clamp2 = Utilities.clamp((int) Math.ceil(d10), textViewArr.length, 0);
        RectF rectF = this.f33475a;
        if (clamp >= 0 && clamp < textViewArr.length) {
            TextView textView = textViewArr[clamp];
            rectF.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
        }
        RectF rectF2 = this.f33476b;
        if (clamp2 >= 0 && clamp2 < textViewArr.length) {
            TextView textView2 = textViewArr[clamp2];
            rectF2.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
        }
        RectF rectF3 = this.f33477c;
        AndroidUtilities.lerp(rectF, rectF2, d - clamp, rectF3);
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, this.e));
        Paint paint = this.d;
        paint.setColor(m12);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
        super.dispatchDraw(canvas);
    }
}
