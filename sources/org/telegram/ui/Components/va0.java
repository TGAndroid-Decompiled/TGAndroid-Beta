package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class va0 extends u5 {
    public final xa0 f31874a;

    public va0(xa0 xa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f31874a = xa0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        xa0 xa0Var = this.f31874a;
        int i15 = xa0Var.f33014y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        xa0Var.f33006c.set((int) f10, l.d.d(i16, i17, 2, i15), (int) (f10 + i17), ((i16 + i17) / 2) + i15);
    }
}
