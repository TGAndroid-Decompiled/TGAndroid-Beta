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
public final class h01 extends View {
    public final RectF f37708a;
    public final TextPaint f37709b;
    public final Paint f37710c;
    public final ValueAnimator d;
    public final float[] e;
    public final z4.a f37711f;
    public boolean h;
    public final ProfileActivity f37712n;

    public h01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f37712n = profileActivity;
        this.f37708a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        z4.a adapter = profileActivity.f33983o0.getAdapter();
        this.f37711f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f37709b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f37710c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.zr.f33340j);
        ofFloat.addUpdateListener(new d3(this, 29));
        ofFloat.addListener(new o40(6, this, profileActivity.f33984o1));
        profileActivity.f33983o0.b(new g01(this));
        adapter.f51131a.registerObserver(new h1.a(this, 2));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f37712n;
        if (z10) {
            f01 f01Var = profileActivity.N;
            f01Var.J = f01Var.L;
            f01Var.K = f01Var.M;
            f01Var.N = 0.0f;
            f01Var.O = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.f37709b.measureText(((String) this.f37711f.d(profileActivity.f33983o0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f37708a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
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
        ProfileActivity profileActivity = this.f37712n;
        if (profileActivity.f33998q2 && profileActivity.f33983o0.getRealCount() > 20) {
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
        vy0 vy0Var;
        ProfileActivity profileActivity = this.f37712n;
        if (profileActivity.U0 != null && (vy0Var = profileActivity.f33983o0) != null && profileActivity.f33998q2) {
            if (vy0Var.getRealPosition() == 0) {
                profileActivity.U0.r(33);
                profileActivity.U0.K(36);
                return;
            }
            profileActivity.U0.K(33);
            profileActivity.U0.r(36);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        Paint paint = this.f37710c;
        RectF rectF = this.f37708a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f37711f.d(this.f37712n.f33983o0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f37709b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
