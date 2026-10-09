package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class bz extends o61 {
    public static final int f25182a = 0;

    static {
        o61.setup(new o61());
    }

    public static p61 a(TLRPC.StickerSetCovered stickerSetCovered, sy syVar, boolean z10) {
        p61 J = p61.J(bz.class);
        long j3 = stickerSetCovered.set.f20065id;
        long j10 = 1 + j3;
        J.d = (int) (j10 ^ (j10 >>> 32));
        J.B = j3;
        J.G = stickerSetCovered;
        J.H = syVar;
        J.f29728e = z10;
        return J;
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        nh.c cVar = (nh.c) view;
        Object obj = p61Var.G;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            cVar.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((sy) p61Var.H).f30951e;
            cVar.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            cVar.f16862c.d(document, null, null, null, false, false);
        }
        cVar.a(p61Var.f29728e, false);
    }

    @Override
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        if (p61Var.B == p61Var2.B && p61Var.f29728e == p61Var2.f29728e) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        nh.c cVar = new nh.c(context, e6Var);
        cVar.setLayoutParams(new s4.q0(AndroidUtilities.dp(64.0f), -1));
        return cVar;
    }

    @Override
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.B == p61Var2.B) {
            return true;
        }
        return false;
    }
}
