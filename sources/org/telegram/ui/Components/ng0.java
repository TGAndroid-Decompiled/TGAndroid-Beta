package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class ng0 extends Drawable {
    public final Paint f27254a;
    public final int f27255b;
    public boolean f27256c;
    public float d;
    public long e;
    public View f27257f;
    public int f27258g = 255;
    public float h = 300.0f;

    public ng0(int i10) {
        this.f27255b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f27254a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z4, boolean z10) {
        float f10;
        if (this.f27256c != z4) {
            this.f27256c = z4;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ng0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f27255b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27255b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27258g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27254a.setColorFilter(colorFilter);
    }
}
