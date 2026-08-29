package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class oa0 extends y5 {
    public final qa0 f31327a;

    public oa0(qa0 qa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f31327a = qa0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        qa0 qa0Var = this.f31327a;
        int i15 = qa0Var.f31885y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        qa0Var.f31877c.set((int) f9, j7.l1.e(i16, i17, 2, i15), (int) (f9 + i17), ((i16 + i17) / 2) + i15);
    }
}
