package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
public final class mh extends View {
    public final int f37248a;
    public final ki f37249b;

    public mh(ki kiVar, Context context, int i7) {
        super(context);
        this.f37248a = i7;
        this.f37249b = kiVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f37248a) {
            case 0:
                super.draw(canvas);
                this.f37249b.W1.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f37248a) {
            case 1:
                ki kiVar = this.f37249b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, kiVar.f36509w2.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(kiVar.H2.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.C5, kiVar.J0);
                kiVar.H2.setColor(i0.a.o(w02, (int) (((kiVar.T2 * 0.42d) + 0.58d) * Color.alpha(w02))));
                kiVar.J2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, kiVar.J0));
                int i7 = max / 2;
                int i10 = measuredWidth - i7;
                int i11 = i7 + measuredWidth;
                kiVar.I2.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(kiVar.I2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), kiVar.J2);
                kiVar.J2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.W9, kiVar.J0));
                kiVar.I2.set(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L(2.0f), i11 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(kiVar.I2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), kiVar.J2);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), kiVar.H2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f37248a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                this.f37249b.W1.setBounds(0, (i10 - org.telegram.messenger.g0.f23604n) - org.telegram.messenger.g0.L(48.0f), i7, i10);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
