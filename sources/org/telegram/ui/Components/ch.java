package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
public final class ch extends View {
    public final int f25116a;
    public final bi f25117b;

    public ch(bi biVar, Context context, int i10) {
        super(context);
        this.f25116a = i10;
        this.f25117b = biVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f25116a) {
            case 0:
                super.draw(canvas);
                this.f25117b.S1.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25116a) {
            case 1:
                bi biVar = this.f25117b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, biVar.f24812s2.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(biVar.D2.measureText(format));
                int max = Math.max(org.telegram.messenger.i0.L(16.0f) + ceil, org.telegram.messenger.i0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.C5, biVar.I0);
                biVar.D2.setColor(i0.b.o(w02, (int) (((biVar.P2 * 0.42d) + 0.58d) * Color.alpha(w02))));
                biVar.F2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, biVar.I0));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                biVar.E2.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(biVar.E2, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), biVar.F2);
                biVar.F2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W9, biVar.I0));
                biVar.E2.set(org.telegram.messenger.i0.L(2.0f) + i11, org.telegram.messenger.i0.L(2.0f), i12 - org.telegram.messenger.i0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f));
                canvas.drawRoundRect(biVar.E2, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), biVar.F2);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.i0.L(16.2f), biVar.D2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f25116a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.f25117b.S1.setBounds(0, (i11 - org.telegram.messenger.i0.f16167n) - org.telegram.messenger.i0.L(48.0f), i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
