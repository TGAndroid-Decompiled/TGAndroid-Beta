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
import w7.w5;
public final class h2 extends FrameLayout {
    public String f31715a;
    public final ImageView f31716b;
    public final TextView f31717c;
    public boolean d;
    public final r1 f31718e;
    public final RectF f31719f;

    public h2(Context context, r1 r1Var, int i10) {
        super(context);
        this.f31719f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f31718e = r1Var;
        r1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f31716b = imageView;
        addView(imageView, w5.a(24.0f, 8.0f, 2.0f, 8.0f, 2.0f, 24, 16));
        TextView textView = new TextView(context);
        this.f31717c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, w5.a(-2.0f, i10 != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f, -2, 16));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f31719f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        r1 r1Var = this.f31718e;
        r1Var.d(x10, y3);
        Paint paint = r1Var.f31939l;
        if (this.d) {
            b10 = paint;
        } else {
            b10 = r1Var.b();
        }
        int alpha = b10.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b11 = paint;
        } else {
            b11 = r1Var.b();
        }
        b11.setAlpha(255);
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        if (this.d) {
            b12 = paint;
        } else {
            b12 = r1Var.b();
        }
        canvas.drawRoundRect(rectF, dp, dp2, b12);
        if (!this.d) {
            paint = r1Var.b();
        }
        paint.setAlpha(alpha);
        if (r1Var.f31933e) {
            int alpha2 = ((Paint) r1Var.d.f7950a).getAlpha();
            ((Paint) r1Var.d.f7950a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) r1Var.d.f7950a);
            ((Paint) r1Var.d.f7950a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
