package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.TLRPC;
public final class iy extends i9 {
    public final jy H;

    public iy(jy jyVar, Context context) {
        super(context);
        this.H = jyVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        jy jyVar = this.H;
        ly lyVar = jyVar.d;
        boolean z10 = jyVar.f36200c;
        if (!z10) {
            if (org.telegram.messenger.si.b0(lyVar.f36941d1).f26505v0[z10 ? 1 : 0].contains(Long.valueOf(((TLRPC.StickerSetCovered) getTag()).set.f28078id)) && lyVar.f36990t1 != null) {
                canvas.drawCircle(canvas.getWidth() - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), lyVar.f36990t1);
            }
        }
    }
}
