package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class g90 extends p5 {
    public final h90 f34027a;

    public g90(h90 h90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f34027a = h90Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        h90 h90Var = this.f34027a;
        int i14 = h90Var.E;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        h90Var.f34346c.set((int) f10, k2.p1.e(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
