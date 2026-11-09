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
public final class eh0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final Paint f45443a;
    public final Paint f45444b;
    public final org.telegram.ui.Components.w5 f45445c;
    public final org.telegram.ui.Components.i6 d;
    public int f45446e;
    public float f45447f;
    public ValueAnimator h;

    public eh0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f45443a = paint;
        Paint paint2 = new Paint(1);
        this.f45444b = paint2;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f45445c = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.d = i6Var;
        this.f45447f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false));
        paint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        i6Var.setCallback(this);
        i6Var.n(0.35f, 200L, xqVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = i6Var.f34585a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.L(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        i6Var.w(org.telegram.messenger.g0.L(13.3f));
        i6Var.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Gi, false));
        i6Var.M = org.telegram.messenger.g0.L(64.0f);
        i6Var.f34587b = 1;
    }

    public final boolean a(int i7) {
        int i10 = this.f45446e;
        boolean z9 = false;
        if (i10 != i7) {
            if (i10 < i7) {
                z9 = true;
            }
            this.f45446e = i7;
            String str = "";
            if (i7 > 0) {
                str = "" + this.f45446e;
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
                this.h.addListener(new f30(this, 6));
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
        if (this.f45446e > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f45445c.e(false, f10);
        canvas.save();
        float f11 = this.f45447f;
        canvas.scale(f11 * e10, f11 * e10, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.i6 i6Var = this.d;
        float N = org.telegram.messenger.g0.N(12.66f) + i6Var.c();
        float N2 = org.telegram.messenger.g0.N(20.3f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - N) / 2.0f, (getHeight() - N2) / 2.0f, (getWidth() + N) / 2.0f, (getHeight() + N2) / 2.0f);
        int i7 = (int) (e10 * 255.0f);
        Paint paint = this.f45444b;
        paint.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), paint);
        Paint paint2 = this.f45443a;
        paint2.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.g0.L(1.0f));
        i6Var.setBounds(0, 0, getWidth(), getHeight());
        i6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        try {
            this.f45443a.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false));
            this.f45444b.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
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
