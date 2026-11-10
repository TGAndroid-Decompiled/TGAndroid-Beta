package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
public final class eh extends View {
    public final int f33259a;
    public final ci f33260b;

    public eh(ci ciVar, Context context, int i7) {
        super(context);
        this.f33259a = i7;
        this.f33260b = ciVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f33259a) {
            case 0:
                super.draw(canvas);
                this.f33260b.V1.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f33259a) {
            case 1:
                ci ciVar = this.f33260b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, ciVar.f32660v2.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(ciVar.G2.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.C5, ciVar.I0);
                ciVar.G2.setColor(i0.a.o(w02, (int) (((ciVar.S2 * 0.42d) + 0.58d) * Color.alpha(w02))));
                ciVar.I2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, ciVar.I0));
                int i7 = max / 2;
                int i10 = measuredWidth - i7;
                int i11 = i7 + measuredWidth;
                ciVar.H2.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(ciVar.H2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), ciVar.I2);
                ciVar.I2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W9, ciVar.I0));
                ciVar.H2.set(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L(2.0f), i11 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(ciVar.H2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), ciVar.I2);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), ciVar.G2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f33259a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                this.f33260b.V1.setBounds(0, (i10 - org.telegram.messenger.g0.f22562n) - org.telegram.messenger.g0.L(48.0f), i7, i10);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
