package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class ta0 extends z5 {
    public final ua0 f30583a;

    public ta0(ua0 ua0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f30583a = ua0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        ua0 ua0Var = this.f30583a;
        int i15 = ua0Var.f30848y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        ua0Var.f30840c.set((int) f7, i2.g.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
