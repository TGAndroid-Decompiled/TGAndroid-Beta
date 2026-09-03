package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
public final class o01 extends View implements org.telegram.ui.Components.sh0 {
    public boolean B;
    public float C;
    public float D;
    public float[] E;
    public long F;
    public float G;
    public int H;
    public float I;
    public int J;
    public float K;
    public int L;
    public final ProfileActivity M;
    public final int f39491a;
    public final Rect f39492b;
    public final Rect f39493c;
    public final RectF d;
    public final GradientDrawable f39494e;
    public final GradientDrawable f39495f;
    public final ValueAnimator h;
    public final float[] f39496n;
    public final Paint f39497r;
    public final Paint f39498s;
    public final Paint v;
    public final GradientDrawable[] f39499w;
    public final boolean[] f39500x;
    public final float[] f39501y;

    public o01(org.telegram.ui.ProfileActivity r7, android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o01.<init>(org.telegram.ui.ProfileActivity, android.content.Context):void");
    }

    @Override
    public final void a() {
        Arrays.fill(this.f39500x, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z4) {
        this.f39500x[!z4 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void c() {
        this.M.i5(false);
    }

    @Override
    public final void d() {
        invalidate();
    }

    public final void e(float f10, boolean z4) {
        int i10 = (int) (255.0f * f10);
        this.f39494e.setAlpha(i10);
        this.f39495f.setAlpha(i10);
        this.f39497r.setAlpha((int) (66.0f * f10));
        this.f39498s.setAlpha((int) (85.0f * f10));
        this.v.setAlpha(i10);
        this.D = f10;
        if (!z4) {
            this.C = f10;
        }
        invalidate();
    }

    public final void f(float f10, boolean z4) {
        if (z4 != this.B) {
            this.B = z4;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f11 = this.C;
            float[] fArr = this.f39496n;
            float lerp = AndroidUtilities.lerp(fArr, f11);
            float f12 = 1.0f;
            if (z4) {
                valueAnimator.setDuration(((1.0f - lerp) * 250.0f) / f10);
            } else {
                valueAnimator.setDuration((250.0f * lerp) / f10);
            }
            fArr[0] = lerp;
            if (!z4) {
                f12 = 0.0f;
            }
            fArr[1] = f12;
            valueAnimator.start();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o01.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f39491a;
        Rect rect = this.f39492b;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.f39493c;
        rect2.set(0, (int) (i11 - (AndroidUtilities.dp(72.0f) * 0.5f)), i10, i11);
        this.f39494e.setBounds(0, rect.bottom, i10, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.f39495f.setBounds(0, ((i11 - this.M.O3()) - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.f39499w;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }
}
