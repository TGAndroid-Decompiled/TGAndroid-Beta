package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class rx extends m41 {
    public static final int f39430b = 0;

    static {
        m41.h(new m41());
    }

    public static n41 i(TLRPC.StickerSetCovered stickerSetCovered, jx jxVar, boolean z10) {
        n41 K = n41.K(rx.class);
        long j3 = stickerSetCovered.set.f28519id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.C = j3;
        K.H = stickerSetCovered;
        K.I = jxVar;
        K.f37648e = z10;
        return K;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ph.b bVar = (ph.b) view;
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((jx) n41Var.I).f36559e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.f55754c.d(document, null, null, null, false, false);
        }
        bVar.a(n41Var.f37648e, false);
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        if (n41Var.C == n41Var2.C && n41Var.f37648e == n41Var2.f37648e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ph.b bVar = new ph.b(context, i6Var);
        bVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(64.0f), -1));
        return bVar;
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.C == n41Var2.C) {
            return true;
        }
        return false;
    }
}
