package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class ca0 extends o5 {
    public final da0 f25072a;

    public ca0(da0 da0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f25072a = da0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        da0 da0Var = this.f25072a;
        int i15 = da0Var.D;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        da0Var.f25450c.set((int) f7, i0.a.u(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
