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
public final class m01 extends View {
    public final RectF f41425a;
    public final TextPaint f41426b;
    public final Paint f41427c;
    public final ValueAnimator d;
    public final float[] e;
    public final a5.a f41428f;
    public boolean h;
    public final ProfileActivity f41429n;

    public m01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f41429n = profileActivity;
        this.f41425a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        a5.a adapter = profileActivity.f36040n0.getAdapter();
        this.f41428f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f41426b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f41427c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.f27589j);
        ofFloat.addUpdateListener(new b3(this, 28));
        ofFloat.addListener(new q40(6, this, profileActivity.f36041n1));
        profileActivity.f36040n0.b(new l01(this));
        adapter.f280a.registerObserver(new a5.j(this, 3));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f41429n;
        if (z10) {
            k01 k01Var = profileActivity.M;
            k01Var.J = k01Var.L;
            k01Var.K = k01Var.M;
            k01Var.N = 0.0f;
            k01Var.O = 1;
        }
        profileActivity.M.invalidate();
        float measureText = this.f41426b.measureText(((String) this.f41428f.d(profileActivity.f36040n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f41425a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
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
        ProfileActivity profileActivity = this.f41429n;
        if (profileActivity.f36056p2 && profileActivity.f36040n0.getRealCount() > 20) {
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
        zy0 zy0Var;
        ProfileActivity profileActivity = this.f41429n;
        if (profileActivity.T0 != null && (zy0Var = profileActivity.f36040n0) != null && profileActivity.f36056p2) {
            if (zy0Var.getRealPosition() == 0) {
                profileActivity.T0.t(33);
                profileActivity.T0.S(36);
                return;
            }
            profileActivity.T0.S(33);
            profileActivity.T0.t(36);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        Paint paint = this.f41427c;
        RectF rectF = this.f41425a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f41428f.d(this.f41429n.f36040n0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f41426b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
