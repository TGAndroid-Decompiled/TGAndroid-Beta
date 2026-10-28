package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class mb0 extends c6 {
    public final nb0 f30491a;

    public mb0(nb0 nb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f30491a = nb0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        nb0 nb0Var = this.f30491a;
        int i15 = nb0Var.f30837y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        nb0Var.f30830c.set((int) f7, ic.a.A(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
