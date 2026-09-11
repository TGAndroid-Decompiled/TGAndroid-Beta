package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class fg0 extends Drawable {
    public final Paint f26037a;
    public final int f26038b;
    public boolean f26039c;
    public float d;
    public long f26040e;
    public View f26041f;
    public int f26042g = 255;
    public float h = 300.0f;

    public fg0(int i10) {
        this.f26038b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f26037a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f26039c != z10) {
            this.f26039c = z10;
            if (!z11) {
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.d = f7;
            }
            this.f26040e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fg0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f26038b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f26038b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26042g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26037a.setColorFilter(colorFilter);
    }
}
