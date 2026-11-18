package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ma;
public final class c2 extends FrameLayout {
    public String f40799a;
    public final ImageView f40800b;
    public final TextView f40801c;
    public boolean d;
    public final l1 f40802e;
    public final RectF f40803f;

    public c2(Context context, l1 l1Var, int i7) {
        super(context);
        this.f40803f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f40802e = l1Var;
        l1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f40800b = imageView;
        addView(imageView, ma.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f40801c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, ma.d(-2, -2.0f, 16, i7 != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f40803f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) getParent()).getY() + getY();
        l1 l1Var = this.f40802e;
        l1Var.d(x10, y10);
        Paint paint = l1Var.f41027l;
        if (this.d) {
            b10 = paint;
        } else {
            b10 = l1Var.b();
        }
        int alpha = b10.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b11 = paint;
        } else {
            b11 = l1Var.b();
        }
        b11.setAlpha(255);
        float L = org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f);
        if (this.d) {
            b12 = paint;
        } else {
            b12 = l1Var.b();
        }
        canvas.drawRoundRect(rectF, L, L2, b12);
        if (!this.d) {
            paint = l1Var.b();
        }
        paint.setAlpha(alpha);
        if (l1Var.f41021e) {
            int alpha2 = ((Paint) l1Var.d.f341a).getAlpha();
            ((Paint) l1Var.d.f341a).setAlpha(255);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), (Paint) l1Var.d.f341a);
            ((Paint) l1Var.d.f341a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
