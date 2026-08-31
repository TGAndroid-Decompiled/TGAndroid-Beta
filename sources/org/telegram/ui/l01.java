package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l01 extends View {
    public final RectF f38541a;
    public final TextPaint f38542b;
    public final Paint f38543c;
    public final ValueAnimator d;
    public final float[] f38544e;
    public final m2.a f38545f;
    public boolean h;
    public final ProfileActivity f38546n;

    public l01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f38546n = profileActivity;
        this.f38541a = new RectF();
        this.f38544e = new float[]{0.0f, 1.0f};
        m2.a adapter = profileActivity.f34632k0.getAdapter();
        this.f38545f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f38542b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f38543c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.pr.f30186j);
        ofFloat.addUpdateListener(new e3(this, 29));
        ofFloat.addListener(new org.telegram.ui.Components.x20(25, this, profileActivity.f34633k1));
        profileActivity.f34632k0.b(new k01(this));
        adapter.f13418a.registerObserver(new h1.a(this, 3));
    }

    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f38546n;
        if (z4) {
            j01 j01Var = profileActivity.K;
            j01Var.G = j01Var.I;
            j01Var.H = j01Var.J;
            j01Var.K = 0.0f;
            j01Var.L = 1;
        }
        profileActivity.K.invalidate();
        float measureText = this.f38542b.measureText(((String) this.f38545f.d(profileActivity.f34632k0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f38541a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
                float dp = AndroidUtilities.dp(15.0f) + i10;
                rectF.top = dp;
                rectF.bottom = dp + AndroidUtilities.dp(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i10 = 0;
        float dp2 = AndroidUtilities.dp(15.0f) + i10;
        rectF.top = dp2;
        rectF.bottom = dp2 + AndroidUtilities.dp(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f10) {
        boolean z4;
        ProfileActivity profileActivity = this.f38546n;
        if (profileActivity.f34646m2 && profileActivity.f34632k0.getRealCount() > 20) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != this.h) {
            this.h = z4;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f38544e;
            float lerp = AndroidUtilities.lerp(fArr, animatedFraction);
            float f11 = 1.0f;
            if (f10 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z4) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f10);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f10);
            }
            fArr[0] = lerp;
            if (!z4) {
                f11 = 0.0f;
            }
            fArr[1] = f11;
            valueAnimator.start();
        }
    }

    public final void c() {
        zy0 zy0Var;
        ProfileActivity profileActivity = this.f38546n;
        if (profileActivity.Q0 != null && (zy0Var = profileActivity.f34632k0) != null && profileActivity.f34646m2) {
            if (zy0Var.getRealPosition() == 0) {
                profileActivity.Q0.r(33);
                profileActivity.Q0.K(36);
                return;
            }
            profileActivity.Q0.K(33);
            profileActivity.Q0.r(36);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        Paint paint = this.f38543c;
        RectF rectF = this.f38541a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f38545f.d(this.f38546n.f34632k0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f38542b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
