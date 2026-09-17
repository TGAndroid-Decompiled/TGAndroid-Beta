package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cx extends sv {
    public final TLRPC.StickerSet W;
    public final kz X;

    public cx(kz kzVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(o2Var, context, f6Var, arrayList);
        this.X = kzVar;
        this.W = stickerSet;
    }

    @Override
    public final void X(boolean z10) {
        kz kzVar = this.X;
        ArrayList arrayList = kzVar.f25752p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f18148id))) {
                arrayList.add(Long.valueOf(stickerSet.f18148id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f18148id));
        }
        kzVar.U();
    }

    @Override
    public final void dismiss() {
        this.X.f25773v2 = false;
        super.dismiss();
    }
}
