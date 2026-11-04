package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
public final class o1 extends FrameLayout {
    public String f39499a;
    public final ImageView f39500b;
    public final TextView f39501c;
    public boolean d;
    public final x0 f39502e;
    public final RectF f39503f;

    public o1(Context context, x0 x0Var, int i3) {
        super(context);
        this.f39503f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f39502e = x0Var;
        x0Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f39500b = imageView;
        addView(imageView, mf.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f39501c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, mf.d(-2, -2.0f, 16, i3 != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f39503f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y9 = ((View) getParent()).getY() + getY();
        x0 x0Var = this.f39502e;
        x0Var.d(x10, y9);
        Paint paint = x0Var.f39713l;
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
        float L = org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f);
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
        if (x0Var.f39707e) {
            int alpha2 = ((Paint) x0Var.d.f17689a).getAlpha();
            ((Paint) x0Var.d.f17689a).setAlpha(255);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), (Paint) x0Var.d.f17689a);
            ((Paint) x0Var.d.f17689a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
