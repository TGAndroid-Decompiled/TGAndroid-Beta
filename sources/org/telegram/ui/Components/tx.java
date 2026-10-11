package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tx extends jw {
    public final TLRPC.StickerSet W;
    public final b00 X;

    public tx(b00 b00Var, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(m2Var, context, d6Var, arrayList);
        this.X = b00Var;
        this.W = stickerSet;
    }

    @Override
    public final void Y(boolean z10) {
        b00 b00Var = this.X;
        ArrayList arrayList = b00Var.f24702p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f20059id))) {
                arrayList.add(Long.valueOf(stickerSet.f20059id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f20059id));
        }
        b00Var.T();
    }

    @Override
    public final void dismiss() {
        this.X.f24723v2 = false;
        super.dismiss();
    }
}
