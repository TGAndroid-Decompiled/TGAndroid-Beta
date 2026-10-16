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
public final class jk0 extends View {
    public final Paint f37083a;
    public final Paint f37084b;
    public final org.telegram.ui.Components.g6 f37085c;
    public final org.telegram.ui.Components.r6 d;
    public int e;
    public float f37086f;
    public ValueAnimator h;

    public jk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f37083a = paint;
        Paint paint2 = new Paint(1);
        this.f37084b = paint2;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.f37085c = new org.telegram.ui.Components.g6(this, 0L, 320L, esVar);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.d = r6Var;
        this.f37086f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
        r6Var.setCallback(this);
        r6Var.n(0.35f, 200L, esVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = r6Var.f28433a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        r6Var.w(AndroidUtilities.dp(13.3f));
        r6Var.u(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        r6Var.M = AndroidUtilities.dp(64.0f);
        r6Var.f28435b = 1;
    }

    public final boolean a(int i10) {
        int i11 = this.e;
        boolean z10 = false;
        if (i11 != i10) {
            if (i11 < i10) {
                z10 = true;
            }
            this.e = i10;
            String str = "";
            if (i10 > 0) {
                str = "" + this.e;
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
                ofFloat.addUpdateListener(new e3(this, 18));
                this.h.addListener(new kj0(this, 1));
                org.telegram.messenger.sk.l(2.0f, this.h);
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.e > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f37085c.d(f7, false);
        canvas.save();
        float f10 = this.f37086f;
        canvas.scale(f10 * d, f10 * d, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.r6 r6Var = this.d;
        float dpf2 = AndroidUtilities.dpf2(12.66f) + r6Var.c();
        float dpf22 = AndroidUtilities.dpf2(20.3f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dpf2) / 2.0f, (getHeight() - dpf22) / 2.0f, (getWidth() + dpf2) / 2.0f, (getHeight() + dpf22) / 2.0f);
        int i10 = (int) (d * 255.0f);
        Paint paint = this.f37084b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
        Paint paint2 = this.f37083a;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
        r6Var.setBounds(0, 0, getWidth(), getHeight());
        r6Var.draw(canvas);
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
