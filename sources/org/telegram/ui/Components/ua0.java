package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class ua0 extends u5 {
    public final wa0 f29166a;

    public ua0(wa0 wa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f29166a = wa0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        wa0 wa0Var = this.f29166a;
        int i15 = wa0Var.f30201y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        wa0Var.f30194c.set((int) f10, kf.k0.d(i16, i17, 2, i15), (int) (f10 + i17), ((i16 + i17) / 2) + i15);
    }
}
