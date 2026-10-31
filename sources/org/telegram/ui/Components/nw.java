package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nw extends cv {
    public final TLRPC.StickerSet N1;
    public final vy O1;

    public nw(vy vyVar, org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(k2Var, context, p6Var, arrayList);
        this.O1 = vyVar;
        this.N1 = stickerSet;
    }

    @Override
    public final void K0(boolean z10) {
        vy vyVar = this.O1;
        ArrayList arrayList = vyVar.f31904p1;
        TLRPC.StickerSet stickerSet = this.N1;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f19820id))) {
                arrayList.add(Long.valueOf(stickerSet.f19820id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f19820id));
        }
        vyVar.U();
    }

    @Override
    public final void dismiss() {
        this.O1.f31929w2 = false;
        super.dismiss();
    }
}
