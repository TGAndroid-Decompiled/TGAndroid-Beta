package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ox extends ew {
    public final TLRPC.StickerSet W;
    public final wz X;

    public ox(wz wzVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(m2Var, context, c6Var, arrayList);
        this.X = wzVar;
        this.W = stickerSet;
    }

    @Override
    public final void Y(boolean z10) {
        wz wzVar = this.X;
        ArrayList arrayList = wzVar.f31053p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f19243id))) {
                arrayList.add(Long.valueOf(stickerSet.f19243id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f19243id));
        }
        wzVar.T();
    }

    @Override
    public final void dismiss() {
        this.X.f31074v2 = false;
        super.dismiss();
    }
}
