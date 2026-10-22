package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class bh0 extends Drawable {
    public final Paint f24945a;
    public final int f24946b;
    public boolean f24947c;
    public float d;
    public long e;
    public View f24948f;
    public int f24949g = 255;
    public float h = 300.0f;

    public bh0(int i10) {
        this.f24946b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f24945a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f24947c != z10) {
            this.f24947c = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bh0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f24946b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f24946b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24949g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24945a.setColorFilter(colorFilter);
    }
}
