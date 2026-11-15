package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class nx extends a41 {
    public static final int f37734b = 0;

    static {
        a41.h(new a41());
    }

    public static b41 i(TLRPC.StickerSetCovered stickerSetCovered, ex exVar, boolean z10) {
        b41 K = b41.K(nx.class);
        long j3 = stickerSetCovered.set.f28078id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.B = j3;
        K.G = stickerSetCovered;
        K.H = exVar;
        K.f33178e = z10;
        return K;
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ph.b bVar = (ph.b) view;
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((ex) b41Var.H).f34446e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.f55055c.d(document, null, null, null, false, false);
        }
        bVar.a(b41Var.f33178e, false);
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (b41Var.B == b41Var2.B && b41Var.f33178e == b41Var2.f33178e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        ph.b bVar = new ph.b(context, e6Var);
        bVar.setLayoutParams(new v4.p0(org.telegram.messenger.g0.L(64.0f), -1));
        return bVar;
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.B == b41Var2.B) {
            return true;
        }
        return false;
    }
}
