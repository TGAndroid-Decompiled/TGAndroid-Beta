package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
public final class uh extends View {
    public final int f40352a;
    public final si f40353b;

    public uh(si siVar, Context context, int i7) {
        super(context);
        this.f40352a = i7;
        this.f40353b = siVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f40352a) {
            case 0:
                super.draw(canvas);
                this.f40353b.W1.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f40352a) {
            case 1:
                si siVar = this.f40353b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, siVar.f39732w2.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(siVar.H2.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.C5, siVar.J0);
                siVar.H2.setColor(i0.a.o(w02, (int) (((siVar.T2 * 0.42d) + 0.58d) * Color.alpha(w02))));
                siVar.J2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, siVar.J0));
                int i7 = max / 2;
                int i10 = measuredWidth - i7;
                int i11 = i7 + measuredWidth;
                siVar.I2.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(siVar.I2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), siVar.J2);
                siVar.J2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W9, siVar.J0));
                siVar.I2.set(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L(2.0f), i11 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(siVar.I2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), siVar.J2);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), siVar.H2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f40352a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                this.f40353b.W1.setBounds(0, (i10 - org.telegram.messenger.g0.f24113n) - org.telegram.messenger.g0.L(48.0f), i7, i10);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
