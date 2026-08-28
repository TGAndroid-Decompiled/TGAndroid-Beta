package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class aa0 extends t5 {
    public final ca0 f26743a;

    public aa0(ca0 ca0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f26743a = ca0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        ca0 ca0Var = this.f26743a;
        int i14 = ca0Var.f27451y;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        ca0Var.f27443c.set((int) f10, j3.r0.d(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
