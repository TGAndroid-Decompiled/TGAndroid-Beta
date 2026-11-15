package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fw extends wu {
    public final TLRPC.StickerSet R1;
    public final ly S1;

    public fw(ly lyVar, org.telegram.ui.ActionBar.e2 e2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(e2Var, context, e6Var, arrayList);
        this.S1 = lyVar;
        this.R1 = stickerSet;
    }

    @Override
    public final void K0(boolean z10) {
        ly lyVar = this.S1;
        ArrayList arrayList = lyVar.f36979q1;
        TLRPC.StickerSet stickerSet = this.R1;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f28078id))) {
                arrayList.add(Long.valueOf(stickerSet.f28078id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f28078id));
        }
        lyVar.U();
    }

    @Override
    public final void dismiss() {
        this.S1.f37005x2 = false;
        super.dismiss();
    }
}
