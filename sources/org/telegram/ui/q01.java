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
public final class q01 extends View {
    public final RectF f40287a;
    public final TextPaint f40288b;
    public final Paint f40289c;
    public final ValueAnimator d;
    public final float[] f40290e;
    public final m2.a f40291f;
    public boolean h;
    public final ProfileActivity f40292n;

    public q01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f40292n = profileActivity;
        this.f40287a = new RectF();
        this.f40290e = new float[]{0.0f, 1.0f};
        m2.a adapter = profileActivity.f34632k0.getAdapter();
        this.f40291f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f40288b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f40289c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.pr.f30171j);
        ofFloat.addUpdateListener(new e3(this, 29));
        ofFloat.addListener(new org.telegram.ui.Components.x20(25, this, profileActivity.f34633k1));
        profileActivity.f34632k0.b(new p01(this));
        adapter.f13420a.registerObserver(new h1.a(this, 3));
    }

    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f40292n;
        if (z4) {
            o01 o01Var = profileActivity.K;
            o01Var.G = o01Var.I;
            o01Var.H = o01Var.J;
            o01Var.K = 0.0f;
            o01Var.L = 1;
        }
        profileActivity.K.invalidate();
        float measureText = this.f40288b.measureText(((String) this.f40291f.d(profileActivity.f34632k0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f40287a;
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
        ProfileActivity profileActivity = this.f40292n;
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
            float[] fArr = this.f40290e;
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
        dz0 dz0Var;
        ProfileActivity profileActivity = this.f40292n;
        if (profileActivity.Q0 != null && (dz0Var = profileActivity.f34632k0) != null && profileActivity.f34646m2) {
            if (dz0Var.getRealPosition() == 0) {
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
        Paint paint = this.f40289c;
        RectF rectF = this.f40287a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f40291f.d(this.f40292n.f34632k0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f40288b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
