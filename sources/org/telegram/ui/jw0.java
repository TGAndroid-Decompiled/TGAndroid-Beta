package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Arrays;
public final class jw0 extends View implements org.telegram.ui.Components.rf0 {
    public final float[] E;
    public boolean F;
    public float G;
    public float H;
    public float[] I;
    public long J;
    public float K;
    public int L;
    public float M;
    public int N;
    public float O;
    public int P;
    public final ProfileActivity Q;
    public final int f48423a;
    public final Rect f48424b;
    public final Rect f48425c;
    public final RectF d;
    public final GradientDrawable f48426e;
    public final GradientDrawable f48427f;
    public final ValueAnimator h;
    public final float[] f48428n;
    public final Paint f48429r;
    public final Paint f48430s;
    public final Paint f48431w;
    public final GradientDrawable[] f48432x;
    public final boolean[] f48433y;

    public jw0(org.telegram.ui.ProfileActivity r7, android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jw0.<init>(org.telegram.ui.ProfileActivity, android.content.Context):void");
    }

    @Override
    public final void a() {
        Arrays.fill(this.f48433y, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.f48433y[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void c() {
        RectF rectF = ProfileActivity.X6;
        this.Q.L5(false);
    }

    @Override
    public final void d() {
        invalidate();
    }

    public final void e(boolean z10, float f10) {
        int i7 = (int) (255.0f * f10);
        this.f48426e.setAlpha(i7);
        this.f48427f.setAlpha(i7);
        this.f48429r.setAlpha((int) (66.0f * f10));
        this.f48430s.setAlpha((int) (85.0f * f10));
        this.f48431w.setAlpha(i7);
        this.H = f10;
        if (!z10) {
            this.G = f10;
        }
        invalidate();
    }

    public final void f(boolean z10, float f10) {
        if (z10 != this.F) {
            this.F = z10;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f11 = this.G;
            float[] fArr = this.f48428n;
            float U1 = org.telegram.messenger.g0.U1(f11, fArr);
            float f12 = 1.0f;
            if (z10) {
                valueAnimator.setDuration(((1.0f - U1) * 250.0f) / f10);
            } else {
                valueAnimator.setDuration((250.0f * U1) / f10);
            }
            fArr[0] = U1;
            if (!z10) {
                f12 = 0.0f;
            }
            fArr[1] = f12;
            valueAnimator.start();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jw0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f48423a;
        Rect rect = this.f48424b;
        rect.set(0, 0, i7, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.f48425c;
        rect2.set(0, (int) (i10 - (org.telegram.messenger.g0.L(72.0f) * 0.5f)), i7, i10);
        this.f48426e.setBounds(0, rect.bottom, i7, org.telegram.messenger.g0.L(16.0f) + currentActionBarHeight);
        RectF rectF = ProfileActivity.X6;
        this.f48427f.setBounds(0, ((i10 - this.Q.d4()) - org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(24.0f), i7, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f48432x;
        int i13 = i7 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i7 - i13, 0, i7, i10);
    }
}
