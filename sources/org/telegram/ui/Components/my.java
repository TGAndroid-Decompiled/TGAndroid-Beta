package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class my extends ReplacementSpan {
    public final int f37404a;

    public my(int i7) {
        this.f37404a = i7;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = this.f37404a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f37404a) {
            case 0:
                return (int) paint.measureText(charSequence, i7, i10);
            case 1:
                return org.telegram.messenger.g0.L(16.0f);
            case 2:
                return org.telegram.messenger.g0.L(12.0f);
            case 3:
                return org.telegram.messenger.g0.L(12.0f);
            default:
                return org.telegram.messenger.g0.L(16.0f);
        }
    }

    public my(boolean z10) {
        this.f37404a = 0;
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void d(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void e(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }
}
