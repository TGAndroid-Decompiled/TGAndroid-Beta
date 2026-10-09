package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s4 extends LinearLayout {
    public final RectF f35450a;
    public final RectF f35451b;
    public final RectF f35452c;
    public final Paint d;
    public final org.telegram.ui.ActionBar.e6 f35453e;
    public final t4 f35454f;

    public s4(t4 t4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f35454f = t4Var;
        this.f35453e = e6Var;
        this.f35450a = new RectF();
        this.f35451b = new RectF();
        this.f35452c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        t4 t4Var = this.f35454f;
        float d = t4Var.f35480f.d(t4Var.d, false);
        double d10 = d;
        TextView[] textViewArr = t4Var.f35478c;
        int clamp = Utilities.clamp((int) Math.floor(d10), textViewArr.length, 0);
        int clamp2 = Utilities.clamp((int) Math.ceil(d10), textViewArr.length, 0);
        RectF rectF = this.f35450a;
        if (clamp >= 0 && clamp < textViewArr.length) {
            TextView textView = textViewArr[clamp];
            rectF.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
        }
        RectF rectF2 = this.f35451b;
        if (clamp2 >= 0 && clamp2 < textViewArr.length) {
            TextView textView2 = textViewArr[clamp2];
            rectF2.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
        }
        RectF rectF3 = this.f35452c;
        AndroidUtilities.lerp(rectF, rectF2, d - clamp, rectF3);
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.1f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.f35453e));
        Paint paint = this.d;
        paint.setColor(m12);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
        super.dispatchDraw(canvas);
    }
}
