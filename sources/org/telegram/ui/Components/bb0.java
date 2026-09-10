package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class bb0 extends ReplacementSpan {
    public final int f21795a;
    public final KeyEvent.Callback f21796b;

    public bb0(KeyEvent.Callback callback, int i10) {
        this.f21795a = i10;
        this.f21796b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f21795a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f21795a) {
            case 0:
                return ((db0) this.f21796b).f22356x;
            case 1:
                return (int) ((org.telegram.ui.sj0) this.f21796b).f36706n0;
            default:
                return (int) ((sg.p1) this.f21796b).f41985t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
