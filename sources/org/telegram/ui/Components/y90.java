package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class y90 extends Drawable {
    public Paint f34902a;
    public Paint f34903b;
    public long f34904c;
    public float d;
    public boolean f34905e;
    public boolean f34906f;
    public float f34907g;
    public float h;
    public float f34908i;
    public float f34909j;
    public float f34910k;
    public long f34911l;
    public org.telegram.ui.Cells.t1 f34912m;

    public final void a() {
        int i9;
        int i10;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f10 = bounds.left - centerX;
        float f11 = bounds.top - centerY;
        this.f34907g = (float) Math.ceil(Math.sqrt(e2.c.z(i10, centerY, f11, f10 * (i9 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y90.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f34902a.setAlpha(i9);
    }

    @Override
    public final void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34902a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
