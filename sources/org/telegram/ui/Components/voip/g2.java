package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
public final class g2 extends FrameLayout {
    public String f29647a;
    public final ImageView f29648b;
    public final TextView f29649c;
    public boolean d;
    public final n1 e;
    public final RectF f29650f;

    public g2(Context context, n1 n1Var, int i10) {
        super(context);
        float f10;
        this.f29650f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = n1Var;
        n1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f29648b = imageView;
        addView(imageView, b6.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f29649c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        if (i10 == 0) {
            f10 = 14.0f;
        } else {
            f10 = 36.0f;
        }
        addView(textView, b6.d(-2, -2.0f, 16, f10, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f29650f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) getParent()).getY() + getY();
        n1 n1Var = this.e;
        n1Var.d(x10, y10);
        Paint paint = n1Var.f29804l;
        if (this.d) {
            b10 = paint;
        } else {
            b10 = n1Var.b();
        }
        int alpha = b10.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b11 = paint;
        } else {
            b11 = n1Var.b();
        }
        b11.setAlpha(255);
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        if (this.d) {
            b12 = paint;
        } else {
            b12 = n1Var.b();
        }
        canvas.drawRoundRect(rectF, dp, dp2, b12);
        if (!this.d) {
            paint = n1Var.b();
        }
        paint.setAlpha(alpha);
        if (n1Var.e) {
            int alpha2 = ((Paint) n1Var.d.f143a).getAlpha();
            ((Paint) n1Var.d.f143a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) n1Var.d.f143a);
            ((Paint) n1Var.d.f143a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
