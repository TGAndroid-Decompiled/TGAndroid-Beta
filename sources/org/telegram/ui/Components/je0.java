package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
public final class je0 extends Drawable {
    public final Paint f35050a;
    public final int f35051b;
    public boolean f35052c;
    public float d;
    public long f35053e;
    public View f35054f;
    public int f35055g = 255;
    public float h = 300.0f;

    public je0(int i3) {
        this.f35051b = org.telegram.messenger.g0.L(i3);
        Paint paint = new Paint(1);
        this.f35050a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        if (this.f35052c != z10) {
            this.f35052c = z10;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f35053e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.je0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f35051b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f35051b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f35055g = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f35050a.setColorFilter(colorFilter);
    }
}
