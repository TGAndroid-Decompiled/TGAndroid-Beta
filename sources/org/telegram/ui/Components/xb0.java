package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class xb0 extends ReplacementSpan {
    public final int f32704a;
    public final KeyEvent.Callback f32705b;

    public xb0(KeyEvent.Callback callback, int i10) {
        this.f32704a = i10;
        this.f32705b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f32704a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f32704a) {
            case 0:
                return ((zb0) this.f32705b).f33325x;
            case 1:
                return (int) ((org.telegram.ui.tj0) this.f32705b).f42228n0;
            default:
                return (int) ((tg.m1) this.f32705b).f48612t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
