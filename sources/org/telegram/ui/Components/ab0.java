package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class ab0 extends y5 {
    public final bb0 f22644a;

    public ab0(bb0 bb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f22644a = bb0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        bb0 bb0Var = this.f22644a;
        int i15 = bb0Var.f22953y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        bb0Var.f22946c.set((int) f7, hg.k0.z(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
