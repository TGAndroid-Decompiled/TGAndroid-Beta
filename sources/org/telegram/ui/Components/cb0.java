package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class cb0 extends ReplacementSpan {
    public final int f23340a;
    public final KeyEvent.Callback f23341b;

    public cb0(KeyEvent.Callback callback, int i10) {
        this.f23340a = i10;
        this.f23341b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f23340a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f23340a) {
            case 0:
                return ((eb0) this.f23341b).f23924x;
            case 1:
                return (int) ((org.telegram.ui.uj0) this.f23341b).f38144n0;
            default:
                return (int) ((tg.m1) this.f23341b).f43490t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
