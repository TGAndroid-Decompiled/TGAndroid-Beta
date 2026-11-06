package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
public final class z1 extends FrameLayout {
    public String f39642a;
    public final ImageView f39643b;
    public final TextView f39644c;
    public boolean d;
    public final i1 f39645e;
    public final RectF f39646f;

    public z1(Context context, i1 i1Var, int i7) {
        super(context);
        this.f39646f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f39645e = i1Var;
        i1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f39643b = imageView;
        addView(imageView, ha.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f39644c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, ha.d(-2, -2.0f, 16, i7 != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f39646f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) getParent()).getY() + getY();
        i1 i1Var = this.f39645e;
        i1Var.d(x10, y10);
        Paint paint = i1Var.f39229l;
        if (this.d) {
            b10 = paint;
        } else {
            b10 = i1Var.b();
        }
        int alpha = b10.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b11 = paint;
        } else {
            b11 = i1Var.b();
        }
        b11.setAlpha(255);
        float L = org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f);
        if (this.d) {
            b12 = paint;
        } else {
            b12 = i1Var.b();
        }
        canvas.drawRoundRect(rectF, L, L2, b12);
        if (!this.d) {
            paint = i1Var.b();
        }
        paint.setAlpha(alpha);
        if (i1Var.f39223e) {
            int alpha2 = ((Paint) i1Var.d.f335a).getAlpha();
            ((Paint) i1Var.d.f335a).setAlpha(255);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), (Paint) i1Var.d.f335a);
            ((Paint) i1Var.d.f335a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
