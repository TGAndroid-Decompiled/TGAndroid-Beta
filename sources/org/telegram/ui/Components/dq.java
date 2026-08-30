package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public abstract class dq extends Drawable {
    public final Paint f24345a;
    public long f24346b;
    public final RectF f24347c;
    public float d;
    public boolean e;
    public int f24348f;
    public int f24349g;

    public dq() {
        this(2.0f);
    }

    public abstract int a();

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq.draw(android.graphics.Canvas):void");
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

    public dq(float f10) {
        Paint paint = new Paint(1);
        this.f24345a = paint;
        new DecelerateInterpolator();
        this.f24347c = new RectF();
        this.f24349g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(f10));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f24348f = AndroidUtilities.dp(8.0f);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
