package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class i90 extends Drawable {
    public Paint f34561a;
    public Paint f34562b;
    public long f34563c;
    public float d;
    public boolean f34564e;
    public boolean f34565f;
    public float f34566g;
    public float h;
    public float f34567i;
    public float f34568j;
    public float f34569k;
    public long f34570l;
    public org.telegram.ui.Cells.q1 f34571m;

    public final void a() {
        int i7;
        int i10;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f10 = bounds.left - centerX;
        float f11 = bounds.top - centerY;
        this.f34566g = (float) Math.ceil(Math.sqrt(com.google.android.recaptcha.internal.a.z(i10, centerY, f11, f10 * (i7 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i90.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34561a.setAlpha(i7);
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34561a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
