package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class ma0 extends Drawable {
    public Paint f30628a;
    public Paint f30629b;
    public long f30630c;
    public float d;
    public boolean f30631e;
    public boolean f30632f;
    public float f30633g;
    public float h;
    public float f30634i;
    public float f30635j;
    public float f30636k;
    public long f30637l;
    public org.telegram.ui.Cells.s1 f30638m;

    public final void a() {
        int i10;
        int i11;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f9 = bounds.left - centerX;
        float f10 = bounds.top - centerY;
        this.f30633g = (float) Math.ceil(Math.sqrt(com.google.android.recaptcha.internal.a.z(i11, centerY, f10, f9 * (i10 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f30628a.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30628a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
