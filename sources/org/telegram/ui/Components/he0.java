package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
public final class he0 extends Drawable {
    public final Paint f34257a;
    public final int f34258b;
    public boolean f34259c;
    public float d;
    public long f34260e;
    public View f34261f;
    public int f34262g = 255;
    public float h = 300.0f;

    public he0(int i7) {
        this.f34258b = org.telegram.messenger.g0.L(i7);
        Paint paint = new Paint(1);
        this.f34257a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z9, boolean z10) {
        float f10;
        if (this.f34259c != z9) {
            this.f34259c = z9;
            if (!z10) {
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f34260e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.he0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34258b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34258b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34262g = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34257a.setColorFilter(colorFilter);
    }
}
