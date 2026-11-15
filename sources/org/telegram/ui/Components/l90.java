package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class l90 extends Drawable {
    public Paint f36731a;
    public Paint f36732b;
    public long f36733c;
    public float d;
    public boolean f36734e;
    public boolean f36735f;
    public float f36736g;
    public float h;
    public float f36737i;
    public float f36738j;
    public float f36739k;
    public long f36740l;
    public org.telegram.ui.Cells.q1 f36741m;

    public final void a() {
        int i7;
        int i10;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f10 = bounds.left - centerX;
        float f11 = bounds.top - centerY;
        this.f36736g = (float) Math.ceil(Math.sqrt(com.google.android.gms.internal.vision.e2.z(i10, centerY, f11, f10 * (i7 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l90.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f36731a.setAlpha(i7);
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36731a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
