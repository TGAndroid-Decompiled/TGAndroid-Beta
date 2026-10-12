package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class yb0 extends b6 {
    public final zb0 f33040a;

    public yb0(zb0 zb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f33040a = zb0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        zb0 zb0Var = this.f33040a;
        int i15 = zb0Var.f33320y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        zb0Var.f33312c.set((int) f7, hg.c.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
