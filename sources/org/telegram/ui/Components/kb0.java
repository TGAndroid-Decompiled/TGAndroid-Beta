package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class kb0 extends ReplacementSpan {
    public final int f29894a;
    public final KeyEvent.Callback f29895b;

    public kb0(KeyEvent.Callback callback, int i10) {
        this.f29894a = i10;
        this.f29895b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f29894a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f29894a) {
            case 0:
                return ((mb0) this.f29895b).f30515x;
            case 1:
                return (int) ((org.telegram.ui.cj0) this.f29895b).f38484n0;
            default:
                return (int) ((vg.n1) this.f29895b).f50224t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
