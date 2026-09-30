package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class gb0 extends z5 {
    public final hb0 f24477a;

    public gb0(hb0 hb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f24477a = hb0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        hb0 hb0Var = this.f24477a;
        int i15 = hb0Var.f24768y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        hb0Var.f24761c.set((int) f7, hg.c.z(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
