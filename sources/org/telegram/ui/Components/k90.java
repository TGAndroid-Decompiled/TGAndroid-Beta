package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class k90 extends r5 {
    public final m90 f35283a;

    public k90(m90 m90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f35283a = m90Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = i13 + i11;
        int i15 = this.measuredSize;
        this.f35283a.f36029c.set((int) f10, (i14 - i15) / 2, (int) (f10 + i15), (i14 + i15) / 2);
    }
}
