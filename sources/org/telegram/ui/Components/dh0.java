package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class dh0 extends Drawable {
    public final Paint f25734a;
    public final int f25735b;
    public boolean f25736c;
    public float d;
    public long e;
    public View f25737f;
    public int f25738g = 255;
    public float h = 300.0f;

    public dh0(int i10) {
        this.f25735b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f25734a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f25736c != z10) {
            this.f25736c = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dh0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f25735b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25735b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25738g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25734a.setColorFilter(colorFilter);
    }
}
