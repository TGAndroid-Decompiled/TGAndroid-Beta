package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ty extends k61 {
    public static final int f30935a = 0;

    static {
        k61.setup(new k61());
    }

    public static l61 a(TLRPC.StickerSetCovered stickerSetCovered, iy iyVar, boolean z10) {
        l61 J = l61.J(ty.class);
        long j10 = stickerSetCovered.set.f20371id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = iyVar;
        J.e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        oh.c cVar = (oh.c) view;
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((iy) l61Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f17811c.d(document, null, null, null, false, false);
        }
        cVar.a(l61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (l61Var.B == l61Var2.B && l61Var.e == l61Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        oh.c cVar = new oh.c(context, g6Var);
        cVar.setLayoutParams(new s4.o0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.B == l61Var2.B) {
            return true;
        }
        return false;
    }
}
