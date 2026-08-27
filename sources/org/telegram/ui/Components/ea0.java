package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

public final class ea0 extends t5 {

    public final ga0 f28003a;

    public ea0(ga0 ga0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f28003a = ga0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        ga0 ga0Var = this.f28003a;
        int i15 = ga0Var.f28579y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        ga0Var.f28571c.set((int) f10, i0.a.B(i16, i17, 2, i15), (int) (f10 + i17), ((i16 + i17) / 2) + i15);
    }
}
