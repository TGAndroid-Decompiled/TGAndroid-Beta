package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class sa0 extends x5 {
    public final ta0 f27820a;

    public sa0(ta0 ta0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f27820a = ta0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        ta0 ta0Var = this.f27820a;
        int i15 = ta0Var.f28084y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        ta0Var.f28077c.set((int) f7, hg.c.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
