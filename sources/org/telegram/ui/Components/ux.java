package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ux extends n41 {
    public static final int f40611b = 0;

    static {
        n41.h(new n41());
    }

    public static o41 i(TLRPC.StickerSetCovered stickerSetCovered, mx mxVar, boolean z10) {
        o41 K = o41.K(ux.class);
        long j3 = stickerSetCovered.set.f28458id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.C = j3;
        K.H = stickerSetCovered;
        K.I = mxVar;
        K.f38091e = z10;
        return K;
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ph.b bVar = (ph.b) view;
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((mx) o41Var.I).f37660e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.f55672c.d(document, null, null, null, false, false);
        }
        bVar.a(o41Var.f38091e, false);
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (o41Var.C == o41Var2.C && o41Var.f38091e == o41Var2.f38091e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ph.b bVar = new ph.b(context, h6Var);
        bVar.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(64.0f), -1));
        return bVar;
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.C == o41Var2.C) {
            return true;
        }
        return false;
    }
}
