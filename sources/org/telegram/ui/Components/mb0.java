package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class mb0 extends ReplacementSpan {
    public final int f28505a;
    public final KeyEvent.Callback f28506b;

    public mb0(KeyEvent.Callback callback, int i10) {
        this.f28505a = i10;
        this.f28506b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f28505a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f28505a) {
            case 0:
                return ((ob0) this.f28506b).f28942x;
            case 1:
                return (int) ((org.telegram.ui.bj0) this.f28506b).f35652n0;
            default:
                return (int) ((ug.m1) this.f28506b).f47723t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
