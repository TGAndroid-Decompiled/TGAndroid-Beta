package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class aa0 extends Drawable {
    public Paint f24326a;
    public Paint f24327b;
    public long f24328c;
    public float d;
    public boolean e;
    public boolean f24329f;
    public float f24330g;
    public float h;
    public float f24331i;
    public float f24332j;
    public float f24333k;
    public long f24334l;
    public org.telegram.ui.Cells.q1 f24335m;

    public final void a() {
        int i10;
        int i11;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f7 = bounds.left - centerX;
        float f10 = bounds.top - centerY;
        this.f24330g = (float) Math.ceil(Math.sqrt(c3.i0.z(i11, centerY, f10, f7 * (i10 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aa0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24326a.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24326a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
