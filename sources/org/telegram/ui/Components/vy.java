package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class vy extends g61 {
    public static final int f31890a = 0;

    static {
        g61.setup(new g61());
    }

    public static h61 a(TLRPC.StickerSetCovered stickerSetCovered, ky kyVar, boolean z10) {
        h61 J = h61.J(vy.class);
        long j10 = stickerSetCovered.set.f20303id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = kyVar;
        J.e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        oh.c cVar = (oh.c) view;
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((ky) h61Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f17748c.d(document, null, null, null, false, false);
        }
        cVar.a(h61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.B == h61Var2.B && h61Var.e == h61Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        oh.c cVar = new oh.c(context, d6Var);
        cVar.setLayoutParams(new s4.o0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.B == h61Var2.B) {
            return true;
        }
        return false;
    }
}
