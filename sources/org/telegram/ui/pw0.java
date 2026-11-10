package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class pw0 extends View {
    public final RectF f48844a;
    public final TextPaint f48845b;
    public final Paint f48846c;
    public final ValueAnimator d;
    public final float[] f48847e;
    public final c5.a f48848f;
    public boolean h;
    public final ProfileActivity f48849n;

    public pw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f48849n = profileActivity;
        this.f48844a = new RectF();
        this.f48847e = new float[]{0.0f, 1.0f};
        c5.a adapter = profileActivity.f41782n0.getAdapter();
        this.f48848f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f48845b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
        Paint paint = new Paint(1);
        this.f48846c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.wq.f40049j);
        ofFloat.addUpdateListener(new a3(this, 27));
        ofFloat.addListener(new c50(5, this, profileActivity.f41775m1));
        profileActivity.f41782n0.b(new ow0(this));
        adapter.f5306a.registerObserver(new c5.h(this, 3));
    }

    public final void a(boolean z9) {
        org.telegram.ui.ActionBar.l lVar;
        int i7;
        org.telegram.ui.ActionBar.l lVar2;
        ProfileActivity profileActivity = this.f48849n;
        if (z9) {
            nw0 nw0Var = profileActivity.M;
            nw0Var.J = nw0Var.L;
            nw0Var.K = nw0Var.M;
            nw0Var.N = 0.0f;
            nw0Var.O = 1;
        }
        profileActivity.M.invalidate();
        float measureText = this.f48845b.measureText(((String) this.f48848f.d(profileActivity.f41782n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(54.0f);
        RectF rectF = this.f48844a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (org.telegram.messenger.g0.N(16.0f) + measureText);
        lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
            if (lVar2.getOccupyStatusBar()) {
                i7 = org.telegram.messenger.g0.f22561m;
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
        ProfileActivity profileActivity = this.f48849n;
        if (profileActivity.f41790o2 && profileActivity.f41782n0.getRealCount() > 20) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != this.h) {
            this.h = z9;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f48847e;
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
        dv0 dv0Var;
        ProfileActivity profileActivity = this.f48849n;
        if (profileActivity.S0 != null && (dv0Var = profileActivity.f41782n0) != null && profileActivity.f41790o2) {
            if (dv0Var.getRealPosition() == 0) {
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
        Paint paint = this.f48846c;
        RectF rectF = this.f48844a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f48848f.d(this.f48849n.f41782n0.getCurrentItem())).toString(), rectF.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF.top, this.f48845b);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        a(false);
    }
}
