package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class ta0 extends u5 {
    public final va0 f28950a;

    public ta0(va0 va0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f28950a = va0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        va0 va0Var = this.f28950a;
        int i15 = va0Var.f29413y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        va0Var.f29406c.set((int) f10, kh.a2.d(i16, i17, 2, i15), (int) (f10 + i17), ((i16 + i17) / 2) + i15);
    }
}
