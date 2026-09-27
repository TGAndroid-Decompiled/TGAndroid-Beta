package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class sg0 extends Drawable {
    public final Paint f28245a;
    public final int f28246b;
    public boolean f28247c;
    public float d;
    public long e;
    public View f28248f;
    public int f28249g = 255;
    public float h = 300.0f;

    public sg0(int i10) {
        this.f28246b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f28245a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f28247c != z10) {
            this.f28247c = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sg0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f28246b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f28246b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28249g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28245a.setColorFilter(colorFilter);
    }
}
