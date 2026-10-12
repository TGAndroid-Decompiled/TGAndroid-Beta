package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public abstract class xq extends Drawable {
    public final Paint f32814a;
    public long f32815b;
    public final RectF f32816c;
    public float d;
    public boolean f32817e;
    public int f32818f;
    public int f32819g;

    public xq() {
        this(2.0f);
    }

    public abstract int a();

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xq.draw(android.graphics.Canvas):void");
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

    public xq(float f7) {
        Paint paint = new Paint(1);
        this.f32814a = paint;
        new DecelerateInterpolator();
        this.f32816c = new RectF();
        this.f32819g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(f7));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f32818f = AndroidUtilities.dp(8.0f);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
