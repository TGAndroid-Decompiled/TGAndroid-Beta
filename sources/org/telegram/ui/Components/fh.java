package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
public final class fh extends View {
    public final int f33550a;
    public final di f33551b;

    public fh(di diVar, Context context, int i7) {
        super(context);
        this.f33550a = i7;
        this.f33551b = diVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f33550a) {
            case 0:
                super.draw(canvas);
                this.f33551b.S1.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f33550a) {
            case 1:
                di diVar = this.f33551b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, diVar.f32992s2.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(diVar.D2.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.C5, diVar.I0);
                diVar.D2.setColor(i0.a.o(w02, (int) (((diVar.P2 * 0.42d) + 0.58d) * Color.alpha(w02))));
                diVar.F2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27925h5, diVar.I0));
                int i7 = max / 2;
                int i10 = measuredWidth - i7;
                int i11 = i7 + measuredWidth;
                diVar.E2.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(diVar.E2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), diVar.F2);
                diVar.F2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W9, diVar.I0));
                diVar.E2.set(org.telegram.messenger.g0.L(2.0f) + i10, org.telegram.messenger.g0.L(2.0f), i11 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(diVar.E2, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), diVar.F2);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), diVar.D2);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f33550a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                this.f33551b.S1.setBounds(0, (i10 - org.telegram.messenger.g0.f22558n) - org.telegram.messenger.g0.L(48.0f), i7, i10);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
