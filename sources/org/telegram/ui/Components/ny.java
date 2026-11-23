package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class ny extends p9 {
    public final oy H;

    public ny(oy oyVar, Context context) {
        super(context);
        this.H = oyVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oy oyVar = this.H;
        qy qyVar = oyVar.d;
        boolean z10 = oyVar.f38277c;
        if (!z10) {
            if (org.telegram.messenger.ri.d0(qyVar.f39047d1).f26744v0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.f28519id)) && qyVar.f39096t1 != null) {
                canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), qyVar.f39096t1);
            }
        }
    }
}
