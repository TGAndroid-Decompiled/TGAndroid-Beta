package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class nb0 extends a6 {
    public final ob0 f28776a;

    public nb0(ob0 ob0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f28776a = ob0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        ob0 ob0Var = this.f28776a;
        int i15 = ob0Var.f28985y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        ob0Var.f28978c.set((int) f7, i2.e.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
