package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zv extends qu {
    public final TLRPC.StickerSet Q1;
    public final gy R1;

    public zv(gy gyVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(f2Var, context, h6Var, arrayList);
        this.R1 = gyVar;
        this.Q1 = stickerSet;
    }

    @Override
    public final void K0(boolean z9) {
        gy gyVar = this.R1;
        ArrayList arrayList = gyVar.f34054p1;
        TLRPC.StickerSet stickerSet = this.Q1;
        if (z9) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f26987id))) {
                arrayList.add(Long.valueOf(stickerSet.f26987id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f26987id));
        }
        gyVar.T();
    }

    @Override
    public final void dismiss() {
        this.R1.f34079w2 = false;
        super.dismiss();
    }
}
