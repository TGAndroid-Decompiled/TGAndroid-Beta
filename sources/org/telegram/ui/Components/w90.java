package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class w90 extends x5 {
    public final x90 f41553a;

    public w90(x90 x90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f41553a = x90Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        x90 x90Var = this.f41553a;
        int i14 = x90Var.E;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        x90Var.f41948c.set((int) f10, i5.c.e(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
