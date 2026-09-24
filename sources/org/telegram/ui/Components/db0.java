package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class db0 extends ReplacementSpan {
    public final int f23573a;
    public final KeyEvent.Callback f23574b;

    public db0(KeyEvent.Callback callback, int i10) {
        this.f23573a = i10;
        this.f23574b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f23573a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f23573a) {
            case 0:
                return ((fb0) this.f23574b).f24129x;
            case 1:
                return (int) ((org.telegram.ui.lj0) this.f23574b).f35360n0;
            default:
                return (int) ((tg.m1) this.f23574b).f43440t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
