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
public final class i11 extends View {
    public final RectF f33514a;
    public final TextPaint f33515b;
    public final Paint f33516c;
    public final ValueAnimator d;
    public final float[] e;
    public final z4.a f33517f;
    public boolean h;
    public final ProfileActivity f33518n;

    public i11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f33518n = profileActivity;
        this.f33514a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        z4.a adapter = profileActivity.f30441n0.getAdapter();
        this.f33517f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f33515b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f33516c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.wr.f28822j);
        ofFloat.addUpdateListener(new d3(this, 29));
        ofFloat.addListener(new iw0(1, this, profileActivity.f30442n1));
        profileActivity.f30441n0.b(new h11(this));
        adapter.f47227a.registerObserver(new h1.a(this, 2));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        org.telegram.ui.ActionBar.l lVar2;
        ProfileActivity profileActivity = this.f33518n;
        if (z10) {
            g11 g11Var = profileActivity.N;
            g11Var.J = g11Var.L;
            g11Var.K = g11Var.M;
            g11Var.N = 0.0f;
            g11Var.O = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.f33515b.measureText(((String) this.f33517f.d(profileActivity.f30441n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f33514a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        lVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
            if (lVar2.getOccupyStatusBar()) {
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

    public final void b(float f7) {
        boolean z10;
        ProfileActivity profileActivity = this.f33518n;
        if (profileActivity.f30457p2 && profileActivity.f30441n0.getRealCount() > 20) {
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
            float lerp = AndroidUtilities.lerp(fArr, animatedFraction);
            float f10 = 1.0f;
            if (f7 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f7);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f7);
            }
            fArr[0] = lerp;
            if (!z10) {
                f10 = 0.0f;
            }
            fArr[1] = f10;
            valueAnimator.start();
        }
    }

    public final void c() {
        tz0 tz0Var;
        ProfileActivity profileActivity = this.f33518n;
        if (profileActivity.T0 != null && (tz0Var = profileActivity.f30441n0) != null && profileActivity.f30457p2) {
            if (tz0Var.getRealPosition() == 0) {
                profileActivity.T0.r(33);
                profileActivity.T0.K(36);
                return;
            }
            profileActivity.T0.K(33);
            profileActivity.T0.r(36);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        Paint paint = this.f33516c;
        RectF rectF = this.f33514a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f33517f.d(this.f33518n.f30441n0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f33515b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
