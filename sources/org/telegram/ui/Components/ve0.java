package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
public final class ve0 extends Drawable {
    public final Paint f40667a;
    public final int f40668b;
    public boolean f40669c;
    public float d;
    public long f40670e;
    public View f40671f;
    public int f40672g = 255;
    public float h = 300.0f;

    public ve0(int i7) {
        this.f40668b = org.telegram.messenger.g0.L(i7);
        Paint paint = new Paint(1);
        this.f40667a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        if (this.f40669c != z10) {
            this.f40669c = z10;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f40670e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ve0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f40668b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f40668b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f40672g = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40667a.setColorFilter(colorFilter);
    }
}
