package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class qy extends q9 {
    public final ry H;

    public qy(ry ryVar, Context context) {
        super(context);
        this.H = ryVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ry ryVar = this.H;
        ty tyVar = ryVar.d;
        boolean z10 = ryVar.f39376c;
        if (!z10) {
            if (org.telegram.messenger.ri.d0(tyVar.f40099d1).f26671v0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.f28458id)) && tyVar.f40148t1 != null) {
                canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), tyVar.f40148t1);
            }
        }
    }
}
