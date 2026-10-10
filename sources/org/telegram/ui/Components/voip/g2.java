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
import w7.x5;
public final class g2 extends FrameLayout {
    public String f32009a;
    public final ImageView f32010b;
    public final TextView f32011c;
    public boolean d;
    public final q1 f32012e;
    public final RectF f32013f;

    public g2(Context context, q1 q1Var, int i10) {
        super(context);
        this.f32013f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f32012e = q1Var;
        q1Var.a(this);
        ImageView imageView = new ImageView(context);
        this.f32010b = imageView;
        addView(imageView, x5.a(24.0f, 8.0f, 2.0f, 8.0f, 2.0f, 24, 16));
        TextView textView = new TextView(context);
        this.f32011c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, x5.a(-2.0f, i10 != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f, -2, 16));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b10;
        Paint b11;
        Paint b12;
        RectF rectF = this.f32013f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x10 = ((View) getParent()).getX() + getX();
        float y3 = ((View) getParent()).getY() + getY();
        q1 q1Var = this.f32012e;
        q1Var.d(x10, y3);
        Paint paint = q1Var.f32246l;
        if (this.d) {
            b10 = paint;
        } else {
            b10 = q1Var.b();
        }
        int alpha = b10.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b11 = paint;
        } else {
            b11 = q1Var.b();
        }
        b11.setAlpha(255);
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        if (this.d) {
            b12 = paint;
        } else {
            b12 = q1Var.b();
        }
        canvas.drawRoundRect(rectF, dp, dp2, b12);
        if (!this.d) {
            paint = q1Var.b();
        }
        paint.setAlpha(alpha);
        if (q1Var.f32240e) {
            int alpha2 = ((Paint) q1Var.d.f7954a).getAlpha();
            ((Paint) q1Var.d.f7954a).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) q1Var.d.f7954a);
            ((Paint) q1Var.d.f7954a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
