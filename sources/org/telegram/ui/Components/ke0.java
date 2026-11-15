package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
public final class ke0 extends Drawable {
    public final Paint f36402a;
    public final int f36403b;
    public boolean f36404c;
    public float d;
    public long f36405e;
    public View f36406f;
    public int f36407g = 255;
    public float h = 300.0f;

    public ke0(int i7) {
        this.f36403b = org.telegram.messenger.g0.L(i7);
        Paint paint = new Paint(1);
        this.f36402a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        if (this.f36404c != z10) {
            this.f36404c = z10;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f36405e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ke0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f36403b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f36403b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f36407g = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36402a.setColorFilter(colorFilter);
    }
}
