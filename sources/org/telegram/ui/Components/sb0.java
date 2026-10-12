package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class sb0 extends ReplacementSpan {
    public final int f29093a;
    public final KeyEvent.Callback f29094b;

    public sb0(KeyEvent.Callback callback, int i10) {
        this.f29093a = i10;
        this.f29094b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f29093a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f29093a) {
            case 0:
                return ((ub0) this.f29094b).f29633x;
            case 1:
                return (int) ((org.telegram.ui.xj0) this.f29094b).f41882n0;
            default:
                return (int) ((ug.m1) this.f29094b).f46358t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
