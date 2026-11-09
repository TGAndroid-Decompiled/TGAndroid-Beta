package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class aw extends ru {
    public final TLRPC.StickerSet N1;
    public final hy O1;

    public aw(hy hyVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(f2Var, context, g6Var, arrayList);
        this.O1 = hyVar;
        this.N1 = stickerSet;
    }

    @Override
    public final void K0(boolean z9) {
        hy hyVar = this.O1;
        ArrayList arrayList = hyVar.f34453p1;
        TLRPC.StickerSet stickerSet = this.N1;
        if (z9) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f26983id))) {
                arrayList.add(Long.valueOf(stickerSet.f26983id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f26983id));
        }
        hyVar.T();
    }

    @Override
    public final void dismiss() {
        this.O1.f34478w2 = false;
        super.dismiss();
    }
}
