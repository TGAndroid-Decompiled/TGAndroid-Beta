package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bx extends mv {
    public final TLRPC.StickerSet T;
    public final kz U;

    public bx(kz kzVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(p2Var, context, f6Var, arrayList);
        this.U = kzVar;
        this.T = stickerSet;
    }

    @Override
    public final void X(boolean z4) {
        kz kzVar = this.U;
        ArrayList arrayList = kzVar.f26447m1;
        TLRPC.StickerSet stickerSet = this.T;
        if (z4) {
            if (!arrayList.contains(Long.valueOf(stickerSet.f19211id))) {
                arrayList.add(Long.valueOf(stickerSet.f19211id));
            }
        } else {
            arrayList.remove(Long.valueOf(stickerSet.f19211id));
        }
        kzVar.V();
    }

    @Override
    public final void dismiss() {
        this.U.f26472t2 = false;
        super.dismiss();
    }
}
