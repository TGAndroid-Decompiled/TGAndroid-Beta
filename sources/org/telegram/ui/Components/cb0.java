package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class cb0 extends y5 {
    public final db0 f22091a;

    public cb0(db0 db0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f22091a = db0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        db0 db0Var = this.f22091a;
        int i15 = db0Var.f22357y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        db0Var.f22350c.set((int) f7, hc.b.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
