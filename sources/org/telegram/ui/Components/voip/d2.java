package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
public final class d2 extends FrameLayout {
    public String f40828a;
    public final ImageView f40829b;
    public final TextView f40830c;
    public boolean d;
    public final m1 f40831e;
    public final RectF f40832f;

    public d2(Context context, m1 m1Var, int i7) {
        super(context);
        this.f40832f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f40831e = m1Var;
        m1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f40829b = imageView;
        addView(imageView, na.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f40830c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, na.d(-2, -2.0f, 16, i7 != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f40832f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) getParent()).getY() + getY();
        m1 m1Var = this.f40831e;
        m1Var.d(x10, y10);
        Paint paint = m1Var.f41063l;
        if (this.d) {
            b10 = paint;
        } else {
            b10 = m1Var.b();
        }
        int alpha = b10.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b11 = paint;
        } else {
            b11 = m1Var.b();
        }
        b11.setAlpha(255);
        float L = org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f);
        if (this.d) {
            b12 = paint;
        } else {
            b12 = m1Var.b();
        }
        canvas.drawRoundRect(rectF, L, L2, b12);
        if (!this.d) {
            paint = m1Var.b();
        }
        paint.setAlpha(alpha);
        if (m1Var.f41057e) {
            int alpha2 = ((Paint) m1Var.d.f341a).getAlpha();
            ((Paint) m1Var.d.f341a).setAlpha(255);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), (Paint) m1Var.d.f341a);
            ((Paint) m1Var.d.f341a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
