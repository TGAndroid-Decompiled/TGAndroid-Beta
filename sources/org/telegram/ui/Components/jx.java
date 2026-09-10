package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jx extends wv {
    public final TLRPC.StickerSet W;
    public final rz X;

    public jx(rz rzVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(p2Var, context, f6Var, arrayList);
        this.X = rzVar;
        this.W = stickerSet;
    }

    @Override
    public final void X(boolean z10) {
        rz rzVar = this.X;
        ArrayList arrayList = rzVar.f26844p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (z10) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f17222id))) {
                arrayList.add(Long.valueOf(stickerSet.f17222id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f17222id));
        }
        rzVar.V();
    }

    @Override
    public final void dismiss() {
        this.X.f26869w2 = false;
        super.dismiss();
    }
}
