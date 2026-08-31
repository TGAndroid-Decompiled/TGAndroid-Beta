package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ny extends i51 {
    public static final int f29631a = 0;

    static {
        i51.setup(new i51());
    }

    public static j51 a(TLRPC.StickerSetCovered stickerSetCovered, dy dyVar, boolean z4) {
        j51 J = j51.J(ny.class);
        long j10 = stickerSetCovered.set.f20870id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = dyVar;
        J.f28008e = z4;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        bh.d dVar = (bh.d) view;
        Object obj = j51Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            dVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((dy) j51Var.H).f26342e;
            dVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            dVar.f1988c.d(document, null, null, null, false, false);
        }
        dVar.a(j51Var.f28008e, false);
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (j51Var.B == j51Var2.B && j51Var.f28008e == j51Var2.f28008e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        bh.d dVar = new bh.d(context, g6Var);
        dVar.setLayoutParams(new f2.x0(AndroidUtilities.dp(64.0f), -1));
        return dVar;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.B == j51Var2.B) {
            return true;
        }
        return false;
    }
}
