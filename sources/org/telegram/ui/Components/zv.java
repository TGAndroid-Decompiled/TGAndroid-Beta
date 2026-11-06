package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zv extends qu {
    public final TLRPC.StickerSet N1;
    public final gy O1;

    public zv(gy gyVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(f2Var, context, f6Var, arrayList);
        this.O1 = gyVar;
        this.N1 = stickerSet;
    }

    @Override
    public final void K0(boolean z9) {
        gy gyVar = this.O1;
        ArrayList arrayList = gyVar.f34062p1;
        TLRPC.StickerSet stickerSet = this.N1;
        if (z9) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f26979id))) {
                arrayList.add(Long.valueOf(stickerSet.f26979id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f26979id));
        }
        gyVar.T();
    }

    @Override
    public final void dismiss() {
        this.O1.f34087w2 = false;
        super.dismiss();
    }
}
