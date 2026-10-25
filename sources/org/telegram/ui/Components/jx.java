package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jx extends aw {
    public final TLRPC.StickerSet W;
    public final sz X;

    public jx(sz szVar, org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(r2Var, context, u6Var, arrayList);
        this.X = szVar;
        this.W = stickerSet;
    }

    @Override
    public final void dismiss() {
        this.X.f32780w2 = false;
        super.dismiss();
    }

    @Override
    public final void h0(boolean z10) {
        sz szVar = this.X;
        ArrayList arrayList = szVar.f32755p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f22054id))) {
                arrayList.add(Long.valueOf(stickerSet.f22054id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f22054id));
        }
        szVar.T();
    }
}
