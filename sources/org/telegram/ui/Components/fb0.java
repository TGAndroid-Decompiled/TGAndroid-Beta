package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class fb0 extends ReplacementSpan {
    public final int f24208a;
    public final KeyEvent.Callback f24209b;

    public fb0(KeyEvent.Callback callback, int i10) {
        this.f24208a = i10;
        this.f24209b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f24208a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f24208a) {
            case 0:
                return ((hb0) this.f24209b).f24766x;
            case 1:
                return (int) ((org.telegram.ui.kj0) this.f24209b).f35091n0;
            default:
                return (int) ((tg.m1) this.f24209b).f43454t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
