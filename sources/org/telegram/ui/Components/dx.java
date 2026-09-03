package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dx extends ov {
    public final TLRPC.StickerSet T;
    public final mz U;

    public dx(mz mzVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(p2Var, context, g6Var, arrayList);
        this.U = mzVar;
        this.T = stickerSet;
    }

    @Override
    public final void X(boolean z4) {
        mz mzVar = this.U;
        ArrayList arrayList = mzVar.f29304m1;
        TLRPC.StickerSet stickerSet = this.T;
        if (z4) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f20872id))) {
                arrayList.add(Long.valueOf(stickerSet.f20872id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f20872id));
        }
        mzVar.V();
    }

    @Override
    public final void dismiss() {
        this.U.f29329t2 = false;
        super.dismiss();
    }
}
