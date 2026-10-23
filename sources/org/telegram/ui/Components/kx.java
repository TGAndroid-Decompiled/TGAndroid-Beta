package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kx extends aw {
    public final TLRPC.StickerSet W;
    public final tz X;

    public kx(tz tzVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(o2Var, context, g6Var, arrayList);
        this.X = tzVar;
        this.W = stickerSet;
    }

    @Override
    public final void dismiss() {
        this.X.f31030w2 = false;
        super.dismiss();
    }

    @Override
    public final void h0(boolean z10) {
        tz tzVar = this.X;
        ArrayList arrayList = tzVar.f31005p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f20370id))) {
                arrayList.add(Long.valueOf(stickerSet.f20370id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f20370id));
        }
        tzVar.T();
    }
}
