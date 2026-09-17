package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class ra0 extends ReplacementSpan {
    public final int f27590a;
    public final KeyEvent.Callback f27591b;

    public ra0(KeyEvent.Callback callback, int i10) {
        this.f27590a = i10;
        this.f27591b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f27590a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f27590a) {
            case 0:
                return ((ta0) this.f27591b).f28051x;
            case 1:
                return (int) ((org.telegram.ui.tj0) this.f27591b).f37818n0;
            default:
                return (int) ((tg.n1) this.f27591b).f43215t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
