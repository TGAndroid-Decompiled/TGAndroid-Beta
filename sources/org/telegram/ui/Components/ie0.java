package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
public final class ie0 extends Drawable {
    public final Paint f34721a;
    public final int f34722b;
    public boolean f34723c;
    public float d;
    public long f34724e;
    public View f34725f;
    public int f34726g = 255;
    public float h = 300.0f;

    public ie0(int i7) {
        this.f34722b = org.telegram.messenger.g0.L(i7);
        Paint paint = new Paint(1);
        this.f34721a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z9, boolean z10) {
        float f10;
        if (this.f34723c != z9) {
            this.f34723c = z9;
            if (!z10) {
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f34724e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ie0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34722b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34722b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34726g = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34721a.setColorFilter(colorFilter);
    }
}
