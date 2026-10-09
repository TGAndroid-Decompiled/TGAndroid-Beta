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
public final class b11 extends View {
    public final RectF f36088a;
    public final TextPaint f36089b;
    public final Paint f36090c;
    public final ValueAnimator d;
    public final float[] f36091e;
    public final z4.a f36092f;
    public boolean h;
    public final ProfileActivity f36093n;

    public b11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f36093n = profileActivity;
        this.f36088a = new RectF();
        this.f36091e = new float[]{0.0f, 1.0f};
        z4.a adapter = profileActivity.f34303n0.getAdapter();
        this.f36092f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f36089b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f36090c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.hs.f27121j);
        ofFloat.addUpdateListener(new c3(this, 29));
        ofFloat.addListener(new f70(5, this, profileActivity.f34304n1));
        profileActivity.f34303n0.b(new a11(this));
        adapter.f53516a.registerObserver(new h1.a(this, 2));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f36093n;
        if (z10) {
            z01 z01Var = profileActivity.N;
            z01Var.J = z01Var.L;
            z01Var.K = z01Var.M;
            z01Var.N = 0.0f;
            z01Var.O = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.f36089b.measureText(((String) this.f36092f.d(profileActivity.f34303n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f36088a;
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
        ProfileActivity profileActivity = this.f36093n;
        if (profileActivity.f34319p2 && profileActivity.f34303n0.getRealCount() > 20) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f36091e;
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
        pz0 pz0Var;
        ProfileActivity profileActivity = this.f36093n;
        if (profileActivity.T0 != null && (pz0Var = profileActivity.f34303n0) != null && profileActivity.f34319p2) {
            if (pz0Var.getRealPosition() == 0) {
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
        Paint paint = this.f36090c;
        RectF rectF = this.f36088a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f36092f.d(this.f36093n.f34303n0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f36089b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
