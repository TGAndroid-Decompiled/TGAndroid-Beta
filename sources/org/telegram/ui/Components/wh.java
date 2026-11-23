package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
public final class wh extends View {
    public final int f41793a;
    public final ui f41794b;

    public wh(ui uiVar, Context context, int i7) {
        super(context);
        this.f41793a = i7;
        this.f41794b = uiVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41793a) {
            case 0:
                super.draw(canvas);
                this.f41794b.W1.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f41793a) {
            case 1:
                ui uiVar = this.f41794b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, uiVar.f40425w2.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(uiVar.H2.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.C5, uiVar.J0);
                uiVar.H2.setColor(i0.a.o(w02, (int) (((uiVar.T2 * 0.42d) + 0.58d) * Color.alpha(w02))));
                uiVar.J2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, uiVar.J0));
                int i7 = max / 2;
                int i10 = measuredWidth - i7;
                int i11 = i7 + measuredWidth;
                uiVar.I2.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(uiVar.I2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), uiVar.J2);
                uiVar.J2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W9, uiVar.J0));
                uiVar.I2.set(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L(2.0f), i11 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(uiVar.I2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), uiVar.J2);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), uiVar.H2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f41793a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                this.f41794b.W1.setBounds(0, (i10 - org.telegram.messenger.g0.f24005n) - org.telegram.messenger.g0.L(48.0f), i7, i10);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
