package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
public final class h2 extends FrameLayout {
    public String f32078a;
    public final ImageView f32079b;
    public final TextView f32080c;
    public boolean d;
    public final o1 f32081e;
    public final RectF f32082f;

    public h2(Context context, o1 o1Var, int i10) {
        super(context);
        float f10;
        this.f32082f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f32081e = o1Var;
        o1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f32079b = imageView;
        addView(imageView, c6.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f32080c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        if (i10 == 0) {
            f10 = 14.0f;
        } else {
            f10 = 36.0f;
        }
        addView(textView, c6.d(-2, -2.0f, 16, f10, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f32082f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) getParent()).getY() + getY();
        o1 o1Var = this.f32081e;
        o1Var.d(x10, y10);
        Paint paint = o1Var.f32236l;
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
        if (o1Var.f32230e) {
            int alpha2 = ((Paint) o1Var.d.f155a).getAlpha();
            ((Paint) o1Var.d.f155a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) o1Var.d.f155a);
            ((Paint) o1Var.d.f155a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
