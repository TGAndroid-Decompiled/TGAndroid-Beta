package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class l90 extends r5 {
    public final m90 f35658a;

    public l90(m90 m90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f35658a = m90Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        m90 m90Var = this.f35658a;
        int i14 = m90Var.D;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        m90Var.f36029c.set((int) f10, jg.g.D(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
