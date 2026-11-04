package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yv extends pu {
    public final TLRPC.StickerSet O1;
    public final ey P1;

    public yv(ey eyVar, org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(d2Var, context, e6Var, arrayList);
        this.P1 = eyVar;
        this.O1 = stickerSet;
    }

    @Override
    public final void K0(boolean z10) {
        ey eyVar = this.P1;
        ArrayList arrayList = eyVar.f33568q1;
        TLRPC.StickerSet stickerSet = this.O1;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f27028id))) {
                arrayList.add(Long.valueOf(stickerSet.f27028id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f27028id));
        }
        eyVar.T();
    }

    @Override
    public final void dismiss() {
        this.P1.f33594x2 = false;
        super.dismiss();
    }
}
