package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ix extends q31 {
    public static final int f34815b = 0;

    static {
        q31.h(new q31());
    }

    public static r31 i(TLRPC.StickerSetCovered stickerSetCovered, yw ywVar, boolean z9) {
        r31 K = r31.K(ix.class);
        long j3 = stickerSetCovered.set.f26979id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.B = j3;
        K.G = stickerSetCovered;
        K.H = ywVar;
        K.f37592e = z9;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ph.b bVar = (ph.b) view;
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((yw) r31Var.H).f40752e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.f53521c.d(document, null, null, null, false, false);
        }
        bVar.a(r31Var.f37592e, false);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (r31Var.B == r31Var2.B && r31Var.f37592e == r31Var2.f37592e) {
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
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.B == r31Var2.B) {
            return true;
        }
        return false;
    }
}
