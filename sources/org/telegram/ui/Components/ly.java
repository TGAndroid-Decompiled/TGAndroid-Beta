package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ly extends i51 {
    public static final int f25984a = 0;

    static {
        i51.setup(new i51());
    }

    public static j51 a(TLRPC.StickerSetCovered stickerSetCovered, cy cyVar, boolean z10) {
        j51 J = j51.J(ly.class);
        long j3 = stickerSetCovered.set.f18148id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = cyVar;
        J.e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        nh.c cVar = (nh.c) view;
        Object obj = j51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((cy) j51Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f15245c.d(document, null, null, null, false, false);
        }
        cVar.a(j51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (j51Var.B == j51Var2.B && j51Var.e == j51Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        nh.c cVar = new nh.c(context, f6Var);
        cVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.B == j51Var2.B) {
            return true;
        }
        return false;
    }
}
