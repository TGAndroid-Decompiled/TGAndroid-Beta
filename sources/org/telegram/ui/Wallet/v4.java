package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v4 extends LinearLayout {
    public final RectF f35446a;
    public final RectF f35447b;
    public final RectF f35448c;
    public final Paint d;
    public final org.telegram.ui.ActionBar.c6 f35449e;
    public final w4 f35450f;

    public v4(w4 w4Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f35450f = w4Var;
        this.f35449e = c6Var;
        this.f35446a = new RectF();
        this.f35447b = new RectF();
        this.f35448c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w4 w4Var = this.f35450f;
        float d = w4Var.f35477f.d(w4Var.d, false);
        double d10 = d;
        TextView[] textViewArr = w4Var.f35475c;
        int clamp = Utilities.clamp((int) Math.floor(d10), textViewArr.length, 0);
        int clamp2 = Utilities.clamp((int) Math.ceil(d10), textViewArr.length, 0);
        RectF rectF = this.f35446a;
        if (clamp >= 0 && clamp < textViewArr.length) {
            TextView textView = textViewArr[clamp];
            rectF.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
        }
        RectF rectF2 = this.f35447b;
        if (clamp2 >= 0 && clamp2 < textViewArr.length) {
            TextView textView2 = textViewArr[clamp2];
            rectF2.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
        }
        RectF rectF3 = this.f35448c;
        AndroidUtilities.lerp(rectF, rectF2, d - clamp, rectF3);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.f35449e));
        Paint paint = this.d;
        paint.setColor(m12);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
        super.dispatchDraw(canvas);
    }
}
