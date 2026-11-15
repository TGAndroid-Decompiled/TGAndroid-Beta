package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class n90 extends p5 {
    public final o90 f37506a;

    public n90(o90 o90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f37506a = o90Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        o90 o90Var = this.f37506a;
        int i14 = o90Var.E;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        o90Var.f37885c.set((int) f10, i5.c.e(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
