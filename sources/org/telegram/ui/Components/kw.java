package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kw extends bv {
    public final TLRPC.StickerSet R1;
    public final qy S1;

    public kw(qy qyVar, org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(g2Var, context, i6Var, arrayList);
        this.S1 = qyVar;
        this.R1 = stickerSet;
    }

    @Override
    public final void L0(boolean z10) {
        qy qyVar = this.S1;
        ArrayList arrayList = qyVar.f39085q1;
        TLRPC.StickerSet stickerSet = this.R1;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f28519id))) {
                arrayList.add(Long.valueOf(stickerSet.f28519id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f28519id));
        }
        qyVar.U();
    }

    @Override
    public final void dismiss() {
        this.S1.f39111x2 = false;
        super.dismiss();
    }
}
