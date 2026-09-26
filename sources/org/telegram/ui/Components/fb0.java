package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class fb0 extends z5 {
    public final gb0 f24205a;

    public fb0(gb0 gb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f24205a = gb0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        gb0 gb0Var = this.f24205a;
        int i15 = gb0Var.f24457y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        gb0Var.f24450c.set((int) f7, hg.c.z(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
