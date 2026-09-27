package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class cb0 extends Drawable {
    public Paint f23285a;
    public Paint f23286b;
    public long f23287c;
    public float d;
    public boolean e;
    public boolean f23288f;
    public float f23289g;
    public float h;
    public float f23290i;
    public float f23291j;
    public float f23292k;
    public long f23293l;
    public org.telegram.ui.Cells.u1 f23294m;

    public final void a() {
        int i10;
        int i11;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f7 = bounds.left - centerX;
        float f10 = bounds.top - centerY;
        this.f23289g = (float) Math.ceil(Math.sqrt(com.google.android.gms.internal.vision.e2.z(i11, centerY, f10, f7 * (i10 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f23285a.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23285a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
