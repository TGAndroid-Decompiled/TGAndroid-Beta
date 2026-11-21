package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
public final class we0 extends Drawable {
    public final Paint f41791a;
    public final int f41792b;
    public boolean f41793c;
    public float d;
    public long f41794e;
    public View f41795f;
    public int f41796g = 255;
    public float h = 300.0f;

    public we0(int i7) {
        this.f41792b = org.telegram.messenger.g0.L(i7);
        Paint paint = new Paint(1);
        this.f41791a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        if (this.f41793c != z10) {
            this.f41793c = z10;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f41794e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.we0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f41792b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f41792b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f41796g = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f41791a.setColorFilter(colorFilter);
    }
}
