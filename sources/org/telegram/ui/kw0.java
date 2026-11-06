package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Arrays;
public final class kw0 extends View implements org.telegram.ui.Components.of0 {
    public final float[] D;
    public boolean E;
    public float F;
    public float G;
    public float[] H;
    public long I;
    public float J;
    public int K;
    public float L;
    public int M;
    public float N;
    public int O;
    public final ProfileActivity P;
    public final int f47297a;
    public final Rect f47298b;
    public final Rect f47299c;
    public final RectF d;
    public final GradientDrawable f47300e;
    public final GradientDrawable f47301f;
    public final ValueAnimator h;
    public final float[] f47302n;
    public final Paint f47303r;
    public final Paint f47304s;
    public final Paint f47305w;
    public final GradientDrawable[] f47306x;
    public final boolean[] f47307y;

    public kw0(org.telegram.ui.ProfileActivity r7, android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kw0.<init>(org.telegram.ui.ProfileActivity, android.content.Context):void");
    }

    @Override
    public final void a() {
        Arrays.fill(this.f47307y, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z9) {
        this.f47307y[!z9 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void c() {
        RectF rectF = ProfileActivity.S6;
        this.P.I5(false);
    }

    @Override
    public final void d() {
        invalidate();
    }

    public final void e(boolean z9, float f10) {
        int i7 = (int) (255.0f * f10);
        this.f47300e.setAlpha(i7);
        this.f47301f.setAlpha(i7);
        this.f47303r.setAlpha((int) (66.0f * f10));
        this.f47304s.setAlpha((int) (85.0f * f10));
        this.f47305w.setAlpha(i7);
        this.G = f10;
        if (!z9) {
            this.F = f10;
        }
        invalidate();
    }

    public final void f(boolean z9, float f10) {
        if (z9 != this.E) {
            this.E = z9;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f11 = this.F;
            float[] fArr = this.f47302n;
            float U1 = org.telegram.messenger.g0.U1(f11, fArr);
            float f12 = 1.0f;
            if (z9) {
                valueAnimator.setDuration(((1.0f - U1) * 250.0f) / f10);
            } else {
                valueAnimator.setDuration((250.0f * U1) / f10);
            }
            fArr[0] = U1;
            if (!z9) {
                f12 = 0.0f;
            }
            fArr[1] = f12;
            valueAnimator.start();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kw0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f47297a;
        Rect rect = this.f47298b;
        rect.set(0, 0, i7, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.f47299c;
        rect2.set(0, (int) (i10 - (org.telegram.messenger.g0.L(72.0f) * 0.5f)), i7, i10);
        this.f47300e.setBounds(0, rect.bottom, i7, org.telegram.messenger.g0.L(16.0f) + currentActionBarHeight);
        RectF rectF = ProfileActivity.S6;
        this.f47301f.setBounds(0, ((i10 - this.P.e4()) - org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(24.0f), i7, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f47306x;
        int i13 = i7 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i7 - i13, 0, i7, i10);
    }
}
