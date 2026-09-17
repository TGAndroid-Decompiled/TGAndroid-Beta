package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class sa0 extends ReplacementSpan {
    public final int f30272a;
    public final KeyEvent.Callback f30273b;

    public sa0(KeyEvent.Callback callback, int i10) {
        this.f30272a = i10;
        this.f30273b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f30272a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f30272a) {
            case 0:
                return ((ua0) this.f30273b).f30875x;
            case 1:
                return (int) ((org.telegram.ui.tj0) this.f30273b).f40808n0;
            default:
                return (int) ((ug.n1) this.f30273b).f47204t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
