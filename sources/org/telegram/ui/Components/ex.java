package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ex extends uv {
    public final TLRPC.StickerSet W;
    public final mz X;

    public ex(mz mzVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(o2Var, context, e6Var, arrayList);
        this.X = mzVar;
        this.W = stickerSet;
    }

    @Override
    public final void X(boolean z10) {
        mz mzVar = this.X;
        ArrayList arrayList = mzVar.f26613p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f18356id))) {
                arrayList.add(Long.valueOf(stickerSet.f18356id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f18356id));
        }
        mzVar.T();
    }

    @Override
    public final void dismiss() {
        this.X.f26634v2 = false;
        super.dismiss();
    }
}
