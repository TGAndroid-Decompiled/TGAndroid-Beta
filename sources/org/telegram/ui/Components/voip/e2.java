package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import w7.x5;
public final class e2 extends FrameLayout {
    public String f31496a;
    public final ImageView f31497b;
    public final TextView f31498c;
    public boolean d;
    public final o1 f31499e;
    public final RectF f31500f;

    public e2(Context context, o1 o1Var, int i10) {
        super(context);
        float f7;
        this.f31500f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f31499e = o1Var;
        o1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f31497b = imageView;
        addView(imageView, x5.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f31498c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        if (i10 == 0) {
            f7 = 14.0f;
        } else {
            f7 = 36.0f;
        }
        addView(textView, x5.d(-2, -2.0f, 16, f7, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f31500f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        o1 o1Var = this.f31499e;
        o1Var.d(x10, y3);
        Paint paint = o1Var.f31734l;
        if (this.d) {
            b10 = paint;
        } else {
            b10 = o1Var.b();
        }
        int alpha = b10.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b11 = paint;
        } else {
            b11 = o1Var.b();
        }
        b11.setAlpha(255);
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        if (this.d) {
            b12 = paint;
        } else {
            b12 = o1Var.b();
        }
        canvas.drawRoundRect(rectF, dp, dp2, b12);
        if (!this.d) {
            paint = o1Var.b();
        }
        paint.setAlpha(alpha);
        if (o1Var.f31728e) {
            int alpha2 = ((Paint) o1Var.d.f6401a).getAlpha();
            ((Paint) o1Var.d.f6401a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) o1Var.d.f6401a);
            ((Paint) o1Var.d.f6401a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
