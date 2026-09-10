package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class pg0 extends Drawable {
    public final Paint f26118a;
    public final int f26119b;
    public boolean f26120c;
    public float d;
    public long e;
    public View f26121f;
    public int f26122g = 255;
    public float h = 300.0f;

    public pg0(int i10) {
        this.f26119b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f26118a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f26120c != z10) {
            this.f26120c = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pg0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f26119b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f26119b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26122g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26118a.setColorFilter(colorFilter);
    }
}
