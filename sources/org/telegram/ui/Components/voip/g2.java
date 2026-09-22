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
public final class g2 extends FrameLayout {
    public String f28953a;
    public final ImageView f28954b;
    public final TextView f28955c;
    public boolean d;
    public final q1 e;
    public final RectF f28956f;

    public g2(Context context, q1 q1Var, int i10) {
        super(context);
        float f7;
        this.f28956f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = q1Var;
        q1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f28954b = imageView;
        addView(imageView, x5.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f28955c = textView;
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
        RectF rectF = this.f28956f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        q1 q1Var = this.e;
        q1Var.d(x10, y3);
        Paint paint = q1Var.f29174l;
        if (this.d) {
            b10 = paint;
        } else {
            b10 = q1Var.b();
        }
        int alpha = b10.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b11 = paint;
        } else {
            b11 = q1Var.b();
        }
        b11.setAlpha(255);
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        if (this.d) {
            b12 = paint;
        } else {
            b12 = q1Var.b();
        }
        canvas.drawRoundRect(rectF, dp, dp2, b12);
        if (!this.d) {
            paint = q1Var.b();
        }
        paint.setAlpha(alpha);
        if (q1Var.e) {
            int alpha2 = ((Paint) q1Var.d.f7333a).getAlpha();
            ((Paint) q1Var.d.f7333a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) q1Var.d.f7333a);
            ((Paint) q1Var.d.f7333a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
