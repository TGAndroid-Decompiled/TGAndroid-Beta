package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class xx extends k41 {
    public static final int f34800a = 0;

    static {
        k41.setup(new k41());
    }

    public static l41 a(TLRPC.StickerSetCovered stickerSetCovered, ox oxVar, boolean z10) {
        l41 J = l41.J(xx.class);
        long j10 = stickerSetCovered.set.f22407id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = oxVar;
        J.f30333e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        vg.d dVar = (vg.d) view;
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            dVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((ox) l41Var.H).f31460e;
            dVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            dVar.f48410c.d(document, null, null, null, false, false);
        }
        dVar.a(l41Var.f30333e, false);
    }

    @Override
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        if (l41Var.B == l41Var2.B && l41Var.f30333e == l41Var2.f30333e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        vg.d dVar = new vg.d(context, b6Var);
        dVar.setLayoutParams(new f2.a1(AndroidUtilities.dp(64.0f), -1));
        return dVar;
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.B == l41Var2.B) {
            return true;
        }
        return false;
    }
}
