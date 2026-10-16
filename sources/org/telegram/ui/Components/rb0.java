package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class rb0 extends b6 {
    public final ub0 f28492a;

    public rb0(ub0 ub0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f28492a = ub0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = i14 + i12;
        int i16 = this.measuredSize;
        this.f28492a.f29311c.set((int) f7, (i15 - i16) / 2, (int) (f7 + i16), (i15 + i16) / 2);
    }
}
