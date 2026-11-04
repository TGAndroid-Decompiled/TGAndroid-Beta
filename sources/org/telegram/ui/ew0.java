package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
public final class ew0 extends View {
    public final RectF f45057a;
    public final TextPaint f45058b;
    public final Paint f45059c;
    public final ValueAnimator d;
    public final float[] f45060e;
    public final b5.a f45061f;
    public boolean h;
    public final ProfileActivity f45062n;

    public ew0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.f45062n = profileActivity;
        this.f45057a = new RectF();
        this.f45060e = new float[]{0.0f, 1.0f};
        b5.a adapter = profileActivity.f41817o0.getAdapter();
        this.f45061f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.f45058b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
        Paint paint = new Paint(1);
        this.f45059c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.f40455j);
        ofFloat.addUpdateListener(new b3(this, 27));
        ofFloat.addListener(new u40(5, this, profileActivity.f41812n1));
        profileActivity.f41817o0.b(new dw0(this));
        adapter.f2390a.registerObserver(new b5.i(this, 3));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i3;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.f45062n;
        if (z10) {
            cw0 cw0Var = profileActivity.N;
            cw0Var.K = cw0Var.M;
            cw0Var.L = cw0Var.N;
            cw0Var.O = 0.0f;
            cw0Var.P = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.f45058b.measureText(((String) this.f45061f.d(profileActivity.f41817o0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(54.0f);
        RectF rectF = this.f45057a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (org.telegram.messenger.g0.N(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i3 = org.telegram.messenger.g0.f22602m;
                float L = org.telegram.messenger.g0.L(15.0f) + i3;
                rectF.top = L;
                rectF.bottom = L + org.telegram.messenger.g0.L(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i3 = 0;
        float L2 = org.telegram.messenger.g0.L(15.0f) + i3;
        rectF.top = L2;
        rectF.bottom = L2 + org.telegram.messenger.g0.L(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f10) {
        boolean z10;
        ProfileActivity profileActivity = this.f45062n;
        if (profileActivity.f41826p2 && profileActivity.f41817o0.getRealCount() > 20) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.f45060e;
            float U1 = org.telegram.messenger.g0.U1(animatedFraction, fArr);
            float f11 = 0.0f;
            if (f10 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration(((1.0f - U1) * 250.0f) / f10);
            } else {
                valueAnimator.setDuration((250.0f * U1) / f10);
            }
            fArr[0] = U1;
            if (z10) {
                f11 = 1.0f;
            }
            fArr[1] = f11;
            valueAnimator.start();
        }
    }

    public final void c() {
        ru0 ru0Var;
        ProfileActivity profileActivity = this.f45062n;
        if (profileActivity.T0 != null && (ru0Var = profileActivity.f41817o0) != null && profileActivity.f41826p2) {
            if (ru0Var.getRealPosition() == 0) {
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
        float N = org.telegram.messenger.g0.N(12.0f);
        Paint paint = this.f45059c;
        RectF rectF = this.f45057a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f45061f.d(this.f45062n.f41817o0.getCurrentItem())).toString(), rectF.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF.top, this.f45058b);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        a(false);
    }
}
