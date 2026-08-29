package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
public final class i2 extends FrameLayout {
    public String f33753a;
    public final ImageView f33754b;
    public final TextView f33755c;
    public boolean d;
    public final o1 f33756e;
    public final RectF f33757f;

    public i2(Context context, o1 o1Var, int i10) {
        super(context);
        float f9;
        this.f33757f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f33756e = o1Var;
        o1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f33754b = imageView;
        addView(imageView, f6.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f33755c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        if (i10 == 0) {
            f9 = 14.0f;
        } else {
            f9 = 36.0f;
        }
        addView(textView, f6.d(-2, -2.0f, 16, f9, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f33757f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x4 = ((View) getParent()).getX() + getX();
        float y8 = ((View) getParent()).getY() + getY();
        o1 o1Var = this.f33756e;
        o1Var.d(x4, y8);
        Paint paint = o1Var.f33892l;
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
        if (o1Var.f33886e) {
            int alpha2 = ((Paint) o1Var.d.d).getAlpha();
            ((Paint) o1Var.d.d).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) o1Var.d.d);
            ((Paint) o1Var.d.d).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
