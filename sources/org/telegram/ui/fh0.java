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
    public final Paint f47836a;
    public final Paint f47837b;
    public final org.telegram.ui.Components.c6 f47838c;
    public final org.telegram.ui.Components.m6 d;
    public int f47839e;
    public float f47840f;
    public ValueAnimator h;

    public fh0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f47836a = paint;
        Paint paint2 = new Paint(1);
        this.f47837b = paint2;
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.f47838c = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.d = m6Var;
        this.f47840f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false));
        paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        m6Var.setCallback(this);
        m6Var.n(0.35f, 200L, krVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = m6Var.f37392a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.L(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        m6Var.w(org.telegram.messenger.g0.L(13.3f));
        m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false));
        m6Var.N = org.telegram.messenger.g0.L(64.0f);
        m6Var.f37394b = 1;
    }

    public final boolean a(int i7) {
        int i10 = this.f47839e;
        boolean z10 = false;
        if (i10 != i7) {
            if (i10 < i7) {
                z10 = true;
            }
            this.f47839e = i7;
            String str = "";
            if (i7 > 0) {
                str = "" + this.f47839e;
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
                this.h.addListener(new zx(this, 7));
                org.telegram.ui.Cells.c0.q(2.0f, this.h);
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f47839e > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f47838c.e(false, f10);
        canvas.save();
        float f11 = this.f47840f;
        canvas.scale(f11 * e10, f11 * e10, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.m6 m6Var = this.d;
        float N = org.telegram.messenger.g0.N(12.66f) + m6Var.c();
        float N2 = org.telegram.messenger.g0.N(20.3f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - N) / 2.0f, (getHeight() - N2) / 2.0f, (getWidth() + N) / 2.0f, (getHeight() + N2) / 2.0f);
        int i7 = (int) (e10 * 255.0f);
        Paint paint = this.f47837b;
        paint.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), paint);
        Paint paint2 = this.f47836a;
        paint2.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.g0.L(1.0f));
        m6Var.setBounds(0, 0, getWidth(), getHeight());
        m6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        try {
            this.f47836a.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false));
            this.f47837b.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false));
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
