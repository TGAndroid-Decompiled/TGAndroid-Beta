package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class k90 extends r5 {
    public final l90 f35242a;

    public k90(l90 l90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f35242a = l90Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        l90 l90Var = this.f35242a;
        int i14 = l90Var.D;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        l90Var.f35570c.set((int) f10, jg.g.D(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
