package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class z90 extends y5 {
    public final aa0 f42699a;

    public z90(aa0 aa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f42699a = aa0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        aa0 aa0Var = this.f42699a;
        int i14 = aa0Var.E;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        aa0Var.f33434c.set((int) f10, i5.c.e(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
