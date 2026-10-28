package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class uy extends t61 {
    public static final int f33480a = 0;

    static {
        t61.setup(new t61());
    }

    public static u61 a(TLRPC.StickerSetCovered stickerSetCovered, jy jyVar, boolean z10) {
        u61 K = u61.K(uy.class);
        long j10 = stickerSetCovered.set.f22055id;
        long j11 = 1 + j10;
        K.d = (int) (j11 ^ (j11 >>> 32));
        K.B = j10;
        K.G = stickerSetCovered;
        K.H = jyVar;
        K.e = z10;
        return K;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ph.c cVar = (ph.c) view;
        Object obj = u61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((jy) u61Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f46895c.d(document, null, null, null, false, false);
        }
        cVar.a(u61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.B == u61Var2.B && u61Var.e == u61Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        ph.c cVar = new ph.c(context, u6Var);
        cVar.setLayoutParams(new s4.q0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.B == u61Var2.B) {
            return true;
        }
        return false;
    }
}
