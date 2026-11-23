package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class ow0 extends View {
    public final RectF f50665a;
    public final TextPaint f50666b;
    public final Paint f50667c;
    public final ValueAnimator d;
    public final float[] f50668e;
    public final c5.a f50669f;
    public boolean h;
    public final ProfileActivity f50670n;

    public ow0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f50670n = profileActivity;
        this.f50665a = new RectF();
        this.f50668e = new float[]{0.0f, 1.0f};
        c5.a adapter = profileActivity.f43652o0.getAdapter();
        this.f50669f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f50666b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
        Paint paint = new Paint(1);
        this.f50667c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.f37963j);
        ofFloat.addUpdateListener(new a3(this, 27));
        ofFloat.addListener(new c30(6, this, profileActivity.n1));
        profileActivity.f43652o0.b(new nw0(this));
        adapter.f4438a.registerObserver(new c5.i(this, 3));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f50670n;
        if (z10) {
            mw0 mw0Var = profileActivity.N;
            mw0Var.K = mw0Var.M;
            mw0Var.L = mw0Var.N;
            mw0Var.O = 0.0f;
            mw0Var.P = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.f50666b.measureText(((String) this.f50669f.d(profileActivity.f43652o0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(54.0f);
        RectF rectF = this.f50665a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (org.telegram.messenger.g0.N(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f24040m;
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
        ProfileActivity profileActivity = this.f50670n;
        if (profileActivity.f43667q2 && profileActivity.f43652o0.getRealCount() > 20) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f50668e;
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
        av0 av0Var;
        ProfileActivity profileActivity = this.f50670n;
        if (profileActivity.T0 != null && (av0Var = profileActivity.f43652o0) != null && profileActivity.f43667q2) {
            if (av0Var.getRealPosition() == 0) {
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
        Paint paint = this.f50667c;
        RectF rectF = this.f50665a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f50669f.d(this.f50670n.f43652o0.getCurrentItem())).toString(), rectF.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF.top, this.f50666b);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        a(false);
    }
}
