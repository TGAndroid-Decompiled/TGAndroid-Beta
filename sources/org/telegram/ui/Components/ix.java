package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ix extends yv {
    public final TLRPC.StickerSet W;
    public final rz X;

    public ix(rz rzVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(o2Var, context, g6Var, arrayList);
        this.X = rzVar;
        this.W = stickerSet;
    }

    @Override
    public final void dismiss() {
        this.X.f30374w2 = false;
        super.dismiss();
    }

    @Override
    public final void h0(boolean z10) {
        rz rzVar = this.X;
        ArrayList arrayList = rzVar.f30349p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f20371id))) {
                arrayList.add(Long.valueOf(stickerSet.f20371id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f20371id));
        }
        rzVar.T();
    }
}
