package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gx extends wv {
    public final TLRPC.StickerSet W;
    public final nz X;

    public gx(nz nzVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, d6Var, arrayList);
        this.X = nzVar;
        this.W = stickerSet;
    }

    @Override
    public final void W(boolean z10) {
        nz nzVar = this.X;
        ArrayList arrayList = nzVar.f29131p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f20064id))) {
                arrayList.add(Long.valueOf(stickerSet.f20064id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f20064id));
        }
        nzVar.R();
    }

    @Override
    public final void dismiss() {
        this.X.f29152v2 = false;
        super.dismiss();
    }
}
