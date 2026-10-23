package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class kb0 extends Drawable {
    public Paint f27837a;
    public Paint f27838b;
    public long f27839c;
    public float d;
    public boolean e;
    public boolean f27840f;
    public float f27841g;
    public float h;
    public float f27842i;
    public float f27843j;
    public float f27844k;
    public long f27845l;
    public org.telegram.ui.Cells.u1 f27846m;

    public final void a() {
        int i10;
        int i11;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f7 = bounds.left - centerX;
        float f10 = bounds.top - centerY;
        this.f27841g = (float) Math.ceil(Math.sqrt(com.google.android.gms.internal.play_billing.k3.y(i11, centerY, f10, f7 * (i10 - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kb0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27837a.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27837a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
