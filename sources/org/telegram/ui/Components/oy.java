package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class oy extends q9 {
    public final py H;

    public oy(py pyVar, Context context) {
        super(context);
        this.H = pyVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        py pyVar = this.H;
        ry ryVar = pyVar.d;
        boolean z10 = pyVar.f38609c;
        if (!z10) {
            if (org.telegram.messenger.ri.d0(ryVar.f39345d1).f26643v0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.f28430id)) && ryVar.f39394t1 != null) {
                canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), ryVar.f39394t1);
            }
        }
    }
}
