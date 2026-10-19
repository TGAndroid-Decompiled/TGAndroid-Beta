package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kx extends aw {
    public final TLRPC.StickerSet W;
    public final tz X;

    public kx(tz tzVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, d6Var, arrayList);
        this.X = tzVar;
        this.W = stickerSet;
    }

    @Override
    public final void Y(boolean z10) {
        tz tzVar = this.X;
        ArrayList arrayList = tzVar.f30807p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f20300id))) {
                arrayList.add(Long.valueOf(stickerSet.f20300id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f20300id));
        }
        tzVar.T();
    }

    @Override
    public final void dismiss() {
        this.X.f30828v2 = false;
        super.dismiss();
    }
}
