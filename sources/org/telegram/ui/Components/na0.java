package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class na0 extends y5 {
    public final qa0 f30955a;

    public na0(qa0 qa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f30955a = qa0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        int i15 = i14 + i12;
        int i16 = this.measuredSize;
        this.f30955a.f31877c.set((int) f9, (i15 - i16) / 2, (int) (f9 + i16), (i15 + i16) / 2);
    }
}
