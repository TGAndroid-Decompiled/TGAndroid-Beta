package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class ay0 extends View {
    public final RectF f35904a;
    public final TextPaint f35905b;
    public final Paint f35906c;
    public final ValueAnimator d;
    public final float[] e;
    public final z4.a f35907f;
    public boolean h;
    public final ProfileActivity f35908n;

    public ay0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f35908n = profileActivity;
        this.f35904a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        z4.a adapter = profileActivity.f33864n0.getAdapter();
        this.f35907f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f35905b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.i0.N(15.0f));
        Paint paint = new Paint(1);
        this.f35906c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.f26498j);
        ofFloat.addUpdateListener(new a3(this, 27));
        ofFloat.addListener(new org.telegram.ui.Components.ha0(21, this, profileActivity.f33857m1));
        profileActivity.f33864n0.b(new zx0(this));
        adapter.f54580a.registerObserver(new h1.a(this, 2));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        org.telegram.ui.ActionBar.l lVar2;
        ProfileActivity profileActivity = this.f35908n;
        if (z10) {
            yx0 yx0Var = profileActivity.M;
            yx0Var.J = yx0Var.L;
            yx0Var.K = yx0Var.M;
            yx0Var.N = 0.0f;
            yx0Var.O = 1;
        }
        profileActivity.M.invalidate();
        float measureText = this.f35905b.measureText(((String) this.f35907f.d(profileActivity.f33864n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(54.0f);
        RectF rectF = this.f35904a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (org.telegram.messenger.i0.N(16.0f) + measureText);
        lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
            if (lVar2.getOccupyStatusBar()) {
                i10 = org.telegram.messenger.i0.f16020m;
                float L = org.telegram.messenger.i0.L(15.0f) + i10;
                rectF.top = L;
                rectF.bottom = L + org.telegram.messenger.i0.L(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i10 = 0;
        float L2 = org.telegram.messenger.i0.L(15.0f) + i10;
        rectF.top = L2;
        rectF.bottom = L2 + org.telegram.messenger.i0.L(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f7) {
        boolean z10;
        ProfileActivity profileActivity = this.f35908n;
        if (profileActivity.f33873o2 && profileActivity.f33864n0.getRealCount() > 20) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.e;
            float U1 = org.telegram.messenger.i0.U1(animatedFraction, fArr);
            float f10 = 0.0f;
            if (f7 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration(((1.0f - U1) * 250.0f) / f7);
            } else {
                valueAnimator.setDuration((250.0f * U1) / f7);
            }
            fArr[0] = U1;
            if (z10) {
                f10 = 1.0f;
            }
            fArr[1] = f10;
            valueAnimator.start();
        }
    }

    public final void c() {
        kw0 kw0Var;
        ProfileActivity profileActivity = this.f35908n;
        if (profileActivity.S0 != null && (kw0Var = profileActivity.f33864n0) != null && profileActivity.f33873o2) {
            if (kw0Var.getRealPosition() == 0) {
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
        float N = org.telegram.messenger.i0.N(12.0f);
        Paint paint = this.f35906c;
        RectF rectF = this.f35904a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f35907f.d(this.f35908n.f33864n0.getCurrentItem())).toString(), rectF.centerX(), org.telegram.messenger.i0.N(18.5f) + rectF.top, this.f35905b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
