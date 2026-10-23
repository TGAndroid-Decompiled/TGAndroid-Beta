package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
public final class eh0 extends Drawable {
    public final Paint f25973a;
    public final int f25974b;
    public boolean f25975c;
    public float d;
    public long e;
    public View f25976f;
    public int f25977g = 255;
    public float h = 300.0f;

    public eh0(int i10) {
        this.f25974b = AndroidUtilities.dp(i10);
        Paint paint = new Paint(1);
        this.f25973a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z10, boolean z11) {
        float f7;
        if (this.f25975c != z10) {
            this.f25975c = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eh0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f25974b;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f25974b;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25977g = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25973a.setColorFilter(colorFilter);
    }
}
