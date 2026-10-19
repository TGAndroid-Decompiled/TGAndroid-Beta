package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class vy extends f61 {
    public static final int f31946a = 0;

    static {
        f61.setup(new f61());
    }

    public static g61 a(TLRPC.StickerSetCovered stickerSetCovered, ky kyVar, boolean z10) {
        g61 J = g61.J(vy.class);
        long j10 = stickerSetCovered.set.f20300id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = kyVar;
        J.e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        oh.c cVar = (oh.c) view;
        Object obj = g61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((ky) g61Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f17748c.d(document, null, null, null, false, false);
        }
        cVar.a(g61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (g61Var.B == g61Var2.B && g61Var.e == g61Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        oh.c cVar = new oh.c(context, d6Var);
        cVar.setLayoutParams(new s4.o0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.B == g61Var2.B) {
            return true;
        }
        return false;
    }
}
