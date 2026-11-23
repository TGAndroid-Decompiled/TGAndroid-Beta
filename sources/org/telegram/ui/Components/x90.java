package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class x90 extends Drawable {
    public Paint f42015a;
    public Paint f42016b;
    public long f42017c;
    public float d;
    public boolean f42018e;
    public boolean f42019f;
    public float f42020g;
    public float h;
    public float f42021i;
    public float f42022j;
    public float f42023k;
    public long f42024l;
    public org.telegram.ui.Cells.r1 f42025m;

    public final void a() {
        int i7;
        int i10;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f10 = bounds.left - centerX;
        float f11 = bounds.top - centerY;
        this.f42020g = (float) Math.ceil(Math.sqrt(com.google.android.gms.internal.vision.e2.z(i10, centerY, f11, f10 * (i7 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x90.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f42015a.setAlpha(i7);
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f42015a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
