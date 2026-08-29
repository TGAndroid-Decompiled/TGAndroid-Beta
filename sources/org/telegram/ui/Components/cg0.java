package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class cg0 extends Drawable {
    public final Paint f27478a;
    public final int f27479b;
    public boolean f27480c;
    public float d;
    public long f27481e;
    public View f27482f;
    public int f27483g = 255;
    public float h = 300.0f;

    public cg0(int i10) {
        this.f27479b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f27478a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f9;
        if (this.f27480c != z10) {
            this.f27480c = z10;
            if (!z11) {
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                this.d = f9;
            }
            this.f27481e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cg0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f27479b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27479b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27483g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27478a.setColorFilter(colorFilter);
    }
}
