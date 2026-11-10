package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class fh0 extends View implements org.telegram.ui.ActionBar.c6 {
    public final Paint f45770a;
    public final Paint f45771b;
    public final org.telegram.ui.Components.v5 f45772c;
    public final org.telegram.ui.Components.h6 d;
    public int f45773e;
    public float f45774f;
    public ValueAnimator h;

    public fh0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f45770a = paint;
        Paint paint2 = new Paint(1);
        this.f45771b = paint2;
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        this.f45772c = new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(false, true, true);
        this.d = h6Var;
        this.f45774f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
        paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        h6Var.setCallback(this);
        h6Var.n(0.35f, 200L, wqVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = h6Var.f34185a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.L(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        h6Var.w(org.telegram.messenger.g0.L(13.3f));
        h6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gi, false));
        h6Var.M = org.telegram.messenger.g0.L(64.0f);
        h6Var.f34187b = 1;
    }

    public final boolean a(int i7) {
        int i10 = this.f45773e;
        boolean z9 = false;
        if (i10 != i7) {
            if (i10 < i7) {
                z9 = true;
            }
            this.f45773e = i7;
            String str = "";
            if (i7 > 0) {
                str = "" + this.f45773e;
            }
            this.d.t(str, true, true);
            if (z9) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.addUpdateListener(new a3(this, 16));
                this.h.addListener(new g30(this, 6));
                org.telegram.messenger.camera.q.i(2.0f, this.h);
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z9;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f45773e > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f45772c.e(false, f10);
        canvas.save();
        float f11 = this.f45774f;
        canvas.scale(f11 * e10, f11 * e10, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.h6 h6Var = this.d;
        float N = org.telegram.messenger.g0.N(12.66f) + h6Var.c();
        float N2 = org.telegram.messenger.g0.N(20.3f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - N) / 2.0f, (getHeight() - N2) / 2.0f, (getWidth() + N) / 2.0f, (getHeight() + N2) / 2.0f);
        int i7 = (int) (e10 * 255.0f);
        Paint paint = this.f45771b;
        paint.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), paint);
        Paint paint2 = this.f45770a;
        paint2.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.g0.L(1.0f));
        h6Var.setBounds(0, 0, getWidth(), getHeight());
        h6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        try {
            this.f45770a.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false));
            this.f45771b.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
