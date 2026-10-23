package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class ob0 extends a6 {
    public final pb0 f29150a;

    public ob0(pb0 pb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f29150a = pb0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        pb0 pb0Var = this.f29150a;
        int i15 = pb0Var.f29507y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        pb0Var.f29500c.set((int) f7, i2.o1.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
