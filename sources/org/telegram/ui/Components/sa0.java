package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class sa0 extends u5 {
    public final va0 f28684a;

    public sa0(va0 va0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f28684a = va0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15 = i14 + i12;
        int i16 = this.measuredSize;
        this.f28684a.f29406c.set((int) f10, (i15 - i16) / 2, (int) (f10 + i16), (i15 + i16) / 2);
    }
}
