package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class mj0 extends Drawable {
    public final Drawable f28588a;
    public final Drawable f28589b;
    public final Paint f28590c;
    public final RectF d;
    public int f28591e;
    public long f28592f;
    public float f28593g;
    public boolean h;
    public boolean f28594i;

    public mj0(Context context) {
        Paint paint = new Paint(1);
        this.f28590c = paint;
        this.d = new RectF();
        this.f28591e = 0;
        this.f28588a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.f28589b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f28592f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.messenger.am.z(2, bounds.centerX(), drawable), org.telegram.messenger.am.d(2, bounds.centerY(), drawable), org.telegram.ui.Cells.c1.r(2, bounds.centerX(), drawable), org.telegram.ui.Cells.c1.c(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f7;
        this.f28594i = z10;
        this.h = z11;
        this.f28592f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f28593g = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mj0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28588a.setColorFilter(colorFilter);
        this.f28589b.setColorFilter(colorFilter);
        this.f28590c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
