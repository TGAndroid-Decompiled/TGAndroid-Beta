package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class db0 extends y5 {
    public final eb0 f23645a;

    public db0(eb0 eb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f23645a = eb0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        eb0 eb0Var = this.f23645a;
        int i15 = eb0Var.f23925y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        eb0Var.f23918c.set((int) f7, hg.k0.z(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
