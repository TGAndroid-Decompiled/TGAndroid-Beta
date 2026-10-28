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
public final class o01 extends View {
    public final RectF f41946a;
    public final TextPaint f41947b;
    public final Paint f41948c;
    public final ValueAnimator d;
    public final float[] e;
    public final a5.a f41949f;
    public boolean h;
    public final ProfileActivity f41950n;

    public o01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f41950n = profileActivity;
        this.f41946a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        a5.a adapter = profileActivity.f36064n0.getAdapter();
        this.f41949f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f41947b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f41948c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.ds.f27533j);
        ofFloat.addUpdateListener(new b3(this, 28));
        ofFloat.addListener(new s40(6, this, profileActivity.f36065n1));
        profileActivity.f36064n0.b(new n01(this));
        adapter.f280a.registerObserver(new a5.j(this, 3));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f41950n;
        if (z10) {
            m01 m01Var = profileActivity.M;
            m01Var.J = m01Var.L;
            m01Var.K = m01Var.M;
            m01Var.N = 0.0f;
            m01Var.O = 1;
        }
        profileActivity.M.invalidate();
        float measureText = this.f41947b.measureText(((String) this.f41949f.d(profileActivity.f36064n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f41946a;
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
        ProfileActivity profileActivity = this.f41950n;
        if (profileActivity.f36080p2 && profileActivity.f36064n0.getRealCount() > 20) {
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
        bz0 bz0Var;
        ProfileActivity profileActivity = this.f41950n;
        if (profileActivity.T0 != null && (bz0Var = profileActivity.f36064n0) != null && profileActivity.f36080p2) {
            if (bz0Var.getRealPosition() == 0) {
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
        Paint paint = this.f41948c;
        RectF rectF = this.f41946a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f41949f.d(this.f41950n.f36064n0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f41947b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
