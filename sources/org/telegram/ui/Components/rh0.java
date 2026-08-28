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
public final class rh0 extends Drawable {
    public final Drawable f32176a;
    public final Drawable f32177b;
    public final Paint f32178c;
    public final RectF d;
    public int f32179e;
    public long f32180f;
    public float f32181g;
    public boolean h;
    public boolean f32182i;

    public rh0(Context context) {
        Paint paint = new Paint(1);
        this.f32178c = paint;
        this.d = new RectF();
        this.f32179e = 0;
        this.f32176a = context.getResources().getDrawable(R.drawable.outline_shield_plain_24).mutate();
        this.f32177b = context.getResources().getDrawable(R.drawable.outline_shield_check).mutate();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f32180f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(org.telegram.messenger.ll.x(2, bounds.centerX(), drawable), org.telegram.messenger.ll.e(2, bounds.centerY(), drawable), org.telegram.messenger.ll.B(2, bounds.centerX(), drawable), org.telegram.messenger.ll.z(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z10, boolean z11, boolean z12) {
        float f10;
        this.f32182i = z10;
        this.h = z11;
        this.f32180f = SystemClock.elapsedRealtime();
        if (!z12) {
            if (this.h) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f32181g = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rh0.draw(android.graphics.Canvas):void");
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
        this.f32176a.setColorFilter(colorFilter);
        this.f32177b.setColorFilter(colorFilter);
        this.f32178c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i9) {
    }
}
