package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class ay extends k9 {
    public final cy H;

    public ay(cy cyVar, Context context) {
        super(context);
        this.H = cyVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cy cyVar = this.H;
        ey eyVar = cyVar.d;
        boolean z10 = cyVar.f32853c;
        if (!z10) {
            if (org.telegram.messenger.li.b0(eyVar.f33529d1).f24055v0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.f27028id)) && eyVar.f33579t1 != null) {
                canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), eyVar.f33579t1);
            }
        }
    }
}
