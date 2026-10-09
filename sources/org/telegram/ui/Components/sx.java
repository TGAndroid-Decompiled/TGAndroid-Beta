package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sx extends iw {
    public final TLRPC.StickerSet W;
    public final a00 X;

    public sx(a00 a00Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, e6Var, arrayList);
        this.X = a00Var;
        this.W = stickerSet;
    }

    @Override
    public final void Y(boolean z10) {
        a00 a00Var = this.X;
        ArrayList arrayList = a00Var.f24441p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f20065id))) {
                arrayList.add(Long.valueOf(stickerSet.f20065id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f20065id));
        }
        a00Var.T();
    }

    @Override
    public final void dismiss() {
        this.X.f24462v2 = false;
        super.dismiss();
    }
}
