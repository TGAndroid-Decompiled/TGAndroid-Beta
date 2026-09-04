package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class b11 extends View implements org.telegram.ui.Components.jh0 {
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
    public final int f34586a;
    public final Rect f34587b;
    public final Rect f34588c;
    public final RectF d;
    public final GradientDrawable f34589e;
    public final GradientDrawable f34590f;
    public final ValueAnimator h;
    public final float[] f34591n;
    public final Paint f34592r;
    public final Paint f34593s;
    public final Paint v;
    public final GradientDrawable[] f34594w;
    public final boolean[] f34595x;
    public final float[] f34596y;

    public b11(org.telegram.ui.ProfileActivity r7, android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b11.<init>(org.telegram.ui.ProfileActivity, android.content.Context):void");
    }

    @Override
    public final void a() {
        Arrays.fill(this.f34595x, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z10) {
        this.f34595x[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void c() {
        this.P.i5(false);
    }

    @Override
    public final void d() {
        invalidate();
    }

    public final void e(float f7, boolean z10) {
        int i10 = (int) (255.0f * f7);
        this.f34589e.setAlpha(i10);
        this.f34590f.setAlpha(i10);
        this.f34592r.setAlpha((int) (66.0f * f7));
        this.f34593s.setAlpha((int) (85.0f * f7));
        this.v.setAlpha(i10);
        this.G = f7;
        if (!z10) {
            this.F = f7;
        }
        invalidate();
    }

    public final void f(float f7, boolean z10) {
        if (z10 != this.E) {
            this.E = z10;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f10 = this.F;
            float[] fArr = this.f34591n;
            float lerp = AndroidUtilities.lerp(fArr, f10);
            float f11 = 1.0f;
            if (z10) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f7);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f7);
            }
            fArr[0] = lerp;
            if (!z10) {
                f11 = 0.0f;
            }
            fArr[1] = f11;
            valueAnimator.start();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b11.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f34586a;
        Rect rect = this.f34587b;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.f34588c;
        rect2.set(0, (int) (i11 - (AndroidUtilities.dp(72.0f) * 0.5f)), i10, i11);
        this.f34589e.setBounds(0, rect.bottom, i10, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.f34590f.setBounds(0, ((i11 - this.P.O3()) - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f34594w;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }
}
