package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class ab0 extends ReplacementSpan {
    public final int f22592a;
    public final KeyEvent.Callback f22593b;

    public ab0(KeyEvent.Callback callback, int i10) {
        this.f22592a = i10;
        this.f22593b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f22592a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f22592a) {
            case 0:
                return ((cb0) this.f22593b).f23244x;
            case 1:
                return (int) ((org.telegram.ui.sj0) this.f22593b).f37357n0;
            default:
                return (int) ((tg.m1) this.f22593b).f43425t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
