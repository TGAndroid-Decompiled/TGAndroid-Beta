package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class cz extends q61 {
    public static final int f25359a = 0;

    static {
        q61.setup(new q61());
    }

    public static r61 a(TLRPC.StickerSetCovered stickerSetCovered, ty tyVar, boolean z10) {
        r61 J = r61.J(cz.class);
        long j3 = stickerSetCovered.set.f20059id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = tyVar;
        J.f30355e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        nh.c cVar = (nh.c) view;
        Object obj = r61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((ty) r61Var.H).f31184e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f16911c.d(document, null, null, null, false, false);
        }
        cVar.a(r61Var.f30355e, false);
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        if (r61Var.B == r61Var2.B && r61Var.f30355e == r61Var2.f30355e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        nh.c cVar = new nh.c(context, d6Var);
        cVar.setLayoutParams(new s4.q0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        if (r61Var.B == r61Var2.B) {
            return true;
        }
        return false;
    }
}
