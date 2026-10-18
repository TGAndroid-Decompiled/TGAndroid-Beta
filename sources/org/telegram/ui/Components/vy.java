package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class vy extends e61 {
    public static final int f31926a = 0;

    static {
        e61.setup(new e61());
    }

    public static f61 a(TLRPC.StickerSetCovered stickerSetCovered, ky kyVar, boolean z10) {
        f61 J = f61.J(vy.class);
        long j10 = stickerSetCovered.set.f20299id;
        long j11 = 1 + j10;
        J.d = (int) (j11 ^ (j11 >>> 32));
        J.B = j10;
        J.G = stickerSetCovered;
        J.H = kyVar;
        J.e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        oh.c cVar = (oh.c) view;
        Object obj = f61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((ky) f61Var.H).e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f17747c.d(document, null, null, null, false, false);
        }
        cVar.a(f61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        if (f61Var.B == f61Var2.B && f61Var.e == f61Var2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        oh.c cVar = new oh.c(context, d6Var);
        cVar.setLayoutParams(new s4.o0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        if (f61Var.B == f61Var2.B) {
            return true;
        }
        return false;
    }
}
