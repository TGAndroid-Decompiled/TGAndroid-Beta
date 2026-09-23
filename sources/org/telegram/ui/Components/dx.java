package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dx extends tv {
    public final TLRPC.StickerSet W;
    public final lz X;

    public dx(lz lzVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, d6Var, arrayList);
        this.X = lzVar;
        this.W = stickerSet;
    }

    @Override
    public final void X(boolean z10) {
        lz lzVar = this.X;
        ArrayList arrayList = lzVar.f26007p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f18110id))) {
                arrayList.add(Long.valueOf(stickerSet.f18110id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f18110id));
        }
        lzVar.T();
    }

    @Override
    public final void dismiss() {
        this.X.f26028v2 = false;
        super.dismiss();
    }
}
