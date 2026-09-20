package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class za0 extends ReplacementSpan {
    public final int f30798a;
    public final KeyEvent.Callback f30799b;

    public za0(KeyEvent.Callback callback, int i10) {
        this.f30798a = i10;
        this.f30799b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f30798a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f30798a) {
            case 0:
                return ((bb0) this.f30799b).f22952x;
            case 1:
                return (int) ((org.telegram.ui.uj0) this.f30799b).f38126n0;
            default:
                return (int) ((tg.m1) this.f30799b).f43469t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
