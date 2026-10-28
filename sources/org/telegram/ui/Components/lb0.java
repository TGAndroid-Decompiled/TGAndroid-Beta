package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class lb0 extends ReplacementSpan {
    public final int f30220a;
    public final KeyEvent.Callback f30221b;

    public lb0(KeyEvent.Callback callback, int i10) {
        this.f30220a = i10;
        this.f30221b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f30220a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f30220a) {
            case 0:
                return ((nb0) this.f30221b).f30836x;
            case 1:
                return (int) ((org.telegram.ui.ej0) this.f30221b).f38898n0;
            default:
                return (int) ((vg.n1) this.f30221b).f50262t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
