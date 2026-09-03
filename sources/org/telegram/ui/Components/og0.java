package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class og0 extends Drawable {
    public final Paint f29753a;
    public final int f29754b;
    public boolean f29755c;
    public float d;
    public long f29756e;
    public View f29757f;
    public int f29758g = 255;
    public float h = 300.0f;

    public og0(int i10) {
        this.f29754b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f29753a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z4, boolean z10) {
        float f10;
        if (this.f29755c != z4) {
            this.f29755c = z4;
            if (!z10) {
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f29756e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.og0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f29754b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29754b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29758g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29753a.setColorFilter(colorFilter);
    }
}
