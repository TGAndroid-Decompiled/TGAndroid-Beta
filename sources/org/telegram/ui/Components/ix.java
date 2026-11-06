package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ix extends v31 {
    public static final int f34778b = 0;

    static {
        v31.h(new v31());
    }

    public static w31 i(TLRPC.StickerSetCovered stickerSetCovered, yw ywVar, boolean z9) {
        w31 K = w31.K(ix.class);
        long j3 = stickerSetCovered.set.f26979id;
        long j10 = 1 + j3;
        K.d = (int) (j10 ^ (j10 >>> 32));
        K.B = j3;
        K.G = stickerSetCovered;
        K.H = ywVar;
        K.f39824e = z9;
        return K;
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        ph.b bVar = (ph.b) view;
        Object obj = w31Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            bVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((yw) w31Var.H).f40771e;
            bVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            bVar.f53546c.d(document, null, null, null, false, false);
        }
        bVar.a(w31Var.f39824e, false);
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        if (w31Var.B == w31Var2.B && w31Var.f39824e == w31Var2.f39824e) {
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
    public final boolean e(w31 w31Var, w31 w31Var2) {
        if (w31Var.B == w31Var2.B) {
            return true;
        }
        return false;
    }
}
