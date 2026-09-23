package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class my extends g51 {
    public static final int f26287a = 0;

    static {
        g51.setup(new g51());
    }

    public static h51 a(TLRPC.StickerSetCovered stickerSetCovered, dy dyVar, boolean z10) {
        h51 J = h51.J(my.class);
        long j3 = stickerSetCovered.set.f18110id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = dyVar;
        J.e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        nh.c cVar = (nh.c) view;
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((dy) h51Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f15210c.d(document, null, null, null, false, false);
        }
        cVar.a(h51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.B == h51Var2.B && h51Var.e == h51Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        nh.c cVar = new nh.c(context, d6Var);
        cVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.B == h51Var2.B) {
            return true;
        }
        return false;
    }
}
