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
public final class pj0 extends View {
    public final Paint f41547a;
    public final Paint f41548b;
    public final org.telegram.ui.Components.y5 f41549c;
    public final org.telegram.ui.Components.i6 d;
    public int f41550e;
    public float f41551f;
    public ValueAnimator h;

    public pj0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f41547a = paint;
        Paint paint2 = new Paint(1);
        this.f41548b = paint2;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f41549c = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.d = i6Var;
        this.f41551f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false));
        paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
        i6Var.setCallback(this);
        i6Var.k(0.35f, 200L, grVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = i6Var.f29332a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        i6Var.t(AndroidUtilities.dp(13.3f));
        i6Var.r(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        i6Var.G = AndroidUtilities.dp(64.0f);
        i6Var.f29333b = 1;
    }

    public final boolean a(int i9) {
        int i10 = this.f41550e;
        boolean z10 = false;
        if (i10 != i9) {
            if (i10 < i9) {
                z10 = true;
            }
            this.f41550e = i9;
            String str = "";
            if (i9 > 0) {
                str = "" + this.f41550e;
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
                ofFloat.addUpdateListener(new f3(this, 18));
                this.h.addListener(new bc0(this, 3));
                this.h.setInterpolator(new OvershootInterpolator(2.0f));
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f41550e > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f41549c.d(f10, false);
        canvas.save();
        float f11 = this.f41551f;
        canvas.scale(f11 * d, f11 * d, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.i6 i6Var = this.d;
        float dpf2 = AndroidUtilities.dpf2(12.66f) + i6Var.d();
        float dpf22 = AndroidUtilities.dpf2(20.3f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dpf2) / 2.0f, (getHeight() - dpf22) / 2.0f, (getWidth() + dpf2) / 2.0f, (getHeight() + dpf22) / 2.0f);
        int i9 = (int) (d * 255.0f);
        Paint paint = this.f41548b;
        paint.setAlpha(i9);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
        Paint paint2 = this.f41547a;
        paint2.setAlpha(i9);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
        i6Var.setBounds(0, 0, getWidth(), getHeight());
        i6Var.draw(canvas);
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
