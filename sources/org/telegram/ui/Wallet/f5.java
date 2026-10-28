package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f5 extends LinearLayout {
    public final RectF f36584a;
    public final RectF f36585b;
    public final RectF f36586c;
    public final Paint d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final g5 f36587f;

    public f5(g5 g5Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f36587f = g5Var;
        this.e = u6Var;
        this.f36584a = new RectF();
        this.f36585b = new RectF();
        this.f36586c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g5 g5Var = this.f36587f;
        float d = g5Var.f36624f.d(g5Var.d, false);
        double d10 = d;
        TextView[] textViewArr = g5Var.f36623c;
        int clamp = Utilities.clamp((int) Math.floor(d10), textViewArr.length, 0);
        int clamp2 = Utilities.clamp((int) Math.ceil(d10), textViewArr.length, 0);
        RectF rectF = this.f36584a;
        if (clamp >= 0 && clamp < textViewArr.length) {
            TextView textView = textViewArr[clamp];
            rectF.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
        }
        RectF rectF2 = this.f36585b;
        if (clamp2 >= 0 && clamp2 < textViewArr.length) {
            TextView textView2 = textViewArr[clamp2];
            rectF2.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
        }
        RectF rectF3 = this.f36586c;
        AndroidUtilities.lerp(rectF, rectF2, d - clamp, rectF3);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.e));
        Paint paint = this.d;
        paint.setColor(o12);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
        super.dispatchDraw(canvas);
    }
}
