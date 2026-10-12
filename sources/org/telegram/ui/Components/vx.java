package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vx extends lw {
    public final TLRPC.StickerSet W;
    public final d00 X;

    public vx(d00 d00Var, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(m2Var, context, c6Var, arrayList);
        this.X = d00Var;
        this.W = stickerSet;
    }

    @Override
    public final void Y(boolean z10) {
        d00 d00Var = this.X;
        ArrayList arrayList = d00Var.f25120p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f19829id))) {
                arrayList.add(Long.valueOf(stickerSet.f19829id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f19829id));
        }
        d00Var.T();
    }

    @Override
    public final void dismiss() {
        this.X.f25141v2 = false;
        super.dismiss();
    }
}
