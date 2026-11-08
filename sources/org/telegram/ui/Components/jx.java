package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class jx extends w31 {
    public static final int f35125b = 0;

    static {
        w31.h(new w31());
    }

    public static x31 i(TLRPC.StickerSetCovered stickerSetCovered, zw zwVar, boolean z9) {
        x31 K = x31.K(jx.class);
        long j3 = stickerSetCovered.set.f26983id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.B = j3;
        K.G = stickerSetCovered;
        K.H = zwVar;
        K.f40174e = z9;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ph.b bVar = (ph.b) view;
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((zw) x31Var.H).f41159e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.f53639c.d(document, null, null, null, false, false);
        }
        bVar.a(x31Var.f40174e, false);
    }

    @Override
    public final boolean c(x31 x31Var, x31 x31Var2) {
        if (x31Var.B == x31Var2.B && x31Var.f40174e == x31Var2.f40174e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        ph.b bVar = new ph.b(context, f6Var);
        bVar.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(64.0f), -1));
        return bVar;
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.B == x31Var2.B) {
            return true;
        }
        return false;
    }
}
