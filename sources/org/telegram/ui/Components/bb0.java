package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
public final class bb0 extends z5 {
    public final cb0 f22949a;

    public bb0(cb0 cb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.f22949a = cb0Var;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        cb0 cb0Var = this.f22949a;
        int i15 = cb0Var.f23245y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        cb0Var.f23238c.set((int) f7, hg.k0.x(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
