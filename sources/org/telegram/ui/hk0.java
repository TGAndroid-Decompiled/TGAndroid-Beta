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
public final class hk0 extends View {
    public final Paint f37055a;
    public final Paint f37056b;
    public final org.telegram.ui.Components.e6 f37057c;
    public final org.telegram.ui.Components.p6 d;
    public int f37058e;
    public float f37059f;
    public ValueAnimator h;

    public hk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f37055a = paint;
        Paint paint2 = new Paint(1);
        this.f37056b = paint2;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.f37057c = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.d = p6Var;
        this.f37059f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
        p6Var.setCallback(this);
        p6Var.k(0.35f, 200L, prVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = p6Var.f29284a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        p6Var.t(AndroidUtilities.dp(13.3f));
        p6Var.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        p6Var.G = AndroidUtilities.dp(64.0f);
        p6Var.f29285b = 1;
    }

    public final boolean a(int i10) {
        boolean z10;
        int i11 = this.f37058e;
        if (i11 == i10) {
            return false;
        }
        if (i11 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37058e = i10;
        String str = "";
        if (i10 > 0) {
            str = "" + this.f37058e;
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
            ofFloat.addUpdateListener(new c3(this, 18));
            this.h.addListener(new gk0(this, 0));
            this.h.setInterpolator(new OvershootInterpolator(2.0f));
            this.h.setDuration(200L);
            this.h.start();
        }
        return z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.f37058e > 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f37057c.d(f7, false);
        canvas.save();
        float f10 = this.f37059f;
        canvas.scale(f10 * d, f10 * d, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.p6 p6Var = this.d;
        float dpf2 = AndroidUtilities.dpf2(12.66f) + p6Var.d();
        float dpf22 = AndroidUtilities.dpf2(20.3f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dpf2) / 2.0f, (getHeight() - dpf22) / 2.0f, (getWidth() + dpf2) / 2.0f, (getHeight() + dpf22) / 2.0f);
        int i10 = (int) (d * 255.0f);
        Paint paint = this.f37056b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
        Paint paint2 = this.f37055a;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
        p6Var.setBounds(0, 0, getWidth(), getHeight());
        p6Var.draw(canvas);
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
