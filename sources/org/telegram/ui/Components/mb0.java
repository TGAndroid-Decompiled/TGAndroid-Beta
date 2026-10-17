package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
public final class mb0 extends ReplacementSpan {
    public final int f28492a;
    public final KeyEvent.Callback f28493b;

    public mb0(KeyEvent.Callback callback, int i10) {
        this.f28492a = i10;
        this.f28493b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f28492a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f28492a) {
            case 0:
                return ((ob0) this.f28493b).f28916x;
            case 1:
                return (int) ((org.telegram.ui.dj0) this.f28493b).f36222n0;
            default:
                return (int) ((ug.l1) this.f28493b).f47740t0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
