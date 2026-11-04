package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
public final class ch extends View {
    public final int f32716a;
    public final bi f32717b;

    public ch(bi biVar, Context context, int i3) {
        super(context);
        this.f32716a = i3;
        this.f32717b = biVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f32716a) {
            case 0:
                super.draw(canvas);
                this.f32717b.T1.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f32716a) {
            case 1:
                bi biVar = this.f32717b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, biVar.f32275t2.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(biVar.E2.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.C5, biVar.J0);
                biVar.E2.setColor(i0.a.o(w02, (int) (((biVar.Q2 * 0.42d) + 0.58d) * Color.alpha(w02))));
                biVar.G2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, biVar.J0));
                int i3 = max / 2;
                int i10 = measuredWidth - i3;
                int i11 = i3 + measuredWidth;
                biVar.F2.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(biVar.F2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), biVar.G2);
                biVar.G2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W9, biVar.J0));
                biVar.F2.set(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L(2.0f), i11 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(biVar.F2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), biVar.G2);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), biVar.E2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f32716a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                this.f32717b.T1.setBounds(0, (i10 - org.telegram.messenger.g0.f22603n) - org.telegram.messenger.g0.L(48.0f), i3, i10);
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }
}
