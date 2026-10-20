package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class mb0 extends ReplacementSpan {
    public final int f28476a;
    public final KeyEvent.Callback f28477b;

    public mb0(KeyEvent.Callback callback, int i10) {
        this.f28476a = i10;
        this.f28477b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f28476a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f28476a) {
            case 0:
                return ((ob0) this.f28477b).f28980x;
            case 1:
                return (int) ((org.telegram.ui.bj0) this.f28477b).f35658n0;
            default:
                return (int) ((ug.m1) this.f28477b).f47728t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
