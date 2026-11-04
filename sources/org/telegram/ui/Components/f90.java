package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class f90 extends p5 {
    public final h90 f33768a;

    public f90(h90 h90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f33768a = h90Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = i13 + i11;
        int i15 = this.measuredSize;
        this.f33768a.f34346c.set((int) f10, (i14 - i15) / 2, (int) (f10 + i15), (i14 + i15) / 2);
    }
}
