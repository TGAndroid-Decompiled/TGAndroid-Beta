package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class uy extends s61 {
    public static final int f33508a = 0;

    static {
        s61.setup(new s61());
    }

    public static t61 a(TLRPC.StickerSetCovered stickerSetCovered, jy jyVar, boolean z10) {
        t61 K = t61.K(uy.class);
        long j10 = stickerSetCovered.set.f22054id;
        long j11 = 1 + j10;
        K.d = (int) (j11 ^ (j11 >>> 32));
        K.B = j10;
        K.G = stickerSetCovered;
        K.H = jyVar;
        K.e = z10;
        return K;
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ph.c cVar = (ph.c) view;
        Object obj = t61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((jy) t61Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f46860c.d(document, null, null, null, false, false);
        }
        cVar.a(t61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (t61Var.B == t61Var2.B && t61Var.e == t61Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        ph.c cVar = new ph.c(context, u6Var);
        cVar.setLayoutParams(new s4.q0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.B == t61Var2.B) {
            return true;
        }
        return false;
    }
}
