package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class j90 extends Drawable {
    public Paint f34959a;
    public Paint f34960b;
    public long f34961c;
    public float d;
    public boolean f34962e;
    public boolean f34963f;
    public float f34964g;
    public float h;
    public float f34965i;
    public float f34966j;
    public float f34967k;
    public long f34968l;
    public org.telegram.ui.Cells.q1 f34969m;

    public final void a() {
        int i7;
        int i10;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f10 = bounds.left - centerX;
        float f11 = bounds.top - centerY;
        this.f34964g = (float) Math.ceil(Math.sqrt(com.google.android.recaptcha.internal.a.z(i10, centerY, f11, f10 * (i7 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j90.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34959a.setAlpha(i7);
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34959a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
