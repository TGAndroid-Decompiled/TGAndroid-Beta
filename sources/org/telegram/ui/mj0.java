package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class mj0 extends View {
    public final Paint f40580a;
    public final Paint f40581b;
    public final org.telegram.ui.Components.d6 f40582c;
    public final org.telegram.ui.Components.n6 d;
    public int f40583e;
    public float f40584f;
    public ValueAnimator h;

    public mj0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40580a = paint;
        Paint paint2 = new Paint(1);
        this.f40581b = paint2;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.f40582c = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.d = n6Var;
        this.f40584f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
        n6Var.setCallback(this);
        n6Var.k(0.35f, 200L, jrVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = n6Var.f30861a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        n6Var.t(AndroidUtilities.dp(13.3f));
        n6Var.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        n6Var.G = AndroidUtilities.dp(64.0f);
        n6Var.f30862b = 1;
    }

    public final boolean a(int i10) {
        int i11 = this.f40583e;
        boolean z10 = false;
        if (i11 != i10) {
            if (i11 < i10) {
                z10 = true;
            }
            this.f40583e = i10;
            String str = "";
            if (i10 > 0) {
                str = "" + this.f40583e;
            }
            this.d.q(str, true, true);
            if (z10) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.addUpdateListener(new g3(this, 18));
                this.h.addListener(new e50(this, 5));
                this.h.setInterpolator(new OvershootInterpolator(2.0f));
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        if (this.f40583e > 0) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float d = this.f40582c.d(f9, false);
        canvas.save();
        float f10 = this.f40584f;
        canvas.scale(f10 * d, f10 * d, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.n6 n6Var = this.d;
        float dpf2 = AndroidUtilities.dpf2(12.66f) + n6Var.d();
        float dpf22 = AndroidUtilities.dpf2(20.3f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dpf2) / 2.0f, (getHeight() - dpf22) / 2.0f, (getWidth() + dpf2) / 2.0f, (getHeight() + dpf22) / 2.0f);
        int i10 = (int) (d * 255.0f);
        Paint paint = this.f40581b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
        Paint paint2 = this.f40580a;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
        n6Var.setBounds(0, 0, getWidth(), getHeight());
        n6Var.draw(canvas);
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
