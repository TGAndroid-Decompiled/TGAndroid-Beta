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
public final class j01 extends View {
    public final RectF f35192a;
    public final TextPaint f35193b;
    public final Paint f35194c;
    public final ValueAnimator d;
    public final float[] e;
    public final m2.a f35195f;
    public boolean h;
    public final ProfileActivity f35196n;

    public j01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f35196n = profileActivity;
        this.f35192a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        m2.a adapter = profileActivity.f32099k0.getAdapter();
        this.f35195f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f35193b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f35194c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.nr.f27349j);
        ofFloat.addUpdateListener(new e3(this, 29));
        ofFloat.addListener(new org.telegram.ui.Components.l00(27, this, profileActivity.f32100k1));
        profileActivity.f32099k0.b(new i01(this));
        adapter.f13711a.registerObserver(new h1.a(this, 3));
    }

    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f35196n;
        if (z4) {
            h01 h01Var = profileActivity.K;
            h01Var.G = h01Var.I;
            h01Var.H = h01Var.J;
            h01Var.K = 0.0f;
            h01Var.L = 1;
        }
        profileActivity.K.invalidate();
        float measureText = this.f35193b.measureText(((String) this.f35195f.d(profileActivity.f32099k0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f35192a;
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
        ProfileActivity profileActivity = this.f35196n;
        if (profileActivity.f32113m2 && profileActivity.f32099k0.getRealCount() > 20) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != this.h) {
            this.h = z4;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.e;
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
        xy0 xy0Var;
        ProfileActivity profileActivity = this.f35196n;
        if (profileActivity.Q0 != null && (xy0Var = profileActivity.f32099k0) != null && profileActivity.f32113m2) {
            if (xy0Var.getRealPosition() == 0) {
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
        Paint paint = this.f35194c;
        RectF rectF = this.f35192a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f35195f.d(this.f35196n.f32099k0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f35193b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
