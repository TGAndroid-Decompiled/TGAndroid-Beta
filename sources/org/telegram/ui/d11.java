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
public final class d11 extends View {
    public final RectF f35606a;
    public final TextPaint f35607b;
    public final Paint f35608c;
    public final ValueAnimator d;
    public final float[] f35609e;
    public final z4.a f35610f;
    public boolean h;
    public final ProfileActivity f35611n;

    public d11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f35611n = profileActivity;
        this.f35606a = new RectF();
        this.f35609e = new float[]{0.0f, 1.0f};
        z4.a adapter = profileActivity.f33948n0.getAdapter();
        this.f35610f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f35607b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f35608c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.pr.f29469j);
        ofFloat.addUpdateListener(new c3(this, 29));
        ofFloat.addListener(new e50(6, this, profileActivity.f33949n1));
        profileActivity.f33948n0.b(new c11(this));
        adapter.f50713a.registerObserver(new h1.a(this, 2));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f35611n;
        if (z10) {
            b11 b11Var = profileActivity.N;
            b11Var.J = b11Var.L;
            b11Var.K = b11Var.M;
            b11Var.N = 0.0f;
            b11Var.O = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.f35607b.measureText(((String) this.f35610f.d(profileActivity.f33948n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f35606a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
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
        ProfileActivity profileActivity = this.f35611n;
        if (profileActivity.f33964p2 && profileActivity.f33948n0.getRealCount() > 20) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f35609e;
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
        qz0 qz0Var;
        ProfileActivity profileActivity = this.f35611n;
        if (profileActivity.T0 != null && (qz0Var = profileActivity.f33948n0) != null && profileActivity.f33964p2) {
            if (qz0Var.getRealPosition() == 0) {
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
        Paint paint = this.f35608c;
        RectF rectF = this.f35606a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f35610f.d(this.f35611n.f33948n0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f35607b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
