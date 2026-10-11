package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class tb0 extends ReplacementSpan {
    public final int f31200a;
    public final KeyEvent.Callback f31201b;

    public tb0(KeyEvent.Callback callback, int i10) {
        this.f31200a = i10;
        this.f31201b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f31200a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f31200a) {
            case 0:
                return ((vb0) this.f31201b).f31846x;
            case 1:
                return (int) ((org.telegram.ui.rj0) this.f31201b).f41498n0;
            default:
                return (int) ((tg.m1) this.f31201b).f48474t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
