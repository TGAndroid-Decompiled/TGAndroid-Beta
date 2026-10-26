package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class kb0 extends ReplacementSpan {
    public final int f29896a;
    public final KeyEvent.Callback f29897b;

    public kb0(KeyEvent.Callback callback, int i10) {
        this.f29896a = i10;
        this.f29897b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f29896a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f29896a) {
            case 0:
                return ((mb0) this.f29897b).f30517x;
            case 1:
                return (int) ((org.telegram.ui.cj0) this.f29897b).f38487n0;
            default:
                return (int) ((vg.n1) this.f29897b).f50227t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
