package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fk0 extends View {
    public final Paint f37624a;
    public final Paint f37625b;
    public final org.telegram.ui.Components.g6 f37626c;
    public final org.telegram.ui.Components.q6 d;
    public int f37627e;
    public float f37628f;
    public ValueAnimator h;

    public fk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f37624a = paint;
        Paint paint2 = new Paint(1);
        this.f37625b = paint2;
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
        this.f37626c = new org.telegram.ui.Components.g6(this, 0L, 320L, hsVar);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.d = q6Var;
        this.f37628f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false));
        paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
        q6Var.setCallback(this);
        q6Var.n(0.35f, 200L, hsVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = q6Var.f30063a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        q6Var.w(AndroidUtilities.dp(13.3f));
        q6Var.u(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        q6Var.M = AndroidUtilities.dp(64.0f);
        q6Var.f30065b = 1;
    }

    public final boolean a(int i10) {
        int i11 = this.f37627e;
        boolean z10 = false;
        if (i11 != i10) {
            if (i11 < i10) {
                z10 = true;
            }
            this.f37627e = i10;
            String str = "";
            if (i10 > 0) {
                str = "" + this.f37627e;
            }
            this.d.t(str, true, true);
            if (z10) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.addUpdateListener(new c3(this, 18));
                this.h.addListener(new org.telegram.ui.Components.i91(this, 28));
                org.telegram.messenger.bi.l(2.0f, this.h);
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.f37627e > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f37626c.d(f7, false);
        canvas.save();
        float f10 = this.f37628f;
        canvas.scale(f10 * d, f10 * d, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.q6 q6Var = this.d;
        float dpf2 = AndroidUtilities.dpf2(12.66f) + q6Var.c();
        float dpf22 = AndroidUtilities.dpf2(20.3f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dpf2) / 2.0f, (getHeight() - dpf22) / 2.0f, (getWidth() + dpf2) / 2.0f, (getHeight() + dpf22) / 2.0f);
        int i10 = (int) (d * 255.0f);
        Paint paint = this.f37625b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
        Paint paint2 = this.f37624a;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
        q6Var.setBounds(0, 0, getWidth(), getHeight());
        q6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
