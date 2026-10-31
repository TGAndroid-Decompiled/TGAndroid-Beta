package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
public final class kf0 extends Drawable {
    public final Paint f27741a;
    public final int f27742b;
    public boolean f27743c;
    public float d;
    public long e;
    public View f27744f;
    public int f27745g = 255;
    public float h = 300.0f;

    public kf0(int i10) {
        this.f27742b = org.telegram.messenger.i0.L(i10);
        Paint paint = new Paint(1);
        this.f27741a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f27743c != z10) {
            this.f27743c = z10;
            if (!z11) {
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.d = f7;
            }
            this.e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kf0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f27742b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27742b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27745g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27741a.setColorFilter(colorFilter);
    }
}
