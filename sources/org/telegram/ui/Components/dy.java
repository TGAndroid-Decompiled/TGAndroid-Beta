package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class dy extends k9 {
    public final ey G;

    public dy(ey eyVar, Context context) {
        super(context);
        this.G = eyVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ey eyVar = this.G;
        gy gyVar = eyVar.d;
        boolean z9 = eyVar.f33351c;
        if (!z9) {
            if (org.telegram.messenger.ui.b0(gyVar.f34016c1).f25848u0[z9 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.f26987id)) && gyVar.f34065s1 != null) {
                canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), gyVar.f34065s1);
            }
        }
    }
}
