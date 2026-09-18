package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dx extends sv {
    public final TLRPC.StickerSet W;
    public final kz X;

    public dx(kz kzVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, e6Var, arrayList);
        this.X = kzVar;
        this.W = stickerSet;
    }

    @Override
    public final void X(boolean z10) {
        kz kzVar = this.X;
        ArrayList arrayList = kzVar.f25931p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f18323id))) {
                arrayList.add(Long.valueOf(stickerSet.f18323id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f18323id));
        }
        kzVar.T();
    }

    @Override
    public final void dismiss() {
        this.X.f25952v2 = false;
        super.dismiss();
    }
}
