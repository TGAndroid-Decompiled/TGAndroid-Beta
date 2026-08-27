package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class qw extends cv {
    public final TLRPC.StickerSet S;
    public final yy T;

    public qw(yy yyVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, c6Var, arrayList);
        this.T = yyVar;
        this.S = stickerSet;
    }

    @Override
    public final void X(boolean z10) {
        yy yyVar = this.T;
        ArrayList arrayList = yyVar.l1;
        TLRPC.StickerSet stickerSet = this.S;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.f22407id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.f22407id))) {
            arrayList.add(Long.valueOf(stickerSet.f22407id));
        }
        yyVar.V();
    }

    @Override
    public final void dismiss() {
        this.T.f35037s2 = false;
        super.dismiss();
    }
}
