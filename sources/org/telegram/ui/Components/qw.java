package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qw extends dv {
    public final TLRPC.StickerSet S;
    public final wy T;

    public qw(wy wyVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(o2Var, context, b6Var, arrayList);
        this.T = wyVar;
        this.S = stickerSet;
    }

    @Override
    public final void W(boolean z10) {
        wy wyVar = this.T;
        ArrayList arrayList = wyVar.l1;
        TLRPC.StickerSet stickerSet = this.S;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f22407id))) {
                arrayList.add(Long.valueOf(stickerSet.f22407id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f22407id));
        }
        wyVar.U();
    }

    @Override
    public final void dismiss() {
        this.T.f34444s2 = false;
        super.dismiss();
    }
}
