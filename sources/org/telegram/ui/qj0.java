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

public final class qj0 extends View {

    public final Paint f41683a;

    public final Paint f41684b;

    public final org.telegram.ui.Components.y5 f41685c;
    public final org.telegram.ui.Components.i6 d;

    public int f41686e;

    public float f41687f;
    public ValueAnimator h;

    public qj0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f41683a = paint;
        Paint paint2 = new Paint(1);
        this.f41684b = paint2;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.f41685c = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.d = i6Var;
        this.f41687f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
        i6Var.setCallback(this);
        i6Var.k(0.35f, 200L, erVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = i6Var.f29238a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        i6Var.t(AndroidUtilities.dp(13.3f));
        i6Var.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        i6Var.G = AndroidUtilities.dp(64.0f);
        i6Var.f29239b = 1;
    }

    public final boolean a(int i10) {
        int i11 = this.f41686e;
        boolean z10 = false;
        if (i11 != i10) {
            z10 = i11 < i10;
            this.f41686e = i10;
            String str = "";
            if (i10 > 0) {
                str = "" + this.f41686e;
            }
            this.d.q(str, true, true);
            if (z10) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new g3(this, 18));
                this.h.addListener(new f50(this, 5));
                this.h.setInterpolator(new OvershootInterpolator(2.0f));
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fD = this.f41685c.d(this.f41686e > 0 ? 1.0f : 0.0f, false);
        canvas.save();
        float f10 = this.f41687f;
        canvas.scale(f10 * fD, f10 * fD, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.i6 i6Var = this.d;
        float fDpf2 = AndroidUtilities.dpf2(12.66f) + i6Var.d();
        float fDpf3 = AndroidUtilities.dpf2(20.3f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - fDpf2) / 2.0f, (getHeight() - fDpf3) / 2.0f, (getWidth() + fDpf2) / 2.0f, (getHeight() + fDpf3) / 2.0f);
        int i10 = (int) (fD * 255.0f);
        Paint paint = this.f41684b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
        Paint paint2 = this.f41683a;
        paint2.setAlpha(i10);
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
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
