package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class jx extends x31 {
    public static final int f35175b = 0;

    static {
        x31.h(new x31());
    }

    public static y31 i(TLRPC.StickerSetCovered stickerSetCovered, zw zwVar, boolean z9) {
        y31 K = y31.K(jx.class);
        long j3 = stickerSetCovered.set.f26983id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.B = j3;
        K.G = stickerSetCovered;
        K.H = zwVar;
        K.f40562e = z9;
        return K;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ph.b bVar = (ph.b) view;
        Object obj = y31Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((zw) y31Var.H).f41175e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.f53651c.d(document, null, null, null, false, false);
        }
        bVar.a(y31Var.f40562e, false);
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (y31Var.B == y31Var2.B && y31Var.f40562e == y31Var2.f40562e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        ph.b bVar = new ph.b(context, g6Var);
        bVar.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(64.0f), -1));
        return bVar;
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.B == y31Var2.B) {
            return true;
        }
        return false;
    }
}
