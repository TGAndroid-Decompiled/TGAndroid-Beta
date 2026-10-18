package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class ah0 extends Drawable {
    public final Paint f24599a;
    public final int f24600b;
    public boolean f24601c;
    public float d;
    public long e;
    public View f24602f;
    public int f24603g = 255;
    public float h = 300.0f;

    public ah0(int i10) {
        this.f24600b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f24599a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f24601c != z10) {
            this.f24601c = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ah0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f24600b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f24600b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24603g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24599a.setColorFilter(colorFilter);
    }
}
