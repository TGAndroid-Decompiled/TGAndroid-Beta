package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class lw0 extends View {
    public final RectF f49046a;
    public final TextPaint f49047b;
    public final Paint f49048c;
    public final ValueAnimator d;
    public final float[] f49049e;
    public final c5.a f49050f;
    public boolean h;
    public final ProfileActivity f49051n;

    public lw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f49051n = profileActivity;
        this.f49046a = new RectF();
        this.f49049e = new float[]{0.0f, 1.0f};
        c5.a adapter = profileActivity.f43161o0.getAdapter();
        this.f49050f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f49047b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
        Paint paint = new Paint(1);
        this.f49048c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.er.f34422j);
        ofFloat.addUpdateListener(new a3(this, 27));
        ofFloat.addListener(new z20(6, this, profileActivity.n1));
        profileActivity.f43161o0.b(new kw0(this));
        adapter.f4128a.registerObserver(new c5.i(this, 3));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f49051n;
        if (z10) {
            jw0 jw0Var = profileActivity.N;
            jw0Var.K = jw0Var.M;
            jw0Var.L = jw0Var.N;
            jw0Var.O = 0.0f;
            jw0Var.P = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.f49047b.measureText(((String) this.f49050f.d(profileActivity.f43161o0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(54.0f);
        RectF rectF = this.f49046a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (org.telegram.messenger.g0.N(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f23605m;
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
        boolean z10;
        ProfileActivity profileActivity = this.f49051n;
        if (profileActivity.f43176q2 && profileActivity.f43161o0.getRealCount() > 20) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f49049e;
            float U1 = org.telegram.messenger.g0.U1(animatedFraction, fArr);
            float f11 = 0.0f;
            if (f10 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration(((1.0f - U1) * 250.0f) / f10);
            } else {
                valueAnimator.setDuration((250.0f * U1) / f10);
            }
            fArr[0] = U1;
            if (z10) {
                f11 = 1.0f;
            }
            fArr[1] = f11;
            valueAnimator.start();
        }
    }

    public final void c() {
        yu0 yu0Var;
        ProfileActivity profileActivity = this.f49051n;
        if (profileActivity.T0 != null && (yu0Var = profileActivity.f43161o0) != null && profileActivity.f43176q2) {
            if (yu0Var.getRealPosition() == 0) {
                profileActivity.T0.u(33);
                profileActivity.T0.T(36);
                return;
            }
            profileActivity.T0.T(33);
            profileActivity.T0.u(36);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float N = org.telegram.messenger.g0.N(12.0f);
        Paint paint = this.f49048c;
        RectF rectF = this.f49046a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f49050f.d(this.f49051n.f43161o0.getCurrentItem())).toString(), rectF.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF.top, this.f49047b);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        a(false);
    }
}
