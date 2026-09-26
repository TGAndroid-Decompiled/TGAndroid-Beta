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
import w7.y5;
public final class h2 extends FrameLayout {
    public String f29380a;
    public final ImageView f29381b;
    public final TextView f29382c;
    public boolean d;
    public final r1 e;
    public final RectF f29383f;

    public h2(Context context, r1 r1Var, int i10) {
        super(context);
        float f7;
        this.f29383f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = r1Var;
        r1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f29381b = imageView;
        addView(imageView, y5.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f29382c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        if (i10 == 0) {
            f7 = 14.0f;
        } else {
            f7 = 36.0f;
        }
        addView(textView, y5.d(-2, -2.0f, 16, f7, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f29383f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        r1 r1Var = this.e;
        r1Var.d(x10, y3);
        Paint paint = r1Var.f29589l;
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
        if (r1Var.e) {
            int alpha2 = ((Paint) r1Var.d.f7312a).getAlpha();
            ((Paint) r1Var.d.f7312a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) r1Var.d.f7312a);
            ((Paint) r1Var.d.f7312a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
