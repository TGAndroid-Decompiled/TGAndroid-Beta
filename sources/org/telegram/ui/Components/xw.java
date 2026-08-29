package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xw extends jv {
    public final TLRPC.StickerSet S;
    public final fz T;

    public xw(fz fzVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(o2Var, context, c6Var, arrayList);
        this.T = fzVar;
        this.S = stickerSet;
    }

    @Override
    public final void X(boolean z10) {
        fz fzVar = this.T;
        ArrayList arrayList = fzVar.l1;
        TLRPC.StickerSet stickerSet = this.S;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f22419id))) {
                arrayList.add(Long.valueOf(stickerSet.f22419id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f22419id));
        }
        fzVar.V();
    }

    @Override
    public final void dismiss() {
        this.T.f28635s2 = false;
        super.dismiss();
    }
}
