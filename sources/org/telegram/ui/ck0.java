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
public final class ck0 extends View {
    public final Paint f35494a;
    public final Paint f35495b;
    public final org.telegram.ui.Components.e6 f35496c;
    public final org.telegram.ui.Components.o6 d;
    public int f35497e;
    public float f35498f;
    public ValueAnimator h;

    public ck0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f35494a = paint;
        Paint paint2 = new Paint(1);
        this.f35495b = paint2;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        this.f35496c = new org.telegram.ui.Components.e6(this, 0L, 320L, trVar);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        this.d = o6Var;
        this.f35498f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false));
        paint2.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20889h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
        o6Var.setCallback(this);
        o6Var.k(0.35f, 200L, trVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = o6Var.f29238a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        o6Var.t(AndroidUtilities.dp(13.3f));
        o6Var.r(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        o6Var.G = AndroidUtilities.dp(64.0f);
        o6Var.f29239b = 1;
    }

    public final boolean a(int i10) {
        int i11 = this.f35497e;
        boolean z10 = false;
        if (i11 != i10) {
            if (i11 < i10) {
                z10 = true;
            }
            this.f35497e = i10;
            String str = "";
            if (i10 > 0) {
                str = "" + this.f35497e;
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
                ofFloat.addUpdateListener(new c3(this, 17));
                this.h.addListener(new org.telegram.ui.Components.a91(this, 28));
                this.h.setInterpolator(new OvershootInterpolator(2.0f));
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.f35497e > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f35496c.d(f7, false);
        canvas.save();
        float f10 = this.f35498f;
        canvas.scale(f10 * d, f10 * d, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.o6 o6Var = this.d;
        float dpf2 = AndroidUtilities.dpf2(12.66f) + o6Var.d();
        float dpf22 = AndroidUtilities.dpf2(20.3f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dpf2) / 2.0f, (getHeight() - dpf22) / 2.0f, (getWidth() + dpf2) / 2.0f, (getHeight() + dpf22) / 2.0f);
        int i10 = (int) (d * 255.0f);
        Paint paint = this.f35495b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
        Paint paint2 = this.f35494a;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
        o6Var.setBounds(0, 0, getWidth(), getHeight());
        o6Var.draw(canvas);
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
