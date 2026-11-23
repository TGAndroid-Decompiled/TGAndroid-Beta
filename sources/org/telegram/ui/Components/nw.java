package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nw extends dv {
    public final TLRPC.StickerSet R1;
    public final ty S1;

    public nw(ty tyVar, org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(g2Var, context, h6Var, arrayList);
        this.S1 = tyVar;
        this.R1 = stickerSet;
    }

    @Override
    public final void L0(boolean z10) {
        ty tyVar = this.S1;
        ArrayList arrayList = tyVar.f40112q1;
        TLRPC.StickerSet stickerSet = this.R1;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f28425id))) {
                arrayList.add(Long.valueOf(stickerSet.f28425id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f28425id));
        }
        tyVar.U();
    }

    @Override
    public final void dismiss() {
        this.S1.f40138x2 = false;
        super.dismiss();
    }
}
