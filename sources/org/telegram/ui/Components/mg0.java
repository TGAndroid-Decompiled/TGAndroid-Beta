package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class mg0 extends Drawable {
    public final Paint f27013a;
    public final int f27014b;
    public boolean f27015c;
    public float d;
    public long e;
    public View f27016f;
    public int f27017g = 255;
    public float h = 300.0f;

    public mg0(int i10) {
        this.f27014b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f27013a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z4, boolean z10) {
        float f10;
        if (this.f27015c != z4) {
            this.f27015c = z4;
            if (!z10) {
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.d = f10;
            }
            this.e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mg0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f27014b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27014b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27017g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27013a.setColorFilter(colorFilter);
    }
}
