package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ny extends g51 {
    public static final int f29603a = 0;

    static {
        g51.setup(new g51());
    }

    public static h51 a(TLRPC.StickerSetCovered stickerSetCovered, dy dyVar, boolean z4) {
        h51 J = h51.J(ny.class);
        long j10 = stickerSetCovered.set.f20872id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = dyVar;
        J.f27369e = z4;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        bh.d dVar = (bh.d) view;
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            dVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((dy) h51Var.H).f26374e;
            dVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            dVar.f1988c.d(document, null, null, null, false, false);
        }
        dVar.a(h51Var.f27369e, false);
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.B == h51Var2.B && h51Var.f27369e == h51Var2.f27369e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        bh.d dVar = new bh.d(context, g6Var);
        dVar.setLayoutParams(new f2.x0(AndroidUtilities.dp(64.0f), -1));
        return dVar;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.B == h51Var2.B) {
            return true;
        }
        return false;
    }
}
