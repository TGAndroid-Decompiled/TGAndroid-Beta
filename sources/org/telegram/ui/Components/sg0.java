package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class sg0 extends Drawable {
    public final Paint f30710a;
    public final int f30711b;
    public boolean f30712c;
    public float d;
    public long f30713e;
    public View f30714f;
    public int f30715g = 255;
    public float h = 300.0f;

    public sg0(int i10) {
        this.f30711b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f30710a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f30712c != z10) {
            this.f30712c = z10;
            if (!z11) {
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.d = f7;
            }
            this.f30713e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sg0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f30711b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f30711b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30715g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30710a.setColorFilter(colorFilter);
    }
}
