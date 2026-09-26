package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class eb0 extends ReplacementSpan {
    public final int f23920a;
    public final KeyEvent.Callback f23921b;

    public eb0(KeyEvent.Callback callback, int i10) {
        this.f23920a = i10;
        this.f23921b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f23920a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f23920a) {
            case 0:
                return ((gb0) this.f23921b).f24456x;
            case 1:
                return (int) ((org.telegram.ui.kj0) this.f23921b).f35090n0;
            default:
                return (int) ((tg.m1) this.f23921b).f43453t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
