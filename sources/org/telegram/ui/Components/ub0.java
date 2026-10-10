package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class ub0 extends ReplacementSpan {
    public final int f31446a;
    public final KeyEvent.Callback f31447b;

    public ub0(KeyEvent.Callback callback, int i10) {
        this.f31446a = i10;
        this.f31447b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f31446a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f31446a) {
            case 0:
                return ((wb0) this.f31447b).f32638x;
            case 1:
                return (int) ((org.telegram.ui.sj0) this.f31447b).f41765n0;
            default:
                return (int) ((tg.m1) this.f31447b).f48417t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
