package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public abstract class fq extends Drawable {
    public final Paint f26974a;
    public long f26975b;
    public final RectF f26976c;
    public float d;
    public boolean f26977e;
    public int f26978f;
    public int f26979g;

    public fq() {
        this(2.0f);
    }

    public abstract int a();

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fq.draw(android.graphics.Canvas):void");
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

    public fq(float f10) {
        Paint paint = new Paint(1);
        this.f26974a = paint;
        new DecelerateInterpolator();
        this.f26976c = new RectF();
        this.f26979g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(f10));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f26978f = AndroidUtilities.dp(8.0f);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
