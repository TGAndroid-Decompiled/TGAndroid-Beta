package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class gb0 extends ReplacementSpan {
    public final int f24530a;
    public final KeyEvent.Callback f24531b;

    public gb0(KeyEvent.Callback callback, int i10) {
        this.f24530a = i10;
        this.f24531b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f24530a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f24530a) {
            case 0:
                return ((ib0) this.f24531b).f25066x;
            case 1:
                return (int) ((org.telegram.ui.kj0) this.f24531b).f35181n0;
            default:
                return (int) ((tg.m1) this.f24531b).f43562t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
