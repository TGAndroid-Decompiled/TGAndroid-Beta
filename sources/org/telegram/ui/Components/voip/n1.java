package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import w7.b6;
public final class n1 extends FrameLayout {
    public String f31555a;
    public final ImageView f31556b;
    public final TextView f31557c;
    public boolean d;
    public final x0 e;
    public final RectF f31558f;

    public n1(Context context, x0 x0Var, int i10) {
        super(context);
        this.f31558f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = x0Var;
        x0Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f31556b = imageView;
        addView(imageView, b6.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f31557c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, b6.d(-2, -2.0f, 16, i10 != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f31558f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        x0 x0Var = this.e;
        x0Var.d(x10, y3);
        Paint paint = x0Var.f31761l;
        if (this.d) {
            b10 = paint;
        } else {
            b10 = x0Var.b();
        }
        int alpha = b10.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b11 = paint;
        } else {
            b11 = x0Var.b();
        }
        b11.setAlpha(255);
        float L = org.telegram.messenger.i0.L(16.0f);
        float L2 = org.telegram.messenger.i0.L(16.0f);
        if (this.d) {
            b12 = paint;
        } else {
            b12 = x0Var.b();
        }
        canvas.drawRoundRect(rectF, L, L2, b12);
        if (!this.d) {
            paint = x0Var.b();
        }
        paint.setAlpha(alpha);
        if (x0Var.e) {
            int alpha2 = ((Paint) x0Var.d.f9347a).getAlpha();
            ((Paint) x0Var.d.f9347a).setAlpha(255);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), (Paint) x0Var.d.f9347a);
            ((Paint) x0Var.d.f9347a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
