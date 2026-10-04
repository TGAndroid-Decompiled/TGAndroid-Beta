package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class db0 extends Drawable {
    public Paint f25685a;
    public Paint f25686b;
    public long f25687c;
    public float d;
    public boolean f25688e;
    public boolean f25689f;
    public float f25690g;
    public float h;
    public float f25691i;
    public float f25692j;
    public float f25693k;
    public long f25694l;
    public org.telegram.ui.Cells.u1 f25695m;

    public final void a() {
        int i10;
        int i11;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f7 = bounds.left - centerX;
        float f10 = bounds.top - centerY;
        this.f25690g = (float) Math.ceil(Math.sqrt(com.google.android.gms.internal.vision.e2.z(i11, centerY, f10, f7 * (i10 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25685a.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25685a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
