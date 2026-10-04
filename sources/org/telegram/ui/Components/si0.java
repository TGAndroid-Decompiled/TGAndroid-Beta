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
public final class si0 extends Drawable {
    public final Drawable f30732a;
    public final Drawable f30733b;
    public final Paint f30734c;
    public final RectF d;
    public int f30735e;
    public long f30736f;
    public float f30737g;
    public boolean h;
    public boolean f30738i;

    public si0(Context context) {
        Paint paint = new Paint(1);
        this.f30734c = paint;
        this.d = new RectF();
        this.f30735e = 0;
        this.f30732a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.f30733b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f30736f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.Cells.c1.e(2, bounds.centerX(), drawable), org.telegram.messenger.ok.d(2, bounds.centerY(), drawable), org.telegram.ui.Cells.c1.w(2, bounds.centerX(), drawable), org.telegram.ui.Cells.c1.t(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f7;
        this.f30738i = z10;
        this.h = z11;
        this.f30736f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f30737g = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si0.draw(android.graphics.Canvas):void");
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
        this.f30732a.setColorFilter(colorFilter);
        this.f30733b.setColorFilter(colorFilter);
        this.f30734c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
