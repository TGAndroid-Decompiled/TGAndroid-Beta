package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public abstract class zp extends Drawable {
    public final Paint f35383a;
    public long f35384b;
    public final RectF f35385c;
    public float d;
    public boolean f35386e;
    public int f35387f;
    public int f35388g;

    public zp() {
        this(2.0f);
    }

    public abstract int a();

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zp.draw(android.graphics.Canvas):void");
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

    public zp(float f9) {
        Paint paint = new Paint(1);
        this.f35383a = paint;
        new DecelerateInterpolator();
        this.f35385c = new RectF();
        this.f35388g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(f9));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f35387f = AndroidUtilities.dp(8.0f);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
