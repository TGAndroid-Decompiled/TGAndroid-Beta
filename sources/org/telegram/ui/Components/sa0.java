package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class sa0 extends ReplacementSpan {
    public final int f30244a;
    public final KeyEvent.Callback f30245b;

    public sa0(KeyEvent.Callback callback, int i10) {
        this.f30244a = i10;
        this.f30245b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f30244a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f30244a) {
            case 0:
                return ((ua0) this.f30245b).f30847x;
            case 1:
                return (int) ((org.telegram.ui.tj0) this.f30245b).f40780n0;
            default:
                return (int) ((ug.n1) this.f30245b).f47175t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
