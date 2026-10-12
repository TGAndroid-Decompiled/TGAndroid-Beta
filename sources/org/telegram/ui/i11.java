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
    public final RectF f37005a;
    public final TextPaint f37006b;
    public final Paint f37007c;
    public final ValueAnimator d;
    public final float[] e;
    public final z4.a f37008f;
    public boolean h;
    public final ProfileActivity f37009n;

    public i11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f37009n = profileActivity;
        this.f37005a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        z4.a adapter = profileActivity.f32620n0.getAdapter();
        this.f37008f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f37006b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f37007c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.es.f24774j);
        ofFloat.addUpdateListener(new e3(this, 29));
        ofFloat.addListener(new i50(6, this, profileActivity.f32621n1));
        profileActivity.f32620n0.b(new h11(this));
        adapter.f49280a.registerObserver(new h1.a(this, 2));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f37009n;
        if (z10) {
            g11 g11Var = profileActivity.N;
            g11Var.J = g11Var.L;
            g11Var.K = g11Var.M;
            g11Var.N = 0.0f;
            g11Var.O = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.f37006b.measureText(((String) this.f37008f.d(profileActivity.f32620n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f37005a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
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

    public final void b(float f7) {
        boolean z10;
        ProfileActivity profileActivity = this.f37009n;
        if (profileActivity.f32636p2 && profileActivity.f32620n0.getRealCount() > 20) {
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
            float f10 = 0.0f;
            if (f7 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f7);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f7);
            }
            fArr[0] = lerp;
            if (z10) {
                f10 = 1.0f;
            }
            fArr[1] = f10;
            valueAnimator.start();
        }
    }

    public final void c() {
        wz0 wz0Var;
        ProfileActivity profileActivity = this.f37009n;
        if (profileActivity.T0 != null && (wz0Var = profileActivity.f32620n0) != null && profileActivity.f32636p2) {
            if (wz0Var.getRealPosition() == 0) {
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
        Paint paint = this.f37007c;
        RectF rectF = this.f37005a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f37008f.d(this.f37009n.f32620n0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f37006b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
