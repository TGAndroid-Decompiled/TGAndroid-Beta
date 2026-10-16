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
public final class h11 extends View {
    public final RectF f36364a;
    public final TextPaint f36365b;
    public final Paint f36366c;
    public final ValueAnimator d;
    public final float[] e;
    public final z4.a f36367f;
    public boolean h;
    public final ProfileActivity f36368n;

    public h11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f36368n = profileActivity;
        this.f36364a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        z4.a adapter = profileActivity.f32322n0.getAdapter();
        this.f36367f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f36365b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.f36366c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.es.f24468j);
        ofFloat.addUpdateListener(new e3(this, 29));
        ofFloat.addListener(new i50(6, this, profileActivity.f32323n1));
        profileActivity.f32322n0.b(new g11(this));
        adapter.f49279a.registerObserver(new h1.a(this, 2));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f36368n;
        if (z10) {
            f11 f11Var = profileActivity.N;
            f11Var.J = f11Var.L;
            f11Var.K = f11Var.M;
            f11Var.N = 0.0f;
            f11Var.O = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.f36365b.measureText(((String) this.f36367f.d(profileActivity.f32322n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.f36364a;
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
        ProfileActivity profileActivity = this.f36368n;
        if (profileActivity.f32338p2 && profileActivity.f32322n0.getRealCount() > 20) {
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
        vz0 vz0Var;
        ProfileActivity profileActivity = this.f36368n;
        if (profileActivity.T0 != null && (vz0Var = profileActivity.f32322n0) != null && profileActivity.f32338p2) {
            if (vz0Var.getRealPosition() == 0) {
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
        Paint paint = this.f36366c;
        RectF rectF = this.f36364a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f36367f.d(this.f36368n.f32322n0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.f36365b);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
