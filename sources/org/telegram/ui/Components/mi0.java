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
public final class mi0 extends Drawable {
    public final Drawable f27032a;
    public final Drawable f27033b;
    public final Paint f27034c;
    public final RectF d;
    public int e;
    public long f27035f;
    public float f27036g;
    public boolean h;
    public boolean f27037i;

    public mi0(Context context) {
        Paint paint = new Paint(1);
        this.f27034c = paint;
        this.d = new RectF();
        this.e = 0;
        this.f27032a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.f27033b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f27035f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.ui.b.u(2, bounds.centerX(), drawable), org.telegram.ui.b.f(2, bounds.centerY(), drawable), org.telegram.ui.b.A(2, bounds.centerX(), drawable), org.telegram.ui.b.y(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z4, boolean z10, boolean z11) {
        float f10;
        this.f27037i = z4;
        this.h = z10;
        this.f27035f = SystemClock.elapsedRealtime();
        if (!z11) {
            if (this.h) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f27036g = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi0.draw(android.graphics.Canvas):void");
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
        this.f27032a.setColorFilter(colorFilter);
        this.f27033b.setColorFilter(colorFilter);
        this.f27034c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
