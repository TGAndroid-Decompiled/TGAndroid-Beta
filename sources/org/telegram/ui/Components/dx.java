package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dx extends tv {
    public final TLRPC.StickerSet W;
    public final kz X;

    public dx(kz kzVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, f6Var, arrayList);
        this.X = kzVar;
        this.W = stickerSet;
    }

    @Override
    public final void X(boolean z10) {
        kz kzVar = this.X;
        ArrayList arrayList = kzVar.f25937p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f18355id))) {
                arrayList.add(Long.valueOf(stickerSet.f18355id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f18355id));
        }
        kzVar.T();
    }

    @Override
    public final void dismiss() {
        this.X.f25958v2 = false;
        super.dismiss();
    }
}
