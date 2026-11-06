package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class mw0 extends View {
    public final RectF f47862a;
    public final TextPaint f47863b;
    public final Paint f47864c;
    public final ValueAnimator d;
    public final float[] f47865e;
    public final c5.a f47866f;
    public boolean h;
    public final ProfileActivity f47867n;

    public mw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f47867n = profileActivity;
        this.f47862a = new RectF();
        this.f47865e = new float[]{0.0f, 1.0f};
        c5.a adapter = profileActivity.f41756n0.getAdapter();
        this.f47866f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f47863b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
        Paint paint = new Paint(1);
        this.f47864c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40313j);
        ofFloat.addUpdateListener(new a3(this, 27));
        ofFloat.addListener(new z40(5, this, profileActivity.f41749m1));
        profileActivity.f41756n0.b(new lw0(this));
        adapter.f5303a.registerObserver(new c5.h(this, 3));
    }

    public final void a(boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f47867n;
        if (z9) {
            kw0 kw0Var = profileActivity.M;
            kw0Var.J = kw0Var.L;
            kw0Var.K = kw0Var.M;
            kw0Var.N = 0.0f;
            kw0Var.O = 1;
        }
        profileActivity.M.invalidate();
        float measureText = this.f47863b.measureText(((String) this.f47866f.d(profileActivity.f41756n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(54.0f);
        RectF rectF = this.f47862a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (org.telegram.messenger.g0.N(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22531m;
                float L = org.telegram.messenger.g0.L(15.0f) + i7;
                rectF.top = L;
                rectF.bottom = L + org.telegram.messenger.g0.L(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i7 = 0;
        float L2 = org.telegram.messenger.g0.L(15.0f) + i7;
        rectF.top = L2;
        rectF.bottom = L2 + org.telegram.messenger.g0.L(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f10) {
        boolean z9;
        ProfileActivity profileActivity = this.f47867n;
        if (profileActivity.f41764o2 && profileActivity.f41756n0.getRealCount() > 20) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != this.h) {
            this.h = z9;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f47865e;
            float U1 = org.telegram.messenger.g0.U1(animatedFraction, fArr);
            float f11 = 0.0f;
            if (f10 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z9) {
                valueAnimator.setDuration(((1.0f - U1) * 250.0f) / f10);
            } else {
                valueAnimator.setDuration((250.0f * U1) / f10);
            }
            fArr[0] = U1;
            if (z9) {
                f11 = 1.0f;
            }
            fArr[1] = f11;
            valueAnimator.start();
        }
    }

    public final void c() {
        zu0 zu0Var;
        ProfileActivity profileActivity = this.f47867n;
        if (profileActivity.S0 != null && (zu0Var = profileActivity.f41756n0) != null && profileActivity.f41764o2) {
            if (zu0Var.getRealPosition() == 0) {
                profileActivity.S0.t(33);
                profileActivity.S0.S(36);
                return;
            }
            profileActivity.S0.S(33);
            profileActivity.S0.t(36);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float N = org.telegram.messenger.g0.N(12.0f);
        Paint paint = this.f47864c;
        RectF rectF = this.f47862a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f47866f.d(this.f47867n.f41756n0.getCurrentItem())).toString(), rectF.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF.top, this.f47863b);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        a(false);
    }
}
