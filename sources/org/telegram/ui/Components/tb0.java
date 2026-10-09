package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class tb0 extends ReplacementSpan {
    public final int f31120a;
    public final KeyEvent.Callback f31121b;

    public tb0(KeyEvent.Callback callback, int i10) {
        this.f31120a = i10;
        this.f31121b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f31120a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f31120a) {
            case 0:
                return ((vb0) this.f31121b).f31742x;
            case 1:
                return (int) ((org.telegram.ui.sj0) this.f31121b).f41719n0;
            default:
                return (int) ((tg.m1) this.f31121b).f48371t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
