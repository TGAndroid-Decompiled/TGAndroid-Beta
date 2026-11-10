package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Arrays;
public final class nw0 extends View implements org.telegram.ui.Components.of0 {
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
    public final int f48309a;
    public final Rect f48310b;
    public final Rect f48311c;
    public final RectF d;
    public final GradientDrawable f48312e;
    public final GradientDrawable f48313f;
    public final ValueAnimator h;
    public final float[] f48314n;
    public final Paint f48315r;
    public final Paint f48316s;
    public final Paint f48317w;
    public final GradientDrawable[] f48318x;
    public final boolean[] f48319y;

    public nw0(org.telegram.ui.ProfileActivity r7, android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nw0.<init>(org.telegram.ui.ProfileActivity, android.content.Context):void");
    }

    @Override
    public final void a() {
        Arrays.fill(this.f48319y, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z9) {
        this.f48319y[!z9 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void c() {
        RectF rectF = ProfileActivity.V6;
        this.P.L5(false);
    }

    @Override
    public final void d() {
        invalidate();
    }

    public final void e(boolean z9, float f10) {
        int i7 = (int) (255.0f * f10);
        this.f48312e.setAlpha(i7);
        this.f48313f.setAlpha(i7);
        this.f48315r.setAlpha((int) (66.0f * f10));
        this.f48316s.setAlpha((int) (85.0f * f10));
        this.f48317w.setAlpha(i7);
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
            float[] fArr = this.f48314n;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nw0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.f48309a;
        Rect rect = this.f48310b;
        rect.set(0, 0, i7, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.f48311c;
        rect2.set(0, (int) (i10 - (org.telegram.messenger.g0.L(72.0f) * 0.5f)), i7, i10);
        this.f48312e.setBounds(0, rect.bottom, i7, org.telegram.messenger.g0.L(16.0f) + currentActionBarHeight);
        RectF rectF = ProfileActivity.V6;
        this.f48313f.setBounds(0, ((i10 - this.P.e4()) - org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(24.0f), i7, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f48318x;
        int i13 = i7 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i7 - i13, 0, i7, i10);
    }
}
