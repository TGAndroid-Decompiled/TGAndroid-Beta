package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class tb0 extends b6 {
    public final ub0 f29032a;

    public tb0(ub0 ub0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f29032a = ub0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        ub0 ub0Var = this.f29032a;
        int i15 = ub0Var.f29318y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        ub0Var.f29311c.set((int) f7, i2.d.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
