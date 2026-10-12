package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class xy extends k61 {
    public static final int f31405a = 0;

    static {
        k61.setup(new k61());
    }

    public static l61 a(TLRPC.StickerSetCovered stickerSetCovered, oy oyVar, boolean z10) {
        l61 J = l61.J(xy.class);
        long j10 = stickerSetCovered.set.f19243id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = oyVar;
        J.e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        oh.c cVar = (oh.c) view;
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((oy) l61Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f16657c.d(document, null, null, null, false, false);
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
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        oh.c cVar = new oh.c(context, c6Var);
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
