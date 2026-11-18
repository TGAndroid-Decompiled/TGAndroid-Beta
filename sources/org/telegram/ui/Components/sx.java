package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class sx extends k41 {
    public static final int f39861b = 0;

    static {
        k41.h(new k41());
    }

    public static l41 i(TLRPC.StickerSetCovered stickerSetCovered, kx kxVar, boolean z10) {
        l41 K = l41.K(sx.class);
        long j3 = stickerSetCovered.set.f28430id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.C = j3;
        K.H = stickerSetCovered;
        K.I = kxVar;
        K.f37011e = z10;
        return K;
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ph.b bVar = (ph.b) view;
        Object obj = l41Var.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((kx) l41Var.I).f36911e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.f55631c.d(document, null, null, null, false, false);
        }
        bVar.a(l41Var.f37011e, false);
    }

    @Override
    public final boolean c(l41 l41Var, l41 l41Var2) {
        if (l41Var.C == l41Var2.C && l41Var.f37011e == l41Var2.f37011e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ph.b bVar = new ph.b(context, i6Var);
        bVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(64.0f), -1));
        return bVar;
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.C == l41Var2.C) {
            return true;
        }
        return false;
    }
}
