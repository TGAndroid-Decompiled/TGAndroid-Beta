package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class ta0 extends u5 {
    public final wa0 f28959a;

    public ta0(wa0 wa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f28959a = wa0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15 = i14 + i12;
        int i16 = this.measuredSize;
        this.f28959a.f30194c.set((int) f10, (i15 - i16) / 2, (int) (f10 + i16), (i15 + i16) / 2);
    }
}
