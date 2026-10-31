package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class sy extends g9 {
    public final ty G;

    public sy(ty tyVar, Context context) {
        super(context);
        this.G = tyVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ty tyVar = this.G;
        vy vyVar = tyVar.d;
        boolean z10 = tyVar.f30697c;
        if (!z10) {
            if (org.telegram.messenger.ui.b0(vyVar.f31865c1).f18349u0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.f19820id)) && vyVar.f31915s1 != null) {
                canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(3.0f), vyVar.f31915s1);
            }
        }
    }
}
