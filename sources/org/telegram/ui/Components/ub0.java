package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class ub0 extends b6 {
    public final vb0 f31517a;

    public ub0(vb0 vb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f31517a = vb0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        vb0 vb0Var = this.f31517a;
        int i15 = vb0Var.f31847y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        vb0Var.f31839c.set((int) f7, hg.c.z(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
