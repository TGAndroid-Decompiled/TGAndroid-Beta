package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class gx extends q31 {
    public static final int f34222b = 0;

    static {
        q31.h(new q31());
    }

    public static r31 i(TLRPC.StickerSetCovered stickerSetCovered, xw xwVar, boolean z10) {
        r31 K = r31.K(gx.class);
        long j10 = stickerSetCovered.set.f27028id;
        long j11 = 1 + j10;
        K.d = (int) (j11 ^ (j11 >>> 32));
        K.B = j10;
        K.G = stickerSetCovered;
        K.H = xwVar;
        K.f37621e = z10;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        qh.b bVar = (qh.b) view;
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((xw) r31Var.H).f40537e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.f53945c.d(document, null, null, null, false, false);
        }
        bVar.a(r31Var.f37621e, false);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (r31Var.B == r31Var2.B && r31Var.f37621e == r31Var2.f37621e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        qh.b bVar = new qh.b(context, e6Var);
        bVar.setLayoutParams(new u4.p0(org.telegram.messenger.g0.L(64.0f), -1));
        return bVar;
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.B == r31Var2.B) {
            return true;
        }
        return false;
    }
}
