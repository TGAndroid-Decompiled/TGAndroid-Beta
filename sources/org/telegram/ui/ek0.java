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
public final class ek0 extends View {
    public final Paint f37384a;
    public final Paint f37385b;
    public final org.telegram.ui.Components.g6 f37386c;
    public final org.telegram.ui.Components.q6 d;
    public int f37387e;
    public float f37388f;
    public ValueAnimator h;

    public ek0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f37384a = paint;
        Paint paint2 = new Paint(1);
        this.f37385b = paint2;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        this.f37386c = new org.telegram.ui.Components.g6(this, 0L, 320L, isVar);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.d = q6Var;
        this.f37388f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false));
        paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
        q6Var.setCallback(this);
        q6Var.n(0.35f, 200L, isVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = q6Var.f30017a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        q6Var.w(AndroidUtilities.dp(13.3f));
        q6Var.u(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        q6Var.M = AndroidUtilities.dp(64.0f);
        q6Var.f30019b = 1;
    }

    public final boolean a(int i10) {
        int i11 = this.f37387e;
        boolean z10 = false;
        if (i11 != i10) {
            if (i11 < i10) {
                z10 = true;
            }
            this.f37387e = i10;
            String str = "";
            if (i10 > 0) {
                str = "" + this.f37387e;
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
                ofFloat.addUpdateListener(new b3(this, 18));
                this.h.addListener(new org.telegram.ui.Components.k91(this, 28));
                org.telegram.messenger.ai.l(2.0f, this.h);
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.f37387e > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f37386c.d(f7, false);
        canvas.save();
        float f10 = this.f37388f;
        canvas.scale(f10 * d, f10 * d, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.q6 q6Var = this.d;
        float dpf2 = AndroidUtilities.dpf2(12.66f) + q6Var.c();
        float dpf22 = AndroidUtilities.dpf2(20.3f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dpf2) / 2.0f, (getHeight() - dpf22) / 2.0f, (getWidth() + dpf2) / 2.0f, (getHeight() + dpf22) / 2.0f);
        int i10 = (int) (d * 255.0f);
        Paint paint = this.f37385b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
        Paint paint2 = this.f37384a;
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
