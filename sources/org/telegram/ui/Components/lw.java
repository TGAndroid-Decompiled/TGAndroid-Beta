package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lw extends bv {
    public final TLRPC.StickerSet R1;
    public final ry S1;

    public lw(ry ryVar, org.telegram.ui.ActionBar.h2 h2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(h2Var, context, i6Var, arrayList);
        this.S1 = ryVar;
        this.R1 = stickerSet;
    }

    @Override
    public final void L0(boolean z10) {
        ry ryVar = this.S1;
        ArrayList arrayList = ryVar.f39383q1;
        TLRPC.StickerSet stickerSet = this.R1;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f28432id))) {
                arrayList.add(Long.valueOf(stickerSet.f28432id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f28432id));
        }
        ryVar.U();
    }

    @Override
    public final void dismiss() {
        this.S1.f39409x2 = false;
        super.dismiss();
    }
}
