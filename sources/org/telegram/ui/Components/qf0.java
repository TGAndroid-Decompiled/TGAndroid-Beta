package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class qf0 extends Drawable {
    public final Paint f31931a;
    public final int f31932b;
    public boolean f31933c;
    public float d;
    public long f31934e;
    public View f31935f;
    public int f31936g = 255;
    public float h = 300.0f;

    public qf0(int i9) {
        this.f31932b = AndroidUtilities.dp(i9);
        Paint paint = new Paint(1);
        this.f31931a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        if (this.f31933c != z10) {
            this.f31933c = z10;
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.f31934e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qf0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f31932b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f31932b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f31936g = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31931a.setColorFilter(colorFilter);
    }
}
