package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class fg0 extends Drawable {
    public final Paint f23971a;
    public final int f23972b;
    public boolean f23973c;
    public float d;
    public long e;
    public View f23974f;
    public int f23975g = 255;
    public float h = 300.0f;

    public fg0(int i10) {
        this.f23972b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f23971a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f23973c != z10) {
            this.f23973c = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fg0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f23972b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f23972b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f23975g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23971a.setColorFilter(colorFilter);
    }
}
