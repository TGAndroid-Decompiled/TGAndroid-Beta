package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fx extends uv {
    public final TLRPC.StickerSet W;
    public final mz X;

    public fx(mz mzVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(m2Var, context, d6Var, arrayList);
        this.X = mzVar;
        this.W = stickerSet;
    }

    @Override
    public final void X(boolean z10) {
        mz mzVar = this.X;
        ArrayList arrayList = mzVar.f26587p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f18362id))) {
                arrayList.add(Long.valueOf(stickerSet.f18362id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f18362id));
        }
        mzVar.T();
    }

    @Override
    public final void dismiss() {
        this.X.f26608v2 = false;
        super.dismiss();
    }
}
