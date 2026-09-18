package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class ra0 extends ReplacementSpan {
    public final int f27593a;
    public final KeyEvent.Callback f27594b;

    public ra0(KeyEvent.Callback callback, int i10) {
        this.f27593a = i10;
        this.f27594b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f27593a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f27593a) {
            case 0:
                return ((ta0) this.f27594b).f28054x;
            case 1:
                return (int) ((org.telegram.ui.tj0) this.f27594b).f37823n0;
            default:
                return (int) ((tg.n1) this.f27594b).f43220t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
