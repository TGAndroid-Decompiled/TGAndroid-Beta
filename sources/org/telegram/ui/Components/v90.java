package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class v90 extends Drawable {
    public Paint f40548a;
    public Paint f40549b;
    public long f40550c;
    public float d;
    public boolean f40551e;
    public boolean f40552f;
    public float f40553g;
    public float h;
    public float f40554i;
    public float f40555j;
    public float f40556k;
    public long f40557l;
    public org.telegram.ui.Cells.r1 f40558m;

    public final void a() {
        int i7;
        int i10;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f10 = bounds.left - centerX;
        float f11 = bounds.top - centerY;
        this.f40553g = (float) Math.ceil(Math.sqrt(com.google.android.gms.internal.vision.e2.z(i10, centerY, f11, f10 * (i7 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v90.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f40548a.setAlpha(i7);
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40548a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
