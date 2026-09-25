package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class eb0 extends z5 {
    public final fb0 f23902a;

    public eb0(fb0 fb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f23902a = fb0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        fb0 fb0Var = this.f23902a;
        int i15 = fb0Var.f24137y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        fb0Var.f24130c.set((int) f7, hg.c.z(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
