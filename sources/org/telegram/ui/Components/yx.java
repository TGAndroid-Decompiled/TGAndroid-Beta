package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class yx extends m41 {

    public static final int f34969a = 0;

    static {
        m41.setup(new yx());
    }

    public static n41 a(TLRPC.StickerSetCovered stickerSetCovered, px pxVar, boolean z10) {
        n41 n41VarJ = n41.J(yx.class);
        long j10 = stickerSetCovered.set.f22407id;
        long j11 = 1 + j10;
        n41VarJ.d = (int) (j11 ^ (j11 >>> 32));
        n41VarJ.B = j10;
        n41VarJ.G = stickerSetCovered;
        n41VarJ.H = pxVar;
        n41VarJ.f30838e = z10;
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        wg.c cVar = (wg.c) view;
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((px) n41Var.H).f31677e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f49318c.d(document, null, null, null, false, false);
        }
        cVar.a(n41Var.f30838e, false);
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.B == n41Var2.B && n41Var.f30838e == n41Var2.f30838e;
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        wg.c cVar = new wg.c(context, c6Var);
        cVar.setLayoutParams(new f2.y0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.B == n41Var2.B;
    }
}
