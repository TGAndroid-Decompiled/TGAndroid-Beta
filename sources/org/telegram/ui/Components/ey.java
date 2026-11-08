package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class ey extends l9 {
    public final fy G;

    public ey(fy fyVar, Context context) {
        super(context);
        this.G = fyVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fy fyVar = this.G;
        hy hyVar = fyVar.d;
        boolean z9 = fyVar.f33690c;
        if (!z9) {
            if (org.telegram.messenger.ui.b0(hyVar.f34400c1).f25844u0[z9 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.f26983id)) && hyVar.f34449s1 != null) {
                canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), hyVar.f34449s1);
            }
        }
    }
}
