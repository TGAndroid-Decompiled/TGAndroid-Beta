package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public abstract class rq extends Drawable {
    public final Paint f32280a;
    public long f32281b;
    public final RectF f32282c;
    public float d;
    public boolean e;
    public int f32283f;
    public int f32284g;

    public rq() {
        this(2.0f);
    }

    public abstract int a();

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rq.draw(android.graphics.Canvas):void");
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

    public rq(float f7) {
        Paint paint = new Paint(1);
        this.f32280a = paint;
        new DecelerateInterpolator();
        this.f32282c = new RectF();
        this.f32284g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(f7));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f32283f = AndroidUtilities.dp(8.0f);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
