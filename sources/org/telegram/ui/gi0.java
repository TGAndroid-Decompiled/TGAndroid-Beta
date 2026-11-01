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
public final class gi0 extends View implements org.telegram.ui.ActionBar.k6 {
    public final Paint f37514a;
    public final Paint f37515b;
    public final org.telegram.ui.Components.t5 f37516c;
    public final org.telegram.ui.Components.e6 d;
    public int e;
    public float f37517f;
    public ValueAnimator h;

    public gi0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f37514a = paint;
        Paint paint2 = new Paint(1);
        this.f37515b = paint2;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f37516c = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.d = e6Var;
        this.f37517f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
        paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
        e6Var.setCallback(this);
        e6Var.n(0.35f, 200L, grVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = e6Var.f25742a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.i0.L(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        e6Var.w(org.telegram.messenger.i0.L(13.3f));
        e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false));
        e6Var.M = org.telegram.messenger.i0.L(64.0f);
        e6Var.f25744b = 1;
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
                ofFloat.addUpdateListener(new a3(this, 16));
                this.h.addListener(new org.telegram.ui.Components.voip.i2(this, 17));
                org.telegram.messenger.a30.j(2.0f, this.h);
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
        float e = this.f37516c.e(false, f7);
        canvas.save();
        float f10 = this.f37517f;
        canvas.scale(f10 * e, f10 * e, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.e6 e6Var = this.d;
        float N = org.telegram.messenger.i0.N(12.66f) + e6Var.c();
        float N2 = org.telegram.messenger.i0.N(20.3f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getWidth() - N) / 2.0f, (getHeight() - N2) / 2.0f, (getWidth() + N) / 2.0f, (getHeight() + N2) / 2.0f);
        int i10 = (int) (e * 255.0f);
        Paint paint = this.f37515b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f), paint);
        Paint paint2 = this.f37514a;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.i0.L(1.0f));
        e6Var.setBounds(0, 0, getWidth(), getHeight());
        e6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        try {
            this.f37514a.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
            this.f37515b.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
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
