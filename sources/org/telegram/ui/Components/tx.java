package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tx extends jw {
    public final TLRPC.StickerSet W;
    public final b00 X;

    public tx(b00 b00Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, e6Var, arrayList);
        this.X = b00Var;
        this.W = stickerSet;
    }

    @Override
    public final void Y(boolean z10) {
        b00 b00Var = this.X;
        ArrayList arrayList = b00Var.f24729p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f20069id))) {
                arrayList.add(Long.valueOf(stickerSet.f20069id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f20069id));
        }
        b00Var.T();
    }

    @Override
    public final void dismiss() {
        this.X.f24750v2 = false;
        super.dismiss();
    }
}
