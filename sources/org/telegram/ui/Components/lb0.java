package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class lb0 extends ReplacementSpan {
    public final int f28315a;
    public final KeyEvent.Callback f28316b;

    public lb0(KeyEvent.Callback callback, int i10) {
        this.f28315a = i10;
        this.f28316b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f28315a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f28315a) {
            case 0:
                return ((nb0) this.f28316b).f28862x;
            case 1:
                return (int) ((org.telegram.ui.ej0) this.f28316b).f36934n0;
            default:
                return (int) ((ug.l1) this.f28316b).f48164t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
