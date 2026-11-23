package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
public final class vh extends View {
    public final int f40701a;
    public final ti f40702b;

    public vh(ti tiVar, Context context, int i7) {
        super(context);
        this.f40701a = i7;
        this.f40702b = tiVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f40701a) {
            case 0:
                super.draw(canvas);
                this.f40702b.W1.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f40701a) {
            case 1:
                ti tiVar = this.f40702b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, tiVar.f40029w2.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(tiVar.H2.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.C5, tiVar.J0);
                tiVar.H2.setColor(i0.a.o(w02, (int) (((tiVar.T2 * 0.42d) + 0.58d) * Color.alpha(w02))));
                tiVar.J2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, tiVar.J0));
                int i7 = max / 2;
                int i10 = measuredWidth - i7;
                int i11 = i7 + measuredWidth;
                tiVar.I2.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(tiVar.I2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), tiVar.J2);
                tiVar.J2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W9, tiVar.J0));
                tiVar.I2.set(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L(2.0f), i11 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(tiVar.I2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), tiVar.J2);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), tiVar.H2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f40701a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                this.f40702b.W1.setBounds(0, (i10 - org.telegram.messenger.g0.f24221n) - org.telegram.messenger.g0.L(48.0f), i7, i10);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
