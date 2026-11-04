package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class e90 extends Drawable {
    public Paint f33317a;
    public Paint f33318b;
    public long f33319c;
    public float d;
    public boolean f33320e;
    public boolean f33321f;
    public float f33322g;
    public float h;
    public float f33323i;
    public float f33324j;
    public float f33325k;
    public long f33326l;
    public org.telegram.ui.Cells.q1 f33327m;

    public final void a() {
        int i3;
        int i10;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f10 = bounds.left - centerX;
        float f11 = bounds.top - centerY;
        this.f33322g = (float) Math.ceil(Math.sqrt(com.google.android.recaptcha.internal.a.y(i10, centerY, f11, f10 * (i3 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e90.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f33317a.setAlpha(i3);
    }

    @Override
    public final void setBounds(int i3, int i10, int i11, int i12) {
        super.setBounds(i3, i10, i11, i12);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33317a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
