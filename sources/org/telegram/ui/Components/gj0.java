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
public final class gj0 extends Drawable {
    public final Drawable f25300a;
    public final Drawable f25301b;
    public final Paint f25302c;
    public final RectF d;
    public int e;
    public long f25303f;
    public float f25304g;
    public boolean h;
    public boolean f25305i;

    public gj0(Context context) {
        Paint paint = new Paint(1);
        this.f25302c = paint;
        this.d = new RectF();
        this.e = 0;
        this.f25300a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.f25301b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f25303f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.Cells.d0.u(2, bounds.centerX(), drawable), org.telegram.ui.Cells.d0.d(2, bounds.centerY(), drawable), org.telegram.ui.Cells.d0.y(2, bounds.centerX(), drawable), org.telegram.ui.Cells.d0.x(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f7;
        this.f25305i = z10;
        this.h = z11;
        this.f25303f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f25304g = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gj0.draw(android.graphics.Canvas):void");
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
        this.f25300a.setColorFilter(colorFilter);
        this.f25301b.setColorFilter(colorFilter);
        this.f25302c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
