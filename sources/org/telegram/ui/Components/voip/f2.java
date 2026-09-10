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
import w7.a6;
public final class f2 extends FrameLayout {
    public String f28121a;
    public final ImageView f28122b;
    public final TextView f28123c;
    public boolean d;
    public final p1 e;
    public final RectF f28124f;

    public f2(Context context, p1 p1Var, int i10) {
        super(context);
        float f7;
        this.f28124f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = p1Var;
        p1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f28122b = imageView;
        addView(imageView, a6.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.f28123c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        if (i10 == 0) {
            f7 = 14.0f;
        } else {
            f7 = 36.0f;
        }
        addView(textView, a6.d(-2, -2.0f, 16, f7, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f28124f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        p1 p1Var = this.e;
        p1Var.d(x10, y3);
        Paint paint = p1Var.f28346l;
        if (this.d) {
            b10 = paint;
        } else {
            b10 = p1Var.b();
        }
        int alpha = b10.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b11 = paint;
        } else {
            b11 = p1Var.b();
        }
        b11.setAlpha(255);
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        if (this.d) {
            b12 = paint;
        } else {
            b12 = p1Var.b();
        }
        canvas.drawRoundRect(rectF, dp, dp2, b12);
        if (!this.d) {
            paint = p1Var.b();
        }
        paint.setAlpha(alpha);
        if (p1Var.e) {
            int alpha2 = ((Paint) p1Var.d.f6103a).getAlpha();
            ((Paint) p1Var.d.f6103a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) p1Var.d.f6103a);
            ((Paint) p1Var.d.f6103a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
